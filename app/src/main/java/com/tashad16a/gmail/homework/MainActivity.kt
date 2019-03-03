package com.tashad16a.gmail.homework

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity;
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

import kotlinx.android.synthetic.main.activity_main.*
import android.view.Gravity
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout





class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

    fun showToastHello(view: View){
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

    fun showToastBye(view: View){
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

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
