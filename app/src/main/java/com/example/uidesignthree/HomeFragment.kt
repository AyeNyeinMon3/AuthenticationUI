package com.example.uidesignthree

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.uidesignthree.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         return FragmentHomeBinding.inflate(inflater).also {
            binding = it
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.ivLogin.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_homeFragment_to_loginFragment)
        )
    }

}