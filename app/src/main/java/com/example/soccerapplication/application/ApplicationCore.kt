package com.example.soccerapplication.application

import android.app.Application

class ApplicationCore : Application() {

    override fun onCreate() {
        super.onCreate()
        ApplicationCore.instance = this
    }

    companion object {
        var instance: ApplicationCore? = null
            private set
    }
}
