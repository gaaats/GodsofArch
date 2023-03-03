package com.tocaboca.tocalifeworldi.frgtgthy

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tocaboca.tocalifeworldi.R
import com.tocaboca.tocalifeworldi.btgtgthyhy.Nfjijitg556.hy62uj26uj2
import com.tocaboca.tocalifeworldi.btgtgthyhy.BHghuggthtgu
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class Gaaaa222Fragment : Fragment() {
    private fun gthigthihhigthigt() {
        frrfhfrhihfhrfh()
    }

    private fun frrfhfrhihfhrfh() {
        findNavController().navigate(R.id.action_gaaaa222Fragment_to_gaaaa3333Fragment)
    }

    private lateinit var gtjgtigtjgtj: Context


    val gtjgtjogtjgti: SharedPreferences by inject(named("SharedPreferences"))
    val gtjiogtjgtjijgt by activityViewModel<BHghuggthtgu>(named("MainModel"))

    lateinit var gthguthgthugt: String

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

        higthigtihgthgthgthgt()
    }

    private fun higthigtihgthgthgthgt() {
        gtjiogtjgtjijgt.nknvngthutghih.observe(viewLifecycleOwner) {
            if (it != null) {
                gthguthgthugt = it.gthyhyhyyh
                gtjgtjogtjgti.edit().putString(hy62uj26uj2, gthguthgthugt).apply()
                gthigthihhigthigt()
            }
        }
    }

}