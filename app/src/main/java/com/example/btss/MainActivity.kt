package com.example.btss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val img1 = findViewById<ImageView>(R.id.img1)
        img1.setOnClickListener {

            Toast.makeText(this, "1번 클릭", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, Bts1Activity::class.java)
            startActivity(intent)

        }

        val img2 = findViewById<ImageView>(R.id.img2)
        img2.setOnClickListener {

            Toast.makeText(this, "2번 클릭", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, Bts2Activity::class.java)
            startActivity(intent)

        }

        val img3 = findViewById<ImageView>(R.id.img3)
        img3.setOnClickListener {

            Toast.makeText(this, "3번 클릭", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, Bts3Activity::class.java)
            startActivity(intent)

        }

        val img4 = findViewById<ImageView>(R.id.img4)
        img4.setOnClickListener {

            Toast.makeText(this, "4번 클릭", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, Bts4Activity::class.java)
            startActivity(intent)

        }

        val img5 = findViewById<ImageView>(R.id.img5)
        img5.setOnClickListener {

            Toast.makeText(this, "5번 클릭", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, Bts5Activity::class.java)
            startActivity(intent)

        }

        val img6 = findViewById<ImageView>(R.id.img6)
        img6.setOnClickListener {

            Toast.makeText(this, "6번 클릭", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, Bts6Activity::class.java)
            startActivity(intent)

        }

        val img7 = findViewById<ImageView>(R.id.img7)
        img7.setOnClickListener {

            Toast.makeText(this, "7번 클릭", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, Bts7Activity::class.java)
            startActivity(intent)

        }
    }
}