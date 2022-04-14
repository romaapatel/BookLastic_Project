package com.example.booklastic.auth_signup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.booklastic.R

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        supportActionBar?.hide()
    }
}