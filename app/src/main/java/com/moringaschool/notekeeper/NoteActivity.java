package com.moringaschool.notekeeper;

import android.os.Bundle;
import android.widget.Spinner;


import androidx.appcompat.app.AppCompatActivity;


public class NoteActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);
//            set variable for spinner
        Spinner spinnerCourses = findViewById(R.id.spinner_courses);
//load data to populate on spinner



    }


 }