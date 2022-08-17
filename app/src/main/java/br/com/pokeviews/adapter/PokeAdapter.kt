package br.com.pokeviews.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.com.pokeviews.R
import br.com.pokeviews.const.Layout
import br.com.pokeviews.data.DataSource
import br.com.pokeviews.model.Poke

class PokeAdapter(
    private val context: Context,
    private val layout: Int
) : RecyclerView.Adapter<PokeAdapter.PokeViewHolder>() {

    private val listaPokemon = DataSource.pokemons

    class PokeViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvNumer: TextView = view.findViewById(R.id.pokemon_number)
        val tvName: TextView = view.findViewById(R.id.pokemon_name)
        val imgPoke: ImageView = view.findViewById(R.id.pokemon_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokeViewHolder {
        lateinit var adapterLayout: View
        when (layout) {
            Layout.GRID -> adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.pokemon_grid_item_list, parent, false)
            else -> adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.pokemon_item_list, parent, false)
        }

        return PokeViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: PokeViewHolder, position: Int) {
        val item = listaPokemon[position]
        holder.imgPoke.setImageResource(item.imageResource)
        holder.tvNumer.text = item.number
        holder.tvName.text = item.name
    }

    override fun getItemCount() = listaPokemon.size
}