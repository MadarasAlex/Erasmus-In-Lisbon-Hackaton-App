package com.example.hackaton

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.hackaton.ui.fragments.*
import com.google.android.material.navigation.NavigationView
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase


class MainActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener {
    private lateinit var toolbar: androidx.appcompat.widget.Toolbar
    lateinit var drawerLayout:DrawerLayout
    lateinit var drawerToggle: ActionBarDrawerToggle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val database = Firebase.database
        val myRef = database.reference

        myRef.setValue("Hello, World!")

        toolbar=findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        drawerLayout=findViewById(R.id.drawer_nav)
        drawerToggle= ActionBarDrawerToggle(
            this,
            drawerLayout,
            toolbar,
            R.string.open,
            R.string.close
        )
        drawerLayout.addDrawerListener(drawerToggle)
        drawerToggle.syncState()
        supportActionBar?.setHomeAsUpIndicator(R.drawable.short_text_24px)
        toolbar.setNavigationIcon(R.drawable.short_text_24px)
        val navView:NavigationView=findViewById(R.id.nav_view)
        navView.setNavigationItemSelectedListener(this)
        changeFragments(HomeFragment())
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        val id=item.itemId
        val navView:NavigationView=findViewById(R.id.nav_view)
       when(id)
       {
           R.id.home -> {
               changeFragments(HomeFragment())
           }
           R.id.transportation_points -> {
               changeFragments(TransportFragment())
           }
           R.id.subway_network -> {
               changeFragments(SubwayFragment())
           }
           R.id.monuments -> {
               changeFragments(PlacesFragment())
           }
           R.id.bars -> {
               changeFragments(BarsFragment())
           }
           R.id.football -> {
               changeFragments(FootballFragment())
           }
           R.id.hiking -> {
               changeFragments(HikingFragment())
           }
           R.id.museums -> {
               changeFragments(MuseumsFragment())
           }
           R.id.surf -> {
               changeFragments(SurfFragment())
           }
           R.id.cities -> {
               changeFragments(CitiesFragment())
           }
           R.id.coffee -> {
               changeFragments(CoffeeFragment())
           }

       }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }
    fun changeFragments(fragment: Fragment)
    {
        var ft=supportFragmentManager.beginTransaction()
        ft.replace(R.id.frame, fragment)
        ft.commit()
    }

    override fun onBackPressed() {
        if(drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            drawerLayout.closeDrawer(GravityCompat.START)
        }

        else {
            super.onBackPressed()
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

}