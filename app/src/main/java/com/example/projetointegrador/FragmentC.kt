package com.example.projetointegrador

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.projetointegrador.databinding.FragmentBBinding
import com.example.projetointegrador.databinding.FragmentCBinding

class FragmentC : Fragment() {

    private var _binding: FragmentCBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initListeners()
    }

    private fun initListeners() {
        binding.btnForgotPassword.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentC_to_fragmentD)
        }
        binding.buttonBack.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}