package com.example.presensiabsensi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputBinding

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
    fun buttonprevious( view: View) {
        startActivity(Intent(this,guru ::class.java ))
        startActivity(Intent(this,Siswa::class.java))
    }
}