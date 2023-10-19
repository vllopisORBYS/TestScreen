package com.orbys.testscreen

import android.os.Build
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val density = resources.displayMetrics.density

        val displayMetrics = resources.displayMetrics

        val screenWidthInPixels = displayMetrics.widthPixels
        val screenHeightInPixels = displayMetrics.heightPixels


        val screenWidthInDp = screenWidthInPixels / displayMetrics.density
        val screenHeightInDp = screenHeightInPixels / displayMetrics.density

        val txt1 =  findViewById<TextView>(R.id.tv1)
      val txt2 =  findViewById<TextView>(R.id.tv2)

        txt1.text = "Densidad de la pantalla $density"

        txt2.text = "Piexeles Pantalla: width = $screenWidthInPixels heidht = $screenHeightInPixels  \n DP pantalla: width = $screenWidthInDp , height = $screenHeightInDp"











    }
}