package com.tashad16a.gmail.homework

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun showToastHello(view: View) {
        val toast = Toast.makeText(
            applicationContext,
            "Hello world! Have a nice evening!",
            Toast.LENGTH_LONG
        )
        toast.setGravity(Gravity.CENTER, 0, 0);
        val toastView = toast.view as LinearLayout
        val pic = ImageView(applicationContext)
        pic.setImageResource(R.drawable.morning)
        toastView.addView(pic, 0)
        toast.show()
    }

    fun showToastBye(view: View) {
        val toast = Toast.makeText(
            applicationContext,
            "Goodbye world! Good dreams!",
            Toast.LENGTH_LONG
        )
        toast.setGravity(Gravity.CENTER, 0, 0);
        val toastView = toast.view as LinearLayout
        val pic = ImageView(applicationContext)
        pic.setImageResource(R.drawable.sunset)
        toastView.addView(pic, 0)
        toast.show()
    }

    fun showToastHelloMyDream(view: View) {
        val toast = Toast.makeText(
            applicationContext,
            "Hello my dream job!",
            Toast.LENGTH_LONG
        )
        toast.setGravity(Gravity.CENTER, 0, 0);
        val toastView = toast.view as LinearLayout
        val pic = ImageView(applicationContext)
        pic.setImageResource(R.drawable.work)
        toastView.addView(pic, 0)
        toast.show()
    }
}
