package com.tocaboca.tocalifeworldi

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import com.tocaboca.tocalifeworldi.dergbgy.Odfkrfokofrkorf.tghy5h59hy59hy
import com.tocaboca.tocalifeworldi.frgtgthy.MKfmrfofrk
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController



class Gaaaaa444Fragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_gaaaaa444, container, false)
    }

    val gthgtgthuggt by activityViewModel<MKfmrfofrk>(named("MainModel"))
    val sharePgtgtgt: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var gtgthigthgthugt: String
    private lateinit var mContextgtgtgt: Context

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContextgtgtgt = context
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("lolo", "Gaaaa4444Fragment")
        val g5t955gt595gt = sharePgtgtgt.getString(tghy5h59hy59hy, null)
        val hg5hy59hyhy59hy = sharePgtgtgt.getString("appCamp", null)

        if (g5t955gt595gt=="1" &&hg5hy59hyhy59hy == null) {
            gthgtgthuggt.gtthyhyhy(mContextgtgtgt)
            gthgtgthuggt.hghyhyhyhyhy.observe(viewLifecycleOwner) {
                if (it != null) {
                    gtgthigthgthugt = it.toString()
                    sharePgtgtgt.edit().putString("appCamp", gtgthigthgthugt).apply()
                    gtjiogtjigtjijigt()
                }
            }
        } else {
            gtjiogtjigtjijigt()
        }
    }

    private fun gtjiogtjigtjijigt() {
        findNavController().navigate(R.id.action_gaaaaa444Fragment_to_gaaaa555Fragment)
    }

}