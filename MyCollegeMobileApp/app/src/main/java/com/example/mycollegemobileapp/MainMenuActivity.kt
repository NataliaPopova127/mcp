package com.example.mycollegemobileapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)
    }
    fun btnNewsClick(view: View){
        var intent : Intent = Intent(this@MainMenuActivity, NewsActivity::class.java)
        startActivity(intent)
    }
    fun btnTimetableClick(view : View){
        var intent : Intent = Intent(this@MainMenuActivity, TimetableActivity::class.java)
        startActivity(intent)
    }
}