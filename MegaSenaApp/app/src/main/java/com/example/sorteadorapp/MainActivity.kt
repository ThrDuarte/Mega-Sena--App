package com.example.sorteadorapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btn_sortear = findViewById<Button>(R.id.btn_sortear)
        btn_sortear.setOnClickListener{
            sortear();
        }

    }
    fun sortear(){
    val tv_resultado = findViewById<TextView>(R.id.text_numsort)
    val numeroAleatorio = Random.nextInt(until = 101) //0 a 100
        val numeroAleatorio2 = Random.nextInt(until = 101) //0 a 100
        val numeroAleatorio3 = Random.nextInt(until = 101) //0 a 100
        val numeroAleatorio4 = Random.nextInt(until = 101) //0 a 100
        val numeroAleatorio5 = Random.nextInt(until = 101) //0 a 100
        val numeroAleatorio6 = Random.nextInt(until = 101) //0 a 100

    tv_resultado.setText("Número Aleatório:                      " +
            " ${numeroAleatorio} ${numeroAleatorio2} ${numeroAleatorio3} ${numeroAleatorio4} ${numeroAleatorio5} ${numeroAleatorio6}")
    }


}