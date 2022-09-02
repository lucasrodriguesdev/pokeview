package br.com.pokeviews

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import br.com.pokeviews.adapter.PokeAdapter
import br.com.pokeviews.const.Layout
import br.com.pokeviews.databinding.ActivityGridListBinding
import br.com.pokeviews.ui.PokemonViewModel

class GridListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGridListBinding

    private val viewModel: PokemonViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGridListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvGrid.adapter = PokeAdapter(applicationContext, Layout.GRID)

        // Specify fixed size to improve performance
        binding.rvGrid.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}