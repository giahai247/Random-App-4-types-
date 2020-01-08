package com.giahai.diceroller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val randomNumber : Button = findViewById(R.id.btnRandom)
        val randomXucxac : Button = findViewById(R.id.btnXucxac)
        val randomXu : Button = findViewById(R.id.btnDongxu)
        randomNumber.setOnClickListener {
            val intent = Intent(this,RandomNumberActivity::class.java);
            startActivity(intent)
        }
        randomXucxac.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java);
            startActivity(intent)
        }
        randomXu.setOnClickListener {
            val intent = Intent(this,RandomXuActivity::class.java);
            startActivity(intent)
        }
    }
}
