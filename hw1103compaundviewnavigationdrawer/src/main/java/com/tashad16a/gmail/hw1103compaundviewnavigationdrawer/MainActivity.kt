package com.tashad16a.gmail.hw1103compaundviewnavigationdrawer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBar
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import com.tashad16a.gmail.hw1103compaundviewnavigationdrawer.fragment.CompoundPageFragment

class MainActivity : AppCompatActivity() {

    private lateinit var drawerLayout: DrawerLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val toolbar: Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        val actionbar: ActionBar? = supportActionBar
        actionbar?.apply {
            setDisplayHomeAsUpEnabled(true)
            setHomeAsUpIndicator(R.drawable.ic_menu)
        }

        val navigationView: NavigationView = findViewById(R.id.drawer_navigation_view)
        navigationView.setNavigationItemSelectedListener { menuItem ->
            setTexFragment(menuItem)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        drawerLayout = findViewById(R.id.drawer_layout)
        return when (item.itemId) {
            android.R.id.home -> {
                drawerLayout.openDrawer(GravityCompat.START)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    fun setTexFragment(item: MenuItem): Boolean {
        return when (item.itemId) {
            item.itemId -> {
                CompoundPageFragment.fragmentText.setText(item.title)
                drawerLayout.closeDrawers()
                true
            }
            else -> false
        }
    }
}
