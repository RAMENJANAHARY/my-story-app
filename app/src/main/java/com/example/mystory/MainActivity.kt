package com.example.mystory

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val storyText: TextView = findViewById(R.id.storyText)

        // ==== EDIT THIS PART WITH YOUR REAL STORY ====
        val myStory = """
            Hello! This is my story.
            
            My name is [Your Name]. I was born in [place] on [date/year].
            
            Growing up, I loved [your hobbies, e.g., reading, playing football, drawing].
            
            One important moment in my life was when [describe an event].
            
            Today, I am [what you do now, e.g., a student, developer, artist].
            
            My dreams are [your future goals].
            
            Thank you for reading my story! ❤️
            
            (You can add as many paragraphs as you want here.)
        """.trimIndent()

        storyText.text = myStory
    }
}
