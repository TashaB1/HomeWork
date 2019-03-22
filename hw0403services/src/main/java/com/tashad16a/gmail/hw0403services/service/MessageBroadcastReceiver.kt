package com.tashad16a.gmail.hw0403services.service

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.view.Gravity
import android.widget.Toast
import com.tashad16a.gmail.hw0403services.constant.ConstantName

class MessageBroadcastReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        val toast: Toast?
        toast = Toast.makeText(
            context,
            intent.getStringExtra(ConstantName.MESSAGE_KEY),
            Toast.LENGTH_LONG
        )

        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show()
    }
}