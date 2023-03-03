package com.tocaboca.tocalifeworldi.gthyhyyh

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.tocaboca.tocalifeworldi.R
import com.tocaboca.tocalifeworldi.btgtgthyhy.Nfjijitg556
import com.tocaboca.tocalifeworldi.btgtgthyhy.Nfjijitg556.bngjgthgthtghgt
import com.tocaboca.tocalifeworldi.btgtgthyhy.Nfjijitg556.ju22uj2uj
import com.tocaboca.tocalifeworldi.btgtgthyhy.BHghuggthtgu
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class Gaaaa3333Fragment : Fragment() {
    val gtgtgtgt by activityViewModel<BHghuggthtgu>(named("MainModel"))
    lateinit var countryDevgtgtgt: String
    lateinit var wvgtgttggt: String
    lateinit var appsgttggtgt: String
    private lateinit var mContextgtgtgt: Context

    val sharePgtgtgt: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContextgtgtgt = context
    }

    private fun gthigthgtih() {
        findNavController().navigate(R.id.action_gaaaa3333Fragment_to_gaaaaa444Fragment)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_gaaaa3333, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        gtgtgtgt.mainId.observe(viewLifecycleOwner) {
            if (it != null) {
                val maingtgtgt = it.toString()
                sharePgtgtgt.edit().putString("mainId", maingtgtgt).apply()
            }
        }

        gtgtgtgt.gtythyhyhy.observe(viewLifecycleOwner) {
            if (it != null) {

                countryDevgtgtgt = it.muenogeeooo
                appsgttggtgt = it.muenonumero
                wvgtgttggt = it.muenolinka

                sharePgtgtgt.edit().putString(ju22uj2uj, countryDevgtgtgt).apply()
                sharePgtgtgt.edit().putString(Nfjijitg556.hyhy6yh62, appsgttggtgt).apply()
                sharePgtgtgt.edit().putString(bngjgthgthtghgt, wvgtgttggt).apply()

                hrfhirfhhrf()
            }
        }
    }

    private fun hrfhirfhhrf() {
        ghtghihtihgt()
    }

    private fun ghtghihtihgt() {
        gthigthgtih()
    }

}