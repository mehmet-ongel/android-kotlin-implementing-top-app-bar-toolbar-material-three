package com.techmania.implementingtopappbar

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {

    lateinit var toolbar : MaterialToolbar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.toolbar)

        toolbar.overflowIcon = AppCompatResources.getDrawable(this,R.drawable.baseline_more_vert_24)

        toolbar.setNavigationOnClickListener {

            Toast.makeText(applicationContext,"Navigation Icon is clicked",Toast.LENGTH_SHORT).show()

        }

        toolbar.setOnMenuItemClickListener { item ->

            when(item.itemId){

                R.id.share -> Toast.makeText(applicationContext,"Share Icon is clicked",Toast.LENGTH_SHORT).show()
                R.id.edit -> Toast.makeText(applicationContext,"Edit Icon is clicked",Toast.LENGTH_SHORT).show()
                R.id.settings -> Toast.makeText(applicationContext,"Settings Icon is clicked",Toast.LENGTH_SHORT).show()
                else -> Toast.makeText(applicationContext,"Sign Out Icon is clicked",Toast.LENGTH_SHORT).show()

            }

            return@setOnMenuItemClickListener true

        }

    }
}