package com.example.uidesignthree

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.uidesignthree.databinding.FragmentLoginBinding

class LoginFragment:Fragment() {

    lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentLoginBinding.inflate(inflater).also {
            binding = it
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.tvSingup.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_loginFragment_to_signupFragment)
        )
        binding.btn.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_loginFragment_to_signInFragment)
        )
        binding.ivFacebook.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/"))
            startActivity(intent)
        }
        binding.ivGoogle.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://myaccount.google.com/"))
            startActivity(intent)
        }
    }
}