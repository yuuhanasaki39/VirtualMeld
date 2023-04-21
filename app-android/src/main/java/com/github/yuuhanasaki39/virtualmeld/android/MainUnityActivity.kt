package com.github.yuuhanasaki39.virtualmeld.android

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.FrameLayout
import com.unity3d.player.UnityPlayerActivity


class MainUnityActivity: UnityPlayerActivity() {
    // Setup activity layout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        addControlsToUnityFrame()
        val intent = intent
        handleIntent(intent)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        handleIntent(intent)
        setIntent(intent)
    }

    fun handleIntent(intent: Intent?) {
        if (intent == null || intent.extras == null) return
        if (intent.extras!!.containsKey("doQuit")) if (mUnityPlayer != null) {
            finish()
        }
    }

    private fun showMainActivity(setToColor: String?) {
        val intent: Intent = Intent(this, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_REORDER_TO_FRONT or Intent.FLAG_ACTIVITY_SINGLE_TOP
        intent.putExtra("setColor", setToColor)
        startActivity(intent)
    }

    override fun onUnityPlayerUnloaded() {
        showMainActivity("")
    }

    private fun addControlsToUnityFrame() {
        val layout: FrameLayout = mUnityPlayer
        run {
            val myButton = Button(this)
            myButton.text = "Show Main"
            myButton.x = 10f
            myButton.y = 500f
            myButton.setOnClickListener { showMainActivity("") }
            layout.addView(myButton, 300, 200)
        }
        run {
            val myButton = Button(this)
            myButton.text = "Send Msg"
            myButton.x = 320f
            myButton.y = 500f
            myButton.setOnClickListener {

            }
            layout.addView(myButton, 300, 200)
        }
        run {
            val myButton = Button(this)
            myButton.text = "Unload"
            myButton.x = 630f
            myButton.y = 500f
            myButton.setOnClickListener { mUnityPlayer.unload() }
            layout.addView(myButton, 300, 200)
        }
        run {
            val myButton = Button(this)
            myButton.text = "Finish"
            myButton.x = 630f
            myButton.y = 800f
            myButton.setOnClickListener { finish() }
            layout.addView(myButton, 300, 200)
        }
    }
}