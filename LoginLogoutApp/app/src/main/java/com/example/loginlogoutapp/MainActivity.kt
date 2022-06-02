package com.example.loginlogoutapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.activity.result.ActivityResult
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import com.example.loginlogoutapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass : ActivityMainBinding
    private var login : String = "empty"
    private var password : String = "empty"
    private var name : String = "empty"
    private var name2 : String = "empty"
    private var name3 : String = "empty"
    private var avatarImageId : Int = 0
    private var launcher : ActivityResultLauncher<Intent>? = null



    override fun onCreate(s: Bundle?) {
        super.onCreate(s)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        launcher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()){
                result : ActivityResult ->
            if (result.resultCode == RESULT_OK){
                val textResultName = result.data?.getStringExtra("key1")
    }

    fun onClickSignIn (view: View){
        launcher?.launch(Intent(this,SignInUpActivity::class.java))
    }

    fun onClickSignUp (view: View){
        launcher?.launch(Intent(this,SignInUpActivity::class.java))
    }
    }

}