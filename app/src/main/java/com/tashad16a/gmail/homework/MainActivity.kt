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
        //создаём и отображаем текстовое уведомление
        val toast = Toast.makeText(
            this,
            "Hello world! Good day!",
            Toast.LENGTH_LONG  //(По умолчанию) показывает текстовое уведомление на короткий промежуток времени
        )
        toast.setGravity(Gravity.CENTER, 0, 0);   //позиция на экране
        toast.show()
    }

    fun showToastBye(view: View){
        //создаём и отображаем текстовое уведомление
        val toast = Toast.makeText(
            this,
            "Goodbye world!",
            Toast.LENGTH_LONG  //(По умолчанию) показывает текстовое уведомление на короткий промежуток времени
        )
        toast.setGravity(Gravity.CENTER, 0, 0);   //позиция на экране
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
