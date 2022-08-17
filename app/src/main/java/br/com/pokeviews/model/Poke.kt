package br.com.pokeviews.model

import androidx.annotation.DrawableRes

data class Poke(
    @DrawableRes val imageResource: Int,
    val name: String,
    val number: String
)