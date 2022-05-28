package com.example.animalsrv

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.animalsrv.databinding.ActivityEditBinding

class EditActivity : AppCompatActivity() {
    lateinit var binding: ActivityEditBinding
    private var indexImage = 0
    private var imageId = R.drawable.antilopa
    private val imageIdList = listOf(
        R.drawable.antilopa,
        R.drawable.crocodile,
        R.drawable.lion,
        R.drawable.elephant,
        R.drawable.giraffe,
        R.drawable.hippo,
        R.drawable.gorilla,
        R.drawable.leopard,
        R.drawable.rhino)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initButtons()
    }
    private fun initButtons() = with(binding){
        bNext.setOnClickListener{
            indexImage++
            if(indexImage > imageIdList.size-1) indexImage = 0
            imageId = imageIdList[indexImage]
            imageView.setImageResource(imageId)
        }
        bDone.setOnClickListener{
            val animal = Animal(imageId, edTitle.text.toString(), edDesc.text.toString())
            val editIntent = Intent().apply{
                putExtra("animal", animal)
            }
            setResult(RESULT_OK, editIntent)
            finish()
        }
    }
}