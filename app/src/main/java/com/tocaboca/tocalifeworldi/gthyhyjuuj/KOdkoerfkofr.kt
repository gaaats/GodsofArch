package com.tocaboca.tocalifeworldi.gthyhyjuuj

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.google.gson.Gson
import com.tocaboca.tocalifeworldi.btgtgthyhy.Jifigtjgtjhjhyhyhy
import com.tocaboca.tocalifeworldi.defrgtgtt.Jfrjjigtijgijgtgtjigt
import com.tocaboca.tocalifeworldi.frgtgthy.MKfmrfofrk
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import com.google.gson.GsonBuilder
import com.tocaboca.tocalifeworldi.bghyfeded.Hfrhuhhrf
import com.tocaboca.tocalifeworldi.bghyhyhhy.Njkfjrrfjffr
import com.tocaboca.tocalifeworldi.bnhujujjuuj.MKfkrfkfkorfkorf


fun hyhy5hy59hy5(): Gson {
    return GsonBuilder().create()
}



val hy95hy5hy59hy = module {
    viewModel (named("MainModel")){
        MKfmrfofrk((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        Hfrhuhhrf(get())
    }
}

val xcvvgtgtgtgt = module {

    single  <MKfkrfkfkorfkorf> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(MKfkrfkfkorfkorf::class.java)
    }

    single <Njkfjrrfjffr> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(Njkfjrrfjffr::class.java)
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
        Jfrjjigtijgijgtgtjigt(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        Jifigtjgtjhjhyhyhy(get(named("HostInter")))
    }
    single{
        hyhy5hy59hy5()
    }
    single (named("SharedPreferences")) {
        h26hyhyhy6(androidApplication())
    }
}

fun h26hyhyhy6(app: Application): SharedPreferences {
    return app.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}


