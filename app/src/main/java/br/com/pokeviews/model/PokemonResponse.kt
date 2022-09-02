package br.com.pokeviews.model

import com.squareup.moshi.Json

data class PokemonResponse(
   @Json(name = "results")val results: List<Pokemon>
)