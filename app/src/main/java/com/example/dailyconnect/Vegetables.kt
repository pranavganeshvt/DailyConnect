package com.example.dailyconnect

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dailyconnect.FruitsAdapter
import com.example.dailyconnect.R
import com.example.dailyconnect.databinding.FragmentVegetablesBinding
import kotlinx.coroutines.launch

class Vegetables : Fragment() {
    private var _binding : FragmentVegetablesBinding? = null
    private val binding
        get() = checkNotNull(_binding) {
            "Fruits Fragment is null"
        }
    val names = listOf(
        "Potato",
        "Onion",
        "Tomato",
        "Mirchi",
        "Brinjal"
    )
    val pics = listOf(
        R.drawable.potato,
        R.drawable.onion,
        R.drawable.tomato,
        R.drawable.mirchi,
        R.drawable.brinjal
    )
    val price = listOf(6.00, 5.00, 3.00, 5.00, 7.00)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentVegetablesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.vegetablesRecyclerView.layoutManager = LinearLayoutManager(context)

        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED) {
                binding.vegetablesRecyclerView.adapter = FruitsAdapter( names, pics, price)
            }
        }
    }
}