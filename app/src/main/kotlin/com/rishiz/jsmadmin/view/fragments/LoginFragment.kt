package com.rishiz.jsmadmin.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rishiz.jsmadmin.R
import com.rishiz.jsmadmin.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

private lateinit var binding:FragmentLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding=FragmentLoginBinding.inflate(layoutInflater)
        return binding.root
    }

    companion object {
    }
}