package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editName=findViewById<EditText>(R.id.editName)
        val txtMsg=findViewById<TextView>(R.id.txtMsg)
        val txtName=findViewById<TextView>(R.id.txtName)
//        val radioGroup=findViewById<RadioGroup>(R.id.radioGroup)
        val radioBig=findViewById<RadioButton>(R.id.radioBig)
        val radioSmall=findViewById<RadioButton>(R.id.radioSmall)
        val btnOk=findViewById<Button>(R.id.btnOK)
        val btnNext=findViewById<Button>(R.id.btnNext)
        var x:Int
        x=(Math.random()*100).toInt()

        btnNext.setOnClickListener {
            var bundle= Bundle()
            bundle.putInt("score",x)
            bundle.putString("name","${editName.text}")
            var intent=Intent(this,Main2Activity::class.java)
            intent.putExtra("bundle",bundle)
            startActivity(intent)
        }


        btnOk.setOnClickListener{
            x=(Math.random()*100).toInt()
            if(editName.length()<1)
                txtMsg.text="請輸入姓名"
            else txtMsg.text = "你的名字:\n${editName.text}"

            when(x){
                in 0..59->txtName.text="${x} in 0..59 不及格"
                in 60..100->txtName.text="${x} in 60..100"
                else-> txtName.text=x.toString()
            }

            if(radioBig.isChecked) txtMsg.text="${txtMsg.text}\n${radioBig.text}"
            if(radioSmall.isChecked) txtMsg.text="${txtMsg.text}\n${radioSmall.text}"

            val plus:(Int,Int)->Int={a,b->
                a+b
            }
            if(x<60)
                txtMsg.text="${txtMsg.text} \n $x + 20 = ${plus(x,20)}"
        }
    }
}
