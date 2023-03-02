package com.tocaboca.tocalifeworldi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.tocaboca.tocalifeworldi.databinding.FragmentGamamamam2222Binding


class Gamamamam2222Fragment : Fragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            binding.top.setOnClickListener {
                Toast.makeText(requireContext(), "Done. Reloading game...", Toast.LENGTH_SHORT).show()
                findNavController().navigate(R.id.action_gamamamam2222Fragment_to_gamamamm11111Fragment)
            }

            binding.center.setOnClickListener {
                Toast.makeText(requireContext(), "Done. Reloading game...", Toast.LENGTH_SHORT).show()
                findNavController().navigate(R.id.action_gamamamam2222Fragment_to_gamamamm11111Fragment)
            }

            binding.dovn.setOnClickListener {
                Toast.makeText(requireContext(), "Done. Reloading game...", Toast.LENGTH_SHORT).show()
                findNavController().navigate(R.id.action_gamamamam2222Fragment_to_gamamamm11111Fragment)
            }



        } catch (e: Exception) {
            vfvvf()
        }

        super.onViewCreated(view, savedInstanceState)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGamamamam2222Binding =
            FragmentGamamamam2222Binding.inflate(inflater, container, false)
        return binding.root
    }


    private fun vfvvf() {
        Snackbar.make(
            binding.root,
            "Some error...",
            Snackbar.LENGTH_LONG
        ).show()
        requireActivity().onBackPressed()
    }

    private var fragmentGamamamam2222Binding: FragmentGamamamam2222Binding? = null
    private val binding
        get() = fragmentGamamamam2222Binding
            ?: throw RuntimeException("FragmentGamamamam2222Binding = null")


    override fun onPause() {

        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        fragmentGamamamam2222Binding = null
        super.onDestroy()
    }
}