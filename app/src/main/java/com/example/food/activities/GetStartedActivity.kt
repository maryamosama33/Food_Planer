package com.example.food.activities

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.food.R
import com.example.food.databinding.ActivityGetStartedBinding

class GetStartedActivity : AppCompatActivity() {
    private var binding:ActivityGetStartedBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGetStartedBinding.inflate(layoutInflater)
        setContentView(binding?.root)


        binding?.getStartedArrow?.setOnClickListener{
            startActivity(Intent(this,SignInActivity::class.java))
            finish()
        }
        binding?.signInGuestArrow?.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("IS_GUEST", true)
            startActivity(intent)
            finish()
        }
    }
}