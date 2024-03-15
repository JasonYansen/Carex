package com.example.car

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView

class RecAdapter(private val carList: ArrayList<Car>) : RecyclerView.Adapter<RecAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imgTitle = itemView.findViewById<ImageView>(R.id.imgTitle)
        val tvName = itemView.findViewById<TextView>(R.id.tvName)
//        val tving = itemView.findViewById<TextView>(R.id.tvIng)
        val constraint_row : ConstraintLayout = itemView.findViewById(R.id.constraint_row)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = carList[position]

        holder.imgTitle.setImageResource(currentItem.imageTitle)
        holder.tvName.text = currentItem.name
//        holder.tving.text = currentItem.description

        val cont = holder.constraint_row.context
        holder.constraint_row.setOnClickListener{
            val intent = Intent(it.context, SecondActivity::class.java)

            intent.putExtra("image", currentItem.imageTitle)
            intent.putExtra("title", currentItem.name)
            intent.putExtra("description", currentItem.description)

            it.context.startActivity(intent)

            Toast.makeText(cont, "The Car ${currentItem.name} is clicked", Toast.LENGTH_SHORT).show()
        }

        holder.constraint_row.setOnLongClickListener(View.OnLongClickListener {
            Toast.makeText(cont, "The Car ${currentItem.name} is clicked", Toast.LENGTH_SHORT).show()

            return@OnLongClickListener true
        })
    }

    override fun getItemCount(): Int {
        return carList.size
    }


}