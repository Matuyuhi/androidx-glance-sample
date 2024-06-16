package com.matuyuhi.sample.glance

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import me.sargunvohra.lib.pokekotlin.client.PokeApiClient

class MainViewModel(): ViewModel() {
    fun fetch() {
        // fetch data
        viewModelScope.launch {
            fetchData()
        }
    }

    private suspend fun fetchData() {
        withContext(Dispatchers.IO) {
            val client = PokeApiClient()
            val list = client.getPokemonSpeciesList(0, 20)
            println(list)
        }
    }
}