package com.tashad16a.gmail.hw0603ui

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tashad16a.gmail.hw0603_ui.R
import com.tashad16a.gmail.hw0603ui.uigooglepodcasts.GooglePodcastsActivity
import com.tashad16a.gmail.hw0603ui.uivkprofilepage.VKProfilePageActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        fun openUI(ActivityClass: Class<out Activity>) {
            startActivity(Intent(this, ActivityClass))
        }

        findViewById<View>(R.id.ui_vk_profile_page_root_view).setOnClickListener {
            openUI(VKProfilePageActivity::class.java)
        }

        findViewById<View>(R.id.ui_google_podcasts_root_view).setOnClickListener {
            openUI(GooglePodcastsActivity::class.java)
        }
    }
}





