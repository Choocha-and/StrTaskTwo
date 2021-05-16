package com.example.giphy2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.giphy.sdk.analytics.GiphyPingbacks.context
import com.giphy.sdk.ui.Giphy
import com.giphy.sdk.ui.views.GiphyDialogFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Giphy.configure(this, "H8R6y7fPBV61OFOSuPtrGz7ImyUOgVeD")

        GiphyDialogFragment.newInstance().show(supportFragmentManager, "giphy_dialog")
    }
}