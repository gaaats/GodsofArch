package com.tocaboca.tocalifeworldi.bggtgthyhyhy

import android.app.Application
import android.content.Context
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import com.tocaboca.tocalifeworldi.btgtgthyhy.Nfjijitg556.bgngtjgtjgtjigt
import com.tocaboca.tocalifeworldi.btgtgthyhy.Nfjijitg556.bngjgtitghgtg
import com.tocaboca.tocalifeworldi.btgtgthyhy.Nfjijitg556.instIdgttg
import com.tocaboca.tocalifeworldi.btgtgthyhy.Nfjijitg556.vfbrfgfrgrfgrfgyrfgy
import com.tocaboca.tocalifeworldi.defrgtgtt.bgbgnhhy5995uj5ju
import com.tocaboca.tocalifeworldi.defrgtgtt.hhy5hy595hy95hy
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class PopopopoClass:Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        gtjogtjogtjgtjiogt()

        val vfvgffvbbgbg = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val bhyhjyujujuj = getSharedPreferences("PREFS_NAME", 0)

        val hyujujuj = MyTracker.getTrackerParams()
        val gntntggtgtijgtgt = MyTracker.getTrackerConfig()
        val instIDgtgtgt = MyTracker.getInstanceId(this)
        gntntggtgtijgtgt.isTrackingLaunchEnabled = true
        val IDINgtgtgt = UUID.randomUUID().toString()

        if (bhyhjyujujuj.getBoolean("my_first_time", true)) {
            hyujujuj.setCustomUserId(IDINgtgtgt)
            vfvgffvbbgbg.edit().putString(bgngtjgtjgtjigt, IDINgtgtgt).apply()
            vfvgffvbbgbg.edit().putString(instIdgttg, instIDgtgtgt).apply()
            bhyhjyujujuj.edit().putBoolean("my_first_time", false).apply()
        } else {
            val gth5yhyhy5hy = vfvgffvbbgbg.getString(bgngtjgtjgtjigt, IDINgtgtgt)
            hyujujuj.setCustomUserId(gth5yhyhy5hy)
        }
        MyTracker.initTracker(bngjgtitghgtg, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@PopopopoClass)
            modules(
                listOf(
                    bgbgnhhy5995uj5ju, hhy5hy595hy95hy
                )
            )
        }
    }

    private fun gtjogtjogtjgtjiogt() {
        OneSignal.setAppId(vfbrfgfrgrfgrfgyrfgy)
    }



}