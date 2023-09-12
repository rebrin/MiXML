package com.example.mixml

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    lateinit var boton:Button
    lateinit var textfield:TextInputLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textfield=findViewById(R.id.OTFTotal)
        boton=findViewById(R.id.BCalcula)
        boton.setOnClickListener({
            val tvRes=findViewById<TextView>(R.id.tvRes)
            var res:Float=textfield.editText?.text.toString().toFloat()
            res=res*1.16f
            tvRes.setText(res.toString())
        })


    }
}