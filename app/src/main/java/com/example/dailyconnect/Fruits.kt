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
import com.example.dailyconnect.databinding.FragmentFruitsBinding
import kotlinx.coroutines.launch
import com.example.dailyconnect.R


class Fruits : Fragment() {
    private var _binding : FragmentFruitsBinding? = null
    private val binding
        get() = checkNotNull(_binding) {
            "Fruits Fragment is null"
        }
    val names = listOf(
        "Apple",
        "Banana",
        "Black Grapes",
        "Green Grapes",
        "Guava",
        "Mango",
        "Oranges",
        "PineApple"
    )
    val pics = listOf(
         R.drawable.apple,
        R.drawable.banana,
        R.drawable.blackgrapes,
        R.drawable.greengrapes,
        R.drawable.guava,
        R.drawable.mango,
        R.drawable.oranges,
        R.drawable.pineapple
    )
    val price = listOf(6.00, 5.00, 3.00, 5.00, 7.00, 6.00, 5.00, 3.00)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFruitsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.fruitsRecyclerView.layoutManager = LinearLayoutManager(context)

        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.lifecycle.repeatOnLifecycle(Lifecycle.State.STARTED) {
                binding.fruitsRecyclerView.adapter = FruitsAdapter( names, pics, price)
            }
        }
    }
}