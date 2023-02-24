package com.example.n9.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.n9.PrefManager
import com.example.n9.R

class LoginActivity : AppCompatActivity() {
    private lateinit var prefManager: PrefManager
    private lateinit var etUsername: EditText
    private lateinit var etPassword: EditText
    private lateinit var username: String
    private lateinit var password: String

    private var validUsername = "Name"
    private var validPassword = "1234"



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
}