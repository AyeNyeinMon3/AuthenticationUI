package com.example.uidesignthree

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.uidesignthree.databinding.FragmentSigninBinding
//Aung Khant Phyo  fuck u
class SignInFragment:Fragment() {
    private lateinit var binding: FragmentSigninBinding
    private val IMAGE_REQUEST_CODE = 100

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return FragmentSigninBinding.inflate(inflater).also {
            binding = it
        }.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.ivOut.setOnClickListener { view : View ->
            view.findNavController()
                .navigate(SignInFragmentDirections.actionSignInFragmentToLoginFragment())
            Toast.makeText(requireContext(),"Logged out",Toast.LENGTH_LONG).show()
        }

        binding.tvOut.setOnClickListener { view : View ->
            view.findNavController()
                .navigate(SignInFragmentDirections.actionSignInFragmentToLoginFragment())
            Toast.makeText(requireContext(),"Logged out",Toast.LENGTH_LONG).show()
        }

        binding.ivProfilePic.setOnClickListener {
            val intent = Intent(Intent.ACTION_GET_CONTENT)
            intent.type="image/*"
            startActivityForResult(intent,IMAGE_REQUEST_CODE)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode==IMAGE_REQUEST_CODE && resultCode==Activity.RESULT_OK && data?.data !=null){
            val image = data.data
            binding.ivProfilePic.setImageURI(image)
        }
    }
}