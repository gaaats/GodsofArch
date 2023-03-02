package com.tocaboca.tocalifeworldi.bghyfeded

import android.app.Application
import android.content.pm.PackageManager
import android.webkit.WebSettings
import android.webkit.WebView
import androidx.lifecycle.ViewModel
import com.onesignal.OneSignal
import org.json.JSONException
import org.json.JSONObject

class Hfrhuhhrf(gtjgtjgtigt: Application): ViewModel() {
    val gtgt5gtgt = gtjgtjgtigt.packageManager
    fun gthyjjuiklollo(xcvbb: WebView): WebSettings{
       val bnjjuujujuj = xcvbb.settings
        bnjjuujujuj.javaScriptEnabled = true
        bnjjuujujuj.useWideViewPort = true
        bnjjuujujuj.loadWithOverviewMode = true
        bnjjuujujuj.allowFileAccess = true
        bnjjuujujuj.domStorageEnabled = true
        bnjjuujujuj.userAgentString = bnjjuujujuj.userAgentString.replace("; wv", "")
        bnjjuujujuj.javaScriptCanOpenWindowsAutomatically = true
        bnjjuujujuj.setSupportMultipleWindows(false)
        bnjjuujujuj.displayZoomControls = false
        bnjjuujujuj.builtInZoomControls = true
        bnjjuujujuj.allowFileAccess = true
        bnjjuujujuj.allowContentAccess = true
        bnjjuujujuj.setSupportZoom(true)
        bnjjuujujuj.pluginState = WebSettings.PluginState.ON
        bnjjuujujuj.mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
        bnjjuujujuj.cacheMode = WebSettings.LOAD_DEFAULT
        bnjjuujujuj.allowContentAccess = true
        bnjjuujujuj.mediaPlaybackRequiresUserGesture = false
        return bnjjuujujuj
    }
    fun gtijojji(hj2ju262: String) {
        OneSignal.setExternalUserId(
            hj2ju262,
            object : OneSignal.OSExternalUserIdUpdateCompletionHandler {
                override fun onSuccess(results: JSONObject) {
                    try {
                        if (results.has("push") && results.getJSONObject("push").has("success")) {
                            val hjyujuujju = results.getJSONObject("push").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for push status: $hjyujuujju"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("email") && results.getJSONObject("email").has("success")) {
                            val hy26h26uj26ju26uj =
                                results.getJSONObject("email").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for email status: $hy26h26uj26ju26uj"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                    try {
                        if (results.has("sms") && results.getJSONObject("sms").has("success")) {
                            val bh2hy26uj26ki2ik = results.getJSONObject("sms").getBoolean("success")
                            OneSignal.onesignalLog(
                                OneSignal.LOG_LEVEL.VERBOSE,
                                "Set external user id for sms status: $bh2hy26uj26ki2ik"
                            )
                        }
                    } catch (e: JSONException) {
                        e.printStackTrace()
                    }
                }

                override fun onFailure(error: OneSignal.ExternalIdError) {
                    OneSignal.onesignalLog(
                        OneSignal.LOG_LEVEL.VERBOSE,
                        "Set external user id done with error: $error"
                    )
                }
            })
    }



    fun gt59h95y59ujju5uj59uj(frrfhfiuhgttgu: String): Boolean {
        try {
            gtgt5gtgt.getPackageInfo("org.telegram.messenger", PackageManager.GET_ACTIVITIES)
            return true
        } catch (_: PackageManager.NameNotFoundException) {

        }
        return false
    }
}