package com.tashad16a.gmail.hw0403services.service

import android.app.Service
import android.content.Intent
import android.os.IBinder

class LessonProgressService : Service() {

    val LESSON_PROGRESS = "com.tashad16a.gmail.action.FILTER"
    val MESSAGE_START = "Идет загрузка!"

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val intent = Intent(LESSON_PROGRESS)
        intent.putExtra("MESSAGE", MESSAGE_START)
        intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES)
        sendBroadcast(intent)

        return super.onStartCommand(intent, flags, startId)
    }

    override fun onBind(intent: Intent?): IBinder? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
