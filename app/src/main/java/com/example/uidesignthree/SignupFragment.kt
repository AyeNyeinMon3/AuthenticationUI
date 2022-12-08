package com.example.uidesignthree

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.uidesignthree.databinding.FragmentSignupBinding

class SignupFragment:Fragment() {
    lateinit var binding : FragmentSignupBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentSignupBinding.inflate(inflater).also {
            binding = it
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnSignup.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_signupFragment_to_signInFragment)
        )
    }
}