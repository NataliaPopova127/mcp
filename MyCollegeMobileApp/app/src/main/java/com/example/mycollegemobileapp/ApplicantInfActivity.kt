package com.example.mycollegemobileapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ApplicantInfActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_applicant_inf)
        title = "Абитуриенту"
    }
}