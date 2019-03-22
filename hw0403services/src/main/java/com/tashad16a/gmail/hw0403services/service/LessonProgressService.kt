package com.tashad16a.gmail.hw0403services.service

import android.app.Service
import android.content.Intent
import android.os.IBinder
import com.tashad16a.gmail.hw0403services.constant.ConstantName

class LessonProgressService : Service() {

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val intent = Intent(ConstantName.LESSON_PROGRESS)

        intent.putExtra(ConstantName.MESSAGE_KEY, ConstantName.MESSAGE_START)
        intent.addFlags(Intent.FLAG_INCLUDE_STOPPED_PACKAGES)
        sendBroadcast(intent)

        return super.onStartCommand(intent, flags, startId)
    }

    override fun onBind(intent: Intent?): IBinder? {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
