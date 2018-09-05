package net.appsynth.basic

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import kotlinx.android.synthetic.main.item_card.view.*

class CardRecyclerViewAdapter : RecyclerView.Adapter<CardViewHolder>() {

    var cardList = mutableListOf("Knight", "Golem", "Baby Dragon", "Wizard")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_card, parent, false)
        return CardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return cardList.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.itemView.apply {
            cardNameTextView.text = cardList[position]
        }
    }
}