package com.practice.fetchproject.network

import com.practice.fetchproject.data.Item
import io.reactivex.Observable
import retrofit2.http.GET

interface ApiService {
    @GET("hiring.json")
    fun getItems():Observable<List<Item>>
}