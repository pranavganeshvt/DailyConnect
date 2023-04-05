package com.example.dailyconnect

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class TheatresListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.theatres_list)

        val regal = findViewById<Button>(R.id.regal)
        regal.setOnClickListener {
            val intent1 =
                android.content.Intent(this@TheatresListActivity, MoviesList::class.java)
            startActivity(intent1)
        }
            val lyric = findViewById<Button>(R.id.Lyric)
            lyric.setOnClickListener {
                val intent2 =
                    android.content.Intent(this@TheatresListActivity, MoviesList::class.java)
                startActivity(intent2)
            }
                val radford = findViewById<Button>(R.id.Radford)
                radford.setOnClickListener {
                    val intent3 = android.content.Intent(
                        this@TheatresListActivity,
                        MoviesList::class.java
                    )
                    startActivity(intent3)
                     }
                    val bb = findViewById<Button>(R.id.BB)
                    bb.setOnClickListener {
                        val intent4 = android.content.Intent(
                            this@TheatresListActivity,
                            MoviesList::class.java
                        )
                        startActivity(intent4)
                        }
                    }
                }
