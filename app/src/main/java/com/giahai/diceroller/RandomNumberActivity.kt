package com.giahai.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_home.btnRandom
import kotlinx.android.synthetic.main.activity_random_number.*

class RandomNumberActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_random_number)
        btnRandom.setOnClickListener {
            if(edtmax.length() == 0 || edtmin.length() == 0){
                Toast.makeText(this@RandomNumberActivity, "Vui lòng không để trống!!!", Toast.LENGTH_SHORT).show()
            }else{
                randommm()
            }
        }
        imgReplay.setOnClickListener {
            edtmax.setText("")
            edtmin.setText("")
            tvRandom.setText("")
        }
    }
    fun randommm(){
        var bmax = edtmax.text.toString()
        var bmin = edtmin.text.toString()
        val smax = bmax.toInt()
        val smin = bmin.toInt()
        val x = (smin..smax)
        val random =  x.random()
        tvRandom.setText(" " +random)
    }

}
