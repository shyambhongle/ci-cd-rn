package com.rn_pipeline_demo

import android.media.MediaPlayer
import android.media.PlaybackParams
import android.os.Build
import androidx.annotation.RequiresApi
import com.facebook.react.bridge.ReactApplicationContext
import com.facebook.react.bridge.ReactContextBaseJavaModule
import com.facebook.react.bridge.ReactMethod

class VoiceChangingModule(context: ReactApplicationContext) : ReactContextBaseJavaModule(context) {

    override fun getName(): String {
        return "VoiceChangingModule"
    }

    @RequiresApi(Build.VERSION_CODES.M)
    @ReactMethod
    fun changeVoiceToAlien(file: String) {
        val mp = MediaPlayer()
        val playbackParams = PlaybackParams()
        playbackParams.setPitch(0.6f)
        try {
            mp.setDataSource(file)
            mp.prepare()
            mp.setPlaybackParams(playbackParams)
            mp.start()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    @ReactMethod
    fun changeVoiceToChild(file: String) {
        val mp = MediaPlayer()
        val playbackParams = PlaybackParams()
        playbackParams.setPitch(1.8f)
        try {
            mp.setDataSource(file)
            mp.prepare()
            mp.setPlaybackParams(playbackParams)
            mp.start()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    @ReactMethod
    fun speedUpVoice(file: String) {
        val mp = MediaPlayer()
        val playbackParams = PlaybackParams()
        playbackParams.setSpeed(2.5f)
        try {
            mp.setDataSource(file)
            mp.prepare()
            mp.setPlaybackParams(playbackParams)
            mp.start()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    @RequiresApi(Build.VERSION_CODES.M)
    @ReactMethod
    fun slowDownVoice(file: String) {
        val mp = MediaPlayer()
        val playbackParams = PlaybackParams()
        playbackParams.setSpeed(0.4f)
        try {
            mp.setDataSource(file)
            mp.prepare()
            mp.setPlaybackParams(playbackParams)
            mp.start()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}
