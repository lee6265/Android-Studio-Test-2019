package com.example.myapplication

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val txtIntent=findViewById<TextView>(R.id.txtIntent)
//        var score:Int=intent.getBundleExtra("bundle").getInt("score")
//        var name:String = intent.getBundleExtra("bundle").getString("name")
        var b = intent?.getBundleExtra("bundle") ?: return

        var score = b.getInt("score")
        var name = b.getString("name")
        txtIntent.text = "$name \n $score"

        txtIntent.text="$name \n $score 分"

        val btnBack=findViewById<Button>(R.id.btnBack)

        btnBack.setOnClickListener {
            val bundle=Bundle()
            bundle.putInt("new score",score+20)
            bundle.putString("name",name)
            val intent=Intent().putExtra("bundle",bundle)
            setResult(Activity.RESULT_OK,intent)
            finish()
        }
    }
}
