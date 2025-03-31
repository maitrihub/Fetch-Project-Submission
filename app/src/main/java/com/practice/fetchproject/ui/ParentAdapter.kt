package com.practice.fetchproject.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.practice.fetchproject.data.GroupedItem
import com.practice.fetchproject.databinding.ItemChildBinding
import com.practice.fetchproject.databinding.ItemContainerBinding

class ParentAdapter(private val groupedItems: List<GroupedItem>) :
    RecyclerView.Adapter<ParentAdapter.ParentViewHolder>() {

    inner class ParentViewHolder(val binding: ItemContainerBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ParentViewHolder {
        val binding =
            ItemContainerBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ParentViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ParentViewHolder, position: Int) {
        val group = groupedItems[position]
        holder.binding.listId.text = "List ID: ${group.listId}"

        // Setup inner RecyclerView
        holder.binding.childRecyclerView.apply {
            layoutManager = GridLayoutManager(context, 4)
            adapter = ChildAdapter(group.items)
        }
    }

    override fun getItemCount(): Int = groupedItems.size
}