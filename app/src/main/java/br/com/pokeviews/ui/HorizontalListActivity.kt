package br.com.pokeviews.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.pokeviews.adapter.PokeAdapter
import br.com.pokeviews.const.Layout
import br.com.pokeviews.databinding.ActivityHorizontalListBinding


class HorizontalListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHorizontalListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHorizontalListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvHorizontal.adapter = PokeAdapter(applicationContext, Layout.HORIZONTAL)

        // Specify fixed size to improve performance
        binding.rvHorizontal.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}