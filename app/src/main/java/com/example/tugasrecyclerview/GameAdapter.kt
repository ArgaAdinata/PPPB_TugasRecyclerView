package com.example.tugasrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tugasrecyclerview.databinding.ItemGameBinding
import com.bumptech.glide.Glide

typealias OnClickGame = (Game) -> Unit

class GameAdapter(private val listGame: List<Game>,
    private val onClick: OnClickGame) :
    RecyclerView.Adapter<GameAdapter.itemGameViewHolder>() {

    inner class itemGameViewHolder(private val binding: ItemGameBinding) :
        RecyclerView.ViewHolder(binding.root) {
            fun bind(data: Game) {
                with(binding) {
                    txtName.text = data.nameGame
                    Glide.with(imgGame.context)
                        .load(data.image)
                        .into(imgGame)

                    itemView.setOnClickListener {
                        onClick(data)
                    }
                }
            }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): itemGameViewHolder {
        val binding = ItemGameBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return itemGameViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return listGame.size
    }

    override fun onBindViewHolder(holder: itemGameViewHolder, position: Int) {
        holder.bind(listGame[position])
    }
}