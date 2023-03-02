package com.tocaboca.tocalifeworldi

import android.content.Context
import android.content.Intent
import android.net.Uri
import com.tocaboca.tocalifeworldi.databinding.ActivityVebbgtugtuhgt2Binding
import com.tocaboca.tocalifeworldi.dergbgy.Odfkrfokofrkorf.gthy95hyhy59hy
import com.tocaboca.tocalifeworldi.dergbgy.Odfkrfokofrkorf.hy59hy95hyhy5
import com.tocaboca.tocalifeworldi.dergbgy.Odfkrfokofrkorf.hy59hy59hy59hy
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.qualifier.named
import java.io.File
import java.io.IOException
import java.text.SimpleDateFormat
import java.util.*
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.provider.MediaStore
import android.util.Log
import android.webkit.*
import android.widget.Toast
import com.tocaboca.tocalifeworldi.bghyfeded.Hfrhuhhrf


class VebbgtugtuhgtActivity2 : AppCompatActivity() {


    inner class Nfrnfrnrf : WebViewClient() {
        override fun shouldOverrideUrlLoading(view: WebView?, url: String): Boolean {
            try {
                if (URLUtil.isNetworkUrl(url)) {
                    return false
                }
                if (h59h59hy5hyhy.gt59h95y59ujju5uj59uj(url)) {

                    val hy95hy59hy59ju2uj23 = Intent(Intent.ACTION_VIEW)
                    hy95hy59hy59ju2uj23.data = Uri.parse(url)
                    startActivity(hy95hy59hy59ju2uj23)
                } else {

                    Toast.makeText(
                        applicationContext,
                        "Application is not installed",
                        Toast.LENGTH_LONG
                    ).show()
                    startActivity(
                        Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/details?id=org.telegram.messenger")
                        )
                    )
                }
                return true
            } catch (e: Exception) {
                return false
            }
        }

        override fun onPageFinished(view: WebView?, url: String?) {
            super.onPageFinished(view, url)
            hyhylphypkohyhy(url)
        }


        override fun onReceivedError(
            view: WebView?,
            errorCode: Int,
            description: String?,
            failingUrl: String?
        ) {
            Toast.makeText(this@VebbgtugtuhgtActivity2, description, Toast.LENGTH_SHORT).show()
        }
    }



    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        if (requestCode != hy26hy26hy2hy || gtntnhyhyhy == null) {
            super.onActivityResult(requestCode, resultCode, data)
            return
        }
        var hy5hy59y9uj59uj: Array<Uri>? = null

        if (resultCode == RESULT_OK) {
            if (data == null) {
                if (hy5hy59hy95hy != null) {
                    hy5hy59y9uj59uj = arrayOf(Uri.parse(hy5hy59hy95hy))
                }
            } else {
                val gt5gt5gt5gt = data.dataString
                if (gt5gt5gt5gt != null) {
                    hy5hy59y9uj59uj = arrayOf(Uri.parse(gt5gt5gt5gt))
                }
            }
        }
        gtntnhyhyhy!!.onReceiveValue(hy5hy59y9uj59uj)
        gtntnhyhyhy = null
        return
    }




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        hy26hy26hyhy = ActivityVebbgtugtuhgt2Binding.inflate(layoutInflater)
        beamgttggt = WebView(this)
        setContentView(beamgttggt)
        CookieManager.getInstance().setAcceptCookie(true)
        CookieManager.getInstance().setAcceptThirdPartyCookies(beamgttggt, true)
        h59h59hy5hyhy.gthyjjuiklollo(beamgttggt)

        beamgttggt.webViewClient = Nfrnfrnrf()
        beamgttggt.webChromeClient = IFhrfrfgyrfgfrggrfyrf()
        beamgttggt.loadUrl(ururururururururgtthyhyhy())
    }

    private lateinit var hy26hy26hyhy: ActivityVebbgtugtuhgt2Binding
    lateinit var beamgttggt: WebView
    private var gtntnhyhyhy: ValueCallback<Array<Uri>>? = null
    private var hy5hy59hy95hy: String? = null
    private val hy26hy26hy2hy = 1

    private val h59h59hy5hyhy by viewModel<Hfrhuhhrf>(
        named("BeamModel")
    )


    inner class IFhrfrfgyrfgfrggrfyrf : WebChromeClient() {

        override fun onShowFileChooser(
            view: WebView?,
            filePath: ValueCallback<Array<Uri>>?,
            fileChooserParams: FileChooserParams?
        ): Boolean {
            gtntnhyhyhy?.onReceiveValue(null)
            gtntnhyhyhy = filePath
            var gttgkogtkogtkogt: Intent? = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            if (gttgkogtkogtkogt!!.resolveActivity(packageManager) != null) {
                var photoFile: File? = null
                try {
                    photoFile = hy26hy2hy6hyhy()
                    gttgkogtkogtkogt.putExtra("PhotoPath", hy5hy59hy95hy)
                } catch (ex: IOException) {
                    Log.e("ErrorOccurred", "Unable to create Image File", ex)
                }

                if (photoFile != null) {
                    hy5hy59hy95hy = "file:" + photoFile.absolutePath
                    gttgkogtkogtkogt.putExtra(
                        MediaStore.EXTRA_OUTPUT,
                        Uri.fromFile(photoFile)
                    )
                } else {
                    gttgkogtkogtkogt = null
                }
            }
            val hy26hy26hyhy = Intent(Intent.ACTION_GET_CONTENT)
            hy26hy26hyhy.addCategory(Intent.CATEGORY_OPENABLE)
            hy26hy26hyhy.type = "image/*"
            val h5995ju9ujuj: Array<Intent?> =
                gttgkogtkogtkogt?.let { arrayOf(it) } ?: arrayOfNulls(0)
            val hy5hy5999 = Intent(Intent.ACTION_CHOOSER)
            hy5hy5999.putExtra(Intent.EXTRA_INTENT, hy26hy26hyhy)
            hy5hy5999.putExtra(Intent.EXTRA_TITLE, "Image Chooser")
            hy5hy5999.putExtra(Intent.EXTRA_INITIAL_INTENTS, h5995ju9ujuj)
            startActivityForResult(hy5hy5999, hy26hy26hy2hy)
            return true
        }

        fun hy26hy2hy6hyhy(): File? {
            val gt5gt5gt5 = SimpleDateFormat("yyyyMMdd_HHmmss").format(Date())
            val g2hy5hy5hy = "JPEG_" + gt5gt5gt5 + "_"
            val gt59gt59gt = Environment.getExternalStoragePublicDirectory(
                Environment.DIRECTORY_PICTURES
            )
            return File.createTempFile(
                g2hy5hy5hy,
                ".jpg",
                gt59gt59gt
            )
        }
    }

    var urlfifififgttggtgt = ""
    fun hyhylphypkohyhy(bgbg5: String?) {
        if (!bgbg5!!.contains("t.me")) {

            if (urlfifififgttggtgt == "") {
                urlfifififgttggtgt = getSharedPreferences(
                    "SP_WEBVIEW_PREFS",
                    MODE_PRIVATE
                ).getString(
                    "SAVED_URL",
                    bgbg5
                ).toString()

                val spspspspsppspspsp = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)
                val ededededededed = spspspspsppspspsp.edit()
                ededededededed.putString("SAVED_URL", bgbg5)
                ededededededed.apply()
            }
        }
    }


    private var exitexitexitexitgttggt = false
    override fun onBackPressed() {

        if (beamgttggt.canGoBack()) {
            if (exitexitexitexitgttggt) {
                beamgttggt.stopLoading()
                beamgttggt.loadUrl(urlfifififgttggtgt)
            }
            this.exitexitexitexitgttggt = true
            beamgttggt.goBack()
            Handler(Looper.getMainLooper()).postDelayed({
                exitexitexitexitgttggt = false
            }, 2000)

        } else {
            super.onBackPressed()
        }
    }

    private fun ururururururururgtthyhyhy(): String {

        val gt5hy5hyhy9hy = getSharedPreferences("SP_WEBVIEW_PREFS", MODE_PRIVATE)

        val hy5hy5hy59hy = getSharedPreferences(
            "SHARED_PREF",
            Context.MODE_PRIVATE
        )

        val hyhyh5 = hy5hy5hy59hy.getString(hy59hy95hyhy5, null)
        Log.d("lolo", hyhyh5.toString())
        Toast.makeText(this, "${hyhyh5}", Toast.LENGTH_SHORT).show()

        val j59uj5ju5ik5ik = hy5hy5hy59hy.getString(hy59hy59hy59hy, null)
        val ju559ki995ik = hy5hy5hy59hy.getString(gthy95hyhy59hy, null)


        when (hy5hy5hy59hy.getString("WebInt", null)) {
            "campaign" -> {
                h59h59hy5hyhy.gtijojji(ju559ki995ik.toString())
            }
            "deepLink" -> {
                h59h59hy5hyhy.gtijojji(ju559ki995ik.toString())
            }
            "deepLinkNOApps" -> {
                h59h59hy5hyhy.gtijojji(j59uj5ju5ik5ik.toString())
            }
            "geo" -> {
                h59h59hy5hyhy.gtijojji(j59uj5ju5ik5ik.toString())
            }
        }


        return gt5hy5hyhy9hy.getString("SAVED_URL", hyhyh5).toString()
    }
}