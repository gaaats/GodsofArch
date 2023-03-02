package com.tocaboca.tocalifeworldi.bggtgthyhyhy

import android.app.Application
import android.content.Context
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import com.tocaboca.tocalifeworldi.dergbgy.Odfkrfokofrkorf.hhy5h559hy
import com.tocaboca.tocalifeworldi.dergbgy.Odfkrfokofrkorf.vfbrfgfrgrfgrfgyrfgy
import com.tocaboca.tocalifeworldi.gthyhyjuuj.hy95hy5hy59hy
import com.tocaboca.tocalifeworldi.gthyhyjuuj.xcvvgtgtgtgt
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

import com.tocaboca.tocalifeworldi.dergbgy.Odfkrfokofrkorf.hy59hy59hy59hy
import com.tocaboca.tocalifeworldi.dergbgy.Odfkrfokofrkorf.instIdgttg

class PopopopoClass:Application() {

    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        hyj2ju26ju62uj()

        val gjgitigtigt = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val frogtkkt = getSharedPreferences("PREFS_NAME", 0)

        val hju5ju5uj9 = MyTracker.getTrackerParams()
        val hy5ju59 = MyTracker.getTrackerConfig()
        val ju5k5ilool = MyTracker.getInstanceId(this)
        hy5ju59.isTrackingLaunchEnabled = true
        val vfvbgbghyhy = UUID.randomUUID().toString()

        if (frogtkkt.getBoolean("my_first_time", true)) {
            hju5ju5uj9.setCustomUserId(vfvbgbghyhy)
            gjgitigtigt.edit().putString(hy59hy59hy59hy, vfvbgbghyhy).apply()
            gjgitigtigt.edit().putString(instIdgttg, ju5k5ilool).apply()
            frogtkkt.edit().putBoolean("my_first_time", false).apply()
        } else {
            val hy59hy5995jju = gjgitigtigt.getString(hy59hy59hy59hy, vfvbgbghyhy)
            hju5ju5uj9.setCustomUserId(hy59hy5995jju)
        }
        MyTracker.initTracker(hhy5h559hy, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@PopopopoClass)
            modules(
                listOf(
                    hy95hy5hy59hy, xcvvgtgtgtgt
                )
            )
        }
    }

    private fun hyj2ju26ju62uj() {
        OneSignal.setAppId(vfbrfgfrgrfgrfgyrfgy)
    }
}