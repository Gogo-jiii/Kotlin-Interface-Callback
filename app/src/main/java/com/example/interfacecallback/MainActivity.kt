package com.example.interfacecallback

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.interfacecallback.SecondActivity.Companion.setInterfaceInstance
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MyInterface {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGotoSecondActivity.setOnClickListener {
            setInterfaceInstance(this@MainActivity)
            startActivity(Intent(this@MainActivity, SecondActivity::class.java))
        }
    }

    override fun callBack(data: String?) {
        Toast.makeText(this, "Data received: $data", Toast.LENGTH_LONG).show()
    }
}