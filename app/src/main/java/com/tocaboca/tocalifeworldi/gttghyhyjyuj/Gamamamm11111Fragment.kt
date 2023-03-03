package com.tocaboca.tocalifeworldi.gttghyhyjyuj

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.android.material.snackbar.Snackbar
import com.tocaboca.tocalifeworldi.R
import com.tocaboca.tocalifeworldi.databinding.FragmentGamamamm11111Binding
import kotlin.random.Random


class Gamamamm11111Fragment : Fragment() {

    private val listttt by lazy {
        listOf(
            binding.one,
            binding.tvooo,
            binding.three,
            binding.fffffffour
        )
    }

    fun getVivisble(): Boolean {
        listttt.forEach {
            if (it.visibility == View.VISIBLE) {
                return false
            }
        }
        return true
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            binding.one.setOnClickListener {
                it.isEnabled = false
                val nummm = Random.nextInt(from = 500, until = 1000)
                Toast.makeText(requireContext(), "${nummm} get!", Toast.LENGTH_SHORT).show()
                it.visibility = View.INVISIBLE

                if (getVivisble()) {
                    findNavController().navigate(R.id.action_gamamamm11111Fragment_to_gamamamam2222Fragment)
                }
            }
            binding.tvooo.setOnClickListener {
                it.isEnabled = false
                val nummm = Random.nextInt(from = 500, until = 1000)
                Toast.makeText(requireContext(), "${nummm} get!", Toast.LENGTH_SHORT).show()
                it.visibility = View.INVISIBLE

                if (getVivisble()) {
                    findNavController().navigate(R.id.action_gamamamm11111Fragment_to_gamamamam2222Fragment)
                }
            }
            binding.three.setOnClickListener {
                it.isEnabled = false
                val nummm = Random.nextInt(from = 500, until = 1000)
                Toast.makeText(requireContext(), "${nummm} get!", Toast.LENGTH_SHORT).show()
                it.visibility = View.INVISIBLE

                if (getVivisble()) {
                    findNavController().navigate(R.id.action_gamamamm11111Fragment_to_gamamamam2222Fragment)
                }
            }
            binding.fffffffour.setOnClickListener {
                it.isEnabled = false
                val nummm = Random.nextInt(from = 500, until = 1000)
                Toast.makeText(requireContext(), "${nummm} get!", Toast.LENGTH_SHORT).show()
                it.visibility = View.INVISIBLE

                if (getVivisble()) {
                    findNavController().navigate(R.id.action_gamamamm11111Fragment_to_gamamamam2222Fragment)
                }
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
        fragmentGamamamm11111Binding =
            FragmentGamamamm11111Binding.inflate(inflater, container, false)
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

    private var fragmentGamamamm11111Binding: FragmentGamamamm11111Binding? = null
    private val binding
        get() = fragmentGamamamm11111Binding
            ?: throw RuntimeException("FragmentGamamamm11111Binding = null")


    override fun onPause() {

        onDestroy()
        super.onPause()
    }

    override fun onDestroy() {
        fragmentGamamamm11111Binding = null
        super.onDestroy()
    }
}