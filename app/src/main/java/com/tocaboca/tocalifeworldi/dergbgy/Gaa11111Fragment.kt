package com.tocaboca.tocalifeworldi.dergbgy

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tocaboca.tocalifeworldi.R


class Gaa11111Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_gaa11111, container, false)
    }

    private lateinit var hyhyhyhy: Context


    override fun onAttach(context: Context) {
        super.onAttach(context)
        hyhyhyhy=context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rhhfrhfrhrfgyfrygfrg()

    }

    private fun rhhfrhfrhrfgyfrygfrg() {
        ghgthigtitihgt()
    }

    private fun ghgthigtitihgt() {
        hgtihgthigthgt()
    }

    private fun hgtihgthigthgt() {
        findNavController().navigate(R.id.action_gaa11111Fragment_to_gaaaa222Fragment)
    }
}