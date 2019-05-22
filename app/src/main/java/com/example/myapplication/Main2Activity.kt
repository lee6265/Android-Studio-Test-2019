package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val txtIntent=findViewById<TextView>(R.id.txtIntent)
        val score:Int=intent.getBundleExtra("bundle").getInt("score")
        val name:String = intent.getBundleExtra("bundle").getString("name")
//        intent?.extras?.let {
//            score=it.getInt("score")
//            name=it.getString("name")
//            txtIntent.text="$name \n $score"
//        }
        txtIntent.text="$name \n $score 分"

        val btnBack=findViewById<Button>(R.id.btnBack)

        btnBack.setOnClickListener {
            finish()
        }
    }
}
