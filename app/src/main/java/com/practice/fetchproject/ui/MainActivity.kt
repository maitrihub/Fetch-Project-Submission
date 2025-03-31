package com.practice.fetchproject.ui

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.practice.fetchproject.data.GroupedItem
import io.reactivex.android.schedulers.AndroidSchedulers
import com.practice.fetchproject.data.api.RetrofitClient
import com.practice.fetchproject.databinding.ActivityMainBinding
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val disposables = CompositeDisposable()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fetchData()
    }

    private fun fetchData() {
        val disposable: Disposable = RetrofitClient.apiService.getItems()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .map { list ->
                list.filter { !it.name.isNullOrBlank() }
                    .sortedWith(compareBy({ it.listId }, { it.name }))
                    .groupBy { it.listId }
                    .map { GroupedItem(it.key, it.value) }
            }
            .subscribe({ groupedList ->
                binding.recyclerView.apply {
                    layoutManager = LinearLayoutManager(this@MainActivity)
                    adapter = ParentAdapter(groupedList)
                }
            }, {
                error ->
                error.printStackTrace()
                Toast.makeText(this, "Error fetching data, ${error.message}", Toast.LENGTH_SHORT).show()
            })

        disposables.add(disposable)
    }

    override fun onDestroy() {
        super.onDestroy()
        disposables.clear()
    }
}

