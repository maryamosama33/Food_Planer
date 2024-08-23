package com.example.food.activities

import android.app.Activity
import android.app.Dialog
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.food.R

open class BaseActivity : AppCompatActivity() {
    private lateinit var pb:Dialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    fun showProgressBar(){
       pb = Dialog(this)
        pb.setContentView(R.layout.progress_bbar)
        pb.setCancelable(false)
        pb.show()
    }

    fun hideProgressBar(){
        pb.hide()
    }

    fun showToast(activity:Activity, msg:String ){
         Toast.makeText(activity,msg,Toast.LENGTH_SHORT).show()
    }
}