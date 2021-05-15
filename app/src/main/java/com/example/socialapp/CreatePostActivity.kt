package com.example.socialapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.socialapp.Daos.PostDao
import kotlinx.android.synthetic.main.activity_create_post.*

class CreatePostActivity : AppCompatActivity() {

    private lateinit var postDao:PostDao

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_post)
        postDao= PostDao()

        PostBtn.setOnClickListener{
            val input=PostInput.text.toString()
            if(input.isNotEmpty()){
                postDao.addPost(input)
                finish()

            }
        }

    }
}