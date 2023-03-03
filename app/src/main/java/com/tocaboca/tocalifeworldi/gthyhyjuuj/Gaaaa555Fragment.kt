package com.tocaboca.tocalifeworldi.gthyhyjuuj

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.appsflyer.AppsFlyerLib
import com.tocaboca.tocalifeworldi.vfbyuj.GammamamammumumummjuActivity2
import com.tocaboca.tocalifeworldi.R
import com.tocaboca.tocalifeworldi.vgbgfrfr.VebbgtugtuhgtActivity2
import com.tocaboca.tocalifeworldi.btgtgthyhy.Nfjijitg556.bgngtjgtjgtjigt
import com.tocaboca.tocalifeworldi.btgtgthyhy.Nfjijitg556.bngjgthgthtghgt
import com.tocaboca.tocalifeworldi.btgtgthyhy.Nfjijitg556.bnyojijhyjjhyhy
import com.tocaboca.tocalifeworldi.btgtgthyhy.Nfjijitg556.ju22uj2uj
import com.tocaboca.tocalifeworldi.btgtgthyhy.Nfjijitg556.ghyhy9555
import com.tocaboca.tocalifeworldi.btgtgthyhy.Nfjijitg556.hy62uj26uj2
import com.tocaboca.tocalifeworldi.btgtgthyhy.Nfjijitg556.gthgthugtuugthugt
import com.tocaboca.tocalifeworldi.btgtgthyhy.Nfjijitg556.gthyhjyhyjuuj
import com.tocaboca.tocalifeworldi.btgtgthyhy.Nfjijitg556.gtitghugt
import com.tocaboca.tocalifeworldi.btgtgthyhy.Nfjijitg556.gtntgngtnjgtnj
import com.tocaboca.tocalifeworldi.btgtgthyhy.Nfjijitg556.instIdgttg
import com.tocaboca.tocalifeworldi.btgtgthyhy.Nfjijitg556.hyhy6yh62
import com.tocaboca.tocalifeworldi.btgtgthyhy.Nfjijitg556.onegtgt
import com.tocaboca.tocalifeworldi.btgtgthyhy.Nfjijitg556.trolologttggt
import com.tocaboca.tocalifeworldi.btgtgthyhy.Nfjijitg556.ju26uj2uj26
import com.tocaboca.tocalifeworldi.btgtgthyhy.Nfjijitg556.hy59hy59hy5
import com.tocaboca.tocalifeworldi.btgtgthyhy.Nfjijitg556.vfbhbfryurfgrfrf
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named


class Gaaaa555Fragment : Fragment() {
    private fun rfhihfrhrfhfrhrfhihrf() {
        AppsFlyerLib.getInstance().setCollectAndroidID(true)
    }

    override fun onStart() {
        super.onStart()


        val gtgtgt: String? = shareP.getString(instIdgttg, null)
        val bgnbnbgnbguhbghg = shareP.getString("deepSt", null)
        val hjoihhfrfrgfrrg = shareP.getString(ju22uj2uj, null)
        val hihfhgtgthgt = shareP.getString(hyhy6yh62, null)
        val vbffrygfrrfgrfg = shareP.getString(bngjgthgthtghgt, null)
        val gjgtojgt = shareP.getString(hy62uj26uj2, null)
        val gthgtigthgthgt = bnyojijhyjjhyhy
        val gtojigtjtgjgtjigtj = Build.VERSION.RELEASE
        val cdvdetfedfedffedfed = shareP.getString(bgngtjgtjgtjigt, null)
        val gthutguhugthgtgtgt = shareP.getString("appCamp", null)
        val bngngughgthugt = shareP.getString("mainId", null)

        val fhrirfurfuhrf = Intent(activity, VebbgtugtuhgtActivity2::class.java)
        val vfbfryrfgfrgfgrgfrrfrf = Intent(activity, GammamamammumumummjuActivity2::class.java)

        val afIdhyhyhy = AppsFlyerLib.getInstance().getAppsFlyerUID(mContext)
        rfhihfrhrfhfrhrfhihrf()

        shareP.edit().putString(gtntgngtnjgtnj, afIdhyhyhy).apply()

        val gngnufhhth =
            "$vbffrygfrrfgrfg$ju26uj2uj26$gthutguhugthgtgtgt&$onegtgt$afIdhyhyhy&$vfbhbfryurfgrfrf$bngngughgthugt&$gthgthugtuugthugt$gthgtigthgthgt&$hy59hy59hy5$gtojigtjtgjgtjigtj&$ghyhy9555$gthyhjyhyjuuj"
        val cdvedtdeffdeed =
            "$vbffrygfrrfgrfg$onegtgt$cdvdetfedfedffedfed&$vfbhbfryurfgrfrf$gtgtgt&$gthgthugtuugthugt$gthgtigthgthgt&$hy59hy59hy5$gtojigtjtgjgtjigtj&$ghyhy9555$gthyhjyhyjuuj"
        val vbyrfgrfrfg =
            "$vbffrygfrrfgrfg$ju26uj2uj26$bgnbnbgnbguhbghg&$onegtgt$afIdhyhyhy&$vfbhbfryurfgrfrf$bngngughgthugt&$gthgthugtuugthugt$gthgtigthgthgt&$hy59hy59hy5$gtojigtjtgjgtjigtj&$ghyhy9555$trolologttggt"
        val bmgjhyjhyjojihy =
            "$vbffrygfrrfgrfg$ju26uj2uj26$bgnbnbgnbguhbghg&$onegtgt$cdvdetfedfedffedfed&$vfbhbfryurfgrfrf$gtgtgt&$gthgthugtuugthugt$gthgtigthgthgt&$hy59hy59hy5$gtojigtjtgjgtjigtj&$ghyhy9555$trolologttggt"

        when (hihfhgtgthgt) {
            "1" ->
                if (gthutguhugthgtgtgt != "null") {
                    shareP.edit().putString(gtitghugt, gngnufhhth).apply()
                    shareP.edit().putString("WebInt", "campaign").apply()
                    startActivity(fhrirfurfuhrf)
                    activity?.finish()
                } else if (bgnbnbgnbguhbghg != null || hjoihhfrfrgfrrg!!.contains(gjgtojgt.toString())) {
                    shareP.edit().putString(gtitghugt, vbyrfgrfrfg).apply()
                    shareP.edit().putString("WebInt", "deepLink").apply()
                    startActivity(fhrirfurfuhrf)
                    activity?.finish()
                } else {
                    startActivity(vfbfryrfgfrgfgrgfrrfrf)
                    activity?.finish()
                }
            "0" ->
                if (bgnbnbgnbguhbghg != null) {
                    shareP.edit().putString(gtitghugt, bmgjhyjhyjojihy).apply()
                    shareP.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(fhrirfurfuhrf)
                    activity?.finish()
                } else if (hjoihhfrfrgfrrg!!.contains(gjgtojgt.toString())) {
                    shareP.edit().putString(gtitghugt, cdvedtdeffdeed).apply()
                    shareP.edit().putString("WebInt", "geo").apply()
                    startActivity(fhrirfurfuhrf)
                    activity?.finish()
                } else {
                    startActivity(vfbfryrfgfrgfgrgfrrfrf)
                    activity?.finish()
                }
        }
    }

    private lateinit var mContext: Context
    val shareP: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mContext = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_gaaaa555, container, false)
    }
}