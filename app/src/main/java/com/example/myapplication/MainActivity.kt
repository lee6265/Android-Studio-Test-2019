package com.example.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val message: TextView=findViewById(R.id.txtName)
        var btnOK: Button =findViewById(R.id.btnOK)
        btnOK.setOnClickListener(View.OnClickListener {
            message.setText("測試資料")
        })

    }
}
