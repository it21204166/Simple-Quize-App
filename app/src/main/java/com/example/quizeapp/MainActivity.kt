package com.example.quizeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var inputText:EditText = findViewById(R.id.textInput)

        var startBtn:Button = findViewById(R.id.startBtn)

        startBtn.setOnClickListener {
            if (inputText.text.toString().isEmpty()){
                Toast.makeText(this,"Enter Your Name",Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this,QuestionActivity::class.java)
                startActivity(intent)
            }
        }

    }
}