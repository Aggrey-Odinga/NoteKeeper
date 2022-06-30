package com.moringaschool.notekeeper;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


import androidx.appcompat.app.AppCompatActivity;

import java.util.List;


public class NoteActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);
//            set variable for spinner
        Spinner spinnerCourses = findViewById(R.id.spinner_courses);
//load data to populate on spinner
//fetching courses list
        List<CourseInfo> courses = DataManager.getInstance().getCourses();
        ArrayAdapter<CourseInfo> adapterCourses = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, courses);
        adapterCourses.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinnerCourses.setAdapter(adapterCourses);


    }


 }