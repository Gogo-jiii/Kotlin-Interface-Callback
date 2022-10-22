package com.example.interfacecallback

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    companion object {
        private var myInterface: MyInterface? = null
        fun setInterfaceInstance(context: Context?) {
            myInterface = context as MyInterface?
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btnGoBack.setOnClickListener { v: View? ->
            finish()
            myInterface!!.callBack("IT wala")
        }
    }

}