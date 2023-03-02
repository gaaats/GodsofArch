package com.tocaboca.tocalifeworldi

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import com.tocaboca.tocalifeworldi.frgtgthy.MKfmrfofrk
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tocaboca.tocalifeworldi.dergbgy.Odfkrfokofrkorf.gtgthtghgthugt



class Gaaaa222Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_gaaaa222, container, false)
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        gtjgtigtjgtj = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        Log.d("lolo", "Gaaaa222Fragment")
        Log.d("lolo", "Gaaaa222Fragment model $gtjiogtjgtjijgt")
        higthigtihgthgthgthgt()
    }

    private fun gthigthihhigthigt() {
        frrfhfrhihfhrfh()
    }

    private fun frrfhfrhihfhrfh() {
        rkgtkogkgtogtkogtkogt()
    }

    private fun rkgtkogkgtogtkogtkogt() {
        findNavController().navigate(R.id.action_gaaaa222Fragment_to_gaaaa3333Fragment)
    }

    private lateinit var gtjgtigtjgtj: Context


    val gtjgtjogtjgti: SharedPreferences by inject(named("SharedPreferences"))
    val gtjiogtjgtjijgt by activityViewModel<MKfmrfofrk>(named("MainModel"))

    lateinit var gthguthgthugt: String

    private fun higthigtihgthgthgthgt() {
        gtjiogtjgtjijgt.nknvngthutghih.observe(viewLifecycleOwner) {
            if (it != null) {
                gthguthgthugt = it.gtjiohy2hy2hytjiogtji
                gtjgtjogtjgti.edit().putString(gtgthtghgthugt, gthguthgthugt).apply()
                gthigthihhigthigt()
            }
        }
    }

}