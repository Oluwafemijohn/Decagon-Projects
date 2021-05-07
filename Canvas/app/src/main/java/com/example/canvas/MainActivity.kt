package com.example.canvas

import android.content.DialogInterface
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        videoCallAlert()
    }

    private fun videoCallAlert() {
        val alertDialog: AlertDialog.Builder = AlertDialog.Builder(this)
        alertDialog.setTitle("Video  Alert !")
        alertDialog.setMessage("Are you sure ?\n Do you want dismiss conversation ?")
        alertDialog.setIcon(R.drawable.ic_launcher_background)
        alertDialog.setPositiveButton("Yes") { dialog, id ->
            val intent  = Intent(this,MainActivity::class.java)
            startActivity(intent)
            this.finish()
        }
        alertDialog.setNegativeButton("Cancel") { dialog, id ->
            dialog.cancel()
        }
    }
}