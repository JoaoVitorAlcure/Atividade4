package com.example.projetointegrador

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.projetointegrador.databinding.FragmentEBinding
import com.example.projetointegrador.databinding.FragmentFBinding
import com.example.projetointegrador.databinding.FragmentGBinding

class FragmentG : Fragment() {
    private var _binding: FragmentGBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentGBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initListeners()
    }

    private fun initListeners(){
        binding.buttonBack.setOnClickListener{
            findNavController().navigateUp() }
        binding.buttonBack.setOnClickListener {
            findNavController().navigateUp()
        }
    }
}