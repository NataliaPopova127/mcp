package com.example.mycollegemobileapp

import android.icu.text.CaseMap.Title
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.davemorrissey.labs.subscaleview.ImageSource
import kotlinx.android.synthetic.main.activity_timetable.*


class TimetableActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_timetable)
        title = "Расписание"
        imageView.setImage(ImageSource.resource(R.drawable.timetable_proba_1));
    }

}
