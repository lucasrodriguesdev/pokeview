package br.com.pokeviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.pokeviews.adapter.PokeAdapter
import br.com.pokeviews.const.Layout
import br.com.pokeviews.data.DataSource
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