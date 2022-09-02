package br.com.pokeviews.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import br.com.pokeviews.model.PokemonResponse
import br.com.pokeviews.network.PokemonApi
import kotlinx.coroutines.launch
import java.lang.Exception

class PokemonViewModel : ViewModel() {

    private val _pokemons = MutableLiveData<PokemonResponse>()
    val pokemons: LiveData<PokemonResponse> = _pokemons

    init {
        getPokemons()
    }

    private fun getPokemons() {
        viewModelScope.launch {
            try {
                _pokemons.value = PokemonApi.retrofitService.getPokemons()
            } catch (e: Exception) {
                Log.d("pokemano",e.message.toString())
            }
        }
    }

}