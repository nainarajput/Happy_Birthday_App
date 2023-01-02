package com.example.happybirthday

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greeing.*

class BirthdayGreeingActivity : AppCompatActivity() {

    companion object{
        const val Name_Extra = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeing)
        val name= intent.getStringExtra(Name_Extra)
        birthdaygreeting.text = "Happy Birthday\n$name!"
    }
}