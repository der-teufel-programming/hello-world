package com.birtek.heloword

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {

    var klikniecia = 0
    
    //zmiana żeby nie było że nie ma zmian

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helloButton.setOnClickListener {
            when (klikniecia) {
                0 -> {
                    textView.text = getString(R.string.haj)
                    helloButton.text = getString(R.string.kthxbye)
                }
                1 -> {
                    finish()
                    exitProcess(0)
                }
            }
            klikniecia++
        }
    }
}
