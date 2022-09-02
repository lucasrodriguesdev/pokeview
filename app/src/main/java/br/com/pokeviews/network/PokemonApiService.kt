package br.com.pokeviews.network

import br.com.pokeviews.model.PokemonResponse
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import retrofit2.http.GET

private const val BASE_URL: String = "https://pokeapi.co/api/v2/"

    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()

    private val retrofit = Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create(moshi))
        .baseUrl(BASE_URL)
        .build()

interface PokemonApiService{

    @GET("pokemon?limit=100000&offset=0")
    suspend fun getPokemons(): PokemonResponse
}

object PokemonApi {
    val retrofitService: PokemonApiService by lazy {
        retrofit.create(PokemonApiService::class.java)
    }
}
