package com.example.happybirthday

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun CreateBirthdayCard(view: View) {
        val name= nameInput.editableText.toString()
       val intent = Intent(this, BirthdayGreeingActivity::class.java )
         intent.putExtra(BirthdayGreeingActivity.Name_Extra,name)
        startActivity(intent)
    }
    }
