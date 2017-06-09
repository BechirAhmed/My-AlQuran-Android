package net.radityalabs.myalquran.android

import android.app.Application

/**
 * Created by radityagumay on 5/24/17.
 */
class App : Application() {
    companion object {
        lateinit var instance: App
    }

    init {
        instance = this
    }

    override fun onCreate() {
        super.onCreate()
    }
}