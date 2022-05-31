package com.example.massiviiciclydz

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    val bad = 0..3
    val normal = 4..6
    val nice = 7..9
    val excellent = 10
    val gradeArray = arrayOf(4, 7, 3, 6, 10, 2)
    val nameArray = arrayOf("Антон", "Егор", "Маша", "Светлана", "Юля", "Семен")
    val badArray = ArrayList<String>()
    val normalArray = ArrayList<String>()
    val niceArray = ArrayList<String>()
    val excellentArray = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        for ((index, grade) in gradeArray.withIndex()){
            when (gradeArray[index]){
                in bad -> badArray.add("Плохие оценки: Ученик: ${nameArray[index]} - $grade")
            in normal -> normalArray.add("Нормальные оценки: Ученик: ${nameArray[index]} - $grade")
            in nice -> niceArray.add("Хорошие оценки: Ученик: ${nameArray[index]} - $grade")
            excellent -> excellentArray.add("Отличные оценки: Ученик: ${nameArray[index]} - $grade")}

        }
        badArray.forEach { Log.d("MyLog", it)}
        normalArray.forEach { Log.d("MyLog",it)}
        niceArray.forEach { Log.d("MyLog", it)}
        excellentArray.forEach { Log.d("MyLog", it)}
        }

    }
