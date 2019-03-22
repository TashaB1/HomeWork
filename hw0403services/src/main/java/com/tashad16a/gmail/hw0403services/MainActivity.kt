package com.tashad16a.gmail.hw0403services

import android.content.Intent
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.tashad16a.gmail.hw0403services.constant.ConstantName
import com.tashad16a.gmail.hw0403services.fragment.LessonInformationFragment
import com.tashad16a.gmail.hw0403services.fragment.LessonSelectionFragment
import com.tashad16a.gmail.hw0403services.service.LessonProgressService
import com.tashad16a.gmail.hw0403services.service.MessageBroadcastReceiver

class MainActivity : AppCompatActivity(), LessonSelectionFragment.OnSelectedButtonListener {

    private var mIntent: Intent? = null
    private val mIntentFilter = IntentFilter(ConstantName.LESSON_PROGRESS)
    private val mReceiver = MessageBroadcastReceiver()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        mIntent = Intent(this, LessonProgressService::class.java)
        findViewById<Button>(R.id.lesson_progress_button)
            .setOnClickListener(View.OnClickListener {
                startService(mIntent)
            })
    }

    override fun onButtonSelected(buttonIndex: Int) {
        val fragmentManager = supportFragmentManager
        val lessonInformationFragment =
            fragmentManager.findFragmentById(R.id.lesson_information_fragment) as LessonInformationFragment

        lessonInformationFragment.setInformation(buttonIndex)
    }

    override fun onPause() {
        super.onPause()

        unregisterReceiver(mReceiver)
    }

    override fun onResume() {
        super.onResume()

        registerReceiver(mReceiver, mIntentFilter)
    }
}
