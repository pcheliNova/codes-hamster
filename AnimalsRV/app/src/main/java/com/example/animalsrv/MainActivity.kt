package com.example.animalsrv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.animalsrv.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val adapter = AnimalAdapter()
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
    private var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init(){
        binding.apply {
            rcView.layoutManager = GridLayoutManager( this@MainActivity, 3)
            rcView.adapter = adapter
            buttonAdd.setOnClickListener {
                if (counter>8) counter=0
                val animal = Animal(imageIdList[counter],"Animal $counter")
                adapter.addAnimal(animal)
                counter++
            }
        }
    }
}