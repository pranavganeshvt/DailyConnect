package com.example.dailyconnect

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dailyconnect.databinding.ListItemFruitsBinding
import com.google.android.material.snackbar.Snackbar


class FruitsAdapter(
    private val names: List<String>,
    private val pics: List<Int>,
    private val price: List<Double>
) : RecyclerView.Adapter<FruitsHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitsHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding: ListItemFruitsBinding = ListItemFruitsBinding.inflate(inflater, parent, false)
        return FruitsHolder(binding)
    }

    override fun getItemCount(): Int {
        return names.size
    }

    override fun onBindViewHolder(holder: FruitsHolder, position: Int) {
        holder.bind(names[position], pics[position], price[position])
    }

}

class FruitsHolder(private val binding : ListItemFruitsBinding) : RecyclerView.ViewHolder(binding.root) {
    var count = 1
    fun bind(name: String, image: Int, price: Double) {
        binding.name.setText(name)
        binding.imageView.setImageResource(image)
        binding.amount.setText(price.toString())

        binding.addButton.setOnClickListener {
            count += 1
            binding.quantity.setText(""+count+" lb")
            binding.amount.setText((count*price).toString())
        }

        binding.minusButton.setOnClickListener {
            if (count == 0) {
                Snackbar.make(it, "Please add valid quantity!!!", Snackbar.LENGTH_SHORT).show()
            } else {
                count -= 1
                binding.quantity.setText("" + count + " lb")
                binding.amount.setText((count * price).toString())
            }
        }

        binding.cartButton.setOnClickListener {
            if (count == 0) {
                Snackbar.make(it, "Please add valid quantity!!!", Snackbar.LENGTH_SHORT).show()
            } else {
                Snackbar.make(it, "Added to cart successfully!!!", Snackbar.LENGTH_SHORT).show()
            }
        }

    }
}


