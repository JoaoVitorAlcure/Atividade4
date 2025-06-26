package com.example.projetointegrador

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.projetointegrador.databinding.FragmentABinding
import com.example.projetointegrador.databinding.FragmentDBinding


class FragmentD : Fragment() {

    private var _binding: FragmentDBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentDBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initListeners()
    }

    private fun initListeners(){
        binding.buttonLogin.setOnClickListener{
            findNavController().navigate(R.id.action_fragmentD_to_fragmentE) }
        binding.buttonBack.setOnClickListener{
            findNavController().navigateUp() }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}