package com.tocaboca.tocalifeworldi.defrgtgtt

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.tocaboca.tocalifeworldi.bghyhyhhy.ApiInterfaceggtgtgt
import com.tocaboca.tocalifeworldi.bghyhyhhy.JOIFJirjrfjjrfjirf
import com.tocaboca.tocalifeworldi.bnhujujjuuj.MKkfmrfrjgtgtjtgi
import com.tocaboca.tocalifeworldi.bnhujujjuuj.JIFjrfijtgjtgjtig
import com.tocaboca.tocalifeworldi.btgtgthyhy.BHghuggthtgu
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

fun provideGsongtgtgtgt(): Gson {
    return GsonBuilder().create()
}



val bgbgnhhy5995uj5ju = module {
    viewModel (named("MainModel")){
        BHghuggthtgu((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        Kkofrkofrokrogt(get())
    }
}

val hhy5hy595hy95hy = module {

    single  <JIFjrfijtgjtgjtig> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(JIFjrfijtgjtgjtig::class.java)
    }

    single <ApiInterfaceggtgtgt> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(ApiInterfaceggtgtgt::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://godsofarch.xyz/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        JOIFJirjrfjjrfjirf(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        MKkfmrfrjgtgtjtgi(get(named("HostInter")))
    }
    single{
        provideGsongtgtgtgt()
    }
    single (named("SharedPreferences")) {
        provideSharedPrefgtgtgtgt(androidApplication())
    }
}

fun provideSharedPrefgtgtgtgt(app: Application): SharedPreferences {
    return app.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}


