package br.com.pokeviews.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.pokeviews.adapter.PokeAdapter
import br.com.pokeviews.const.Layout
import br.com.pokeviews.databinding.ActivityVerticalListBinding

class VerticalListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityVerticalListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerticalListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvVertical.adapter = PokeAdapter(applicationContext, Layout.VERTICAL)

        // Specify fixed size to improve performance
        binding.rvVertical.setHasFixedSize(true)

        // Enable up button for backward navigation
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}