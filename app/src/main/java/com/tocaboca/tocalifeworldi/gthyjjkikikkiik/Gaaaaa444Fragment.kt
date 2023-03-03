package com.tocaboca.tocalifeworldi.gthyjjkikikkiik

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tocaboca.tocalifeworldi.R
import com.tocaboca.tocalifeworldi.btgtgthyhy.Nfjijitg556.hyhy6yh62
import com.tocaboca.tocalifeworldi.btgtgthyhy.BHghuggthtgu
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class Gaaaaa444Fragment : Fragment() {
    val gthgtgthuggt by activityViewModel<BHghuggthtgu>(named("MainModel"))
    val sharePgtgtgt: SharedPreferences by inject(named("SharedPreferences"))
    lateinit var gtgthigthgthugt: String
    private lateinit var mContextgtgtgt: Context

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContextgtgtgt = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_gaaaaa444, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val g5t955gt595gt = sharePgtgtgt.getString(hyhy6yh62, null)
        val hyhyhyhyhy = sharePgtgtgt.getString("appCamp", null)

        if (g5t955gt595gt=="1" &&hyhyhyhyhy == null) {
            gthgtgthuggt.hj2jk2ik2kiik2(mContextgtgtgt)
            gthgtgthuggt.appsData.observe(viewLifecycleOwner) {
                if (it != null) {
                    gtgthigthgthugt = it.toString()
                    sharePgtgtgt.edit().putString("appCamp", gtgthigthgthugt).apply()
                    findNavController().navigate(R.id.action_gaaaaa444Fragment_to_gaaaa555Fragment)
                }
            }
        } else {
            findNavController().navigate(R.id.action_gaaaaa444Fragment_to_gaaaa555Fragment)
        }
    }


}