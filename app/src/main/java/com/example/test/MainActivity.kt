package com.example.test

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun displayToast(view: View)
    {
        val tst = Toast.makeText(this, "You clicked the button! Updated", Toast.LENGTH_SHORT)
        tst.show()
    }



}
