package com.romakumari.dialogfragmentapp

import android.app.Dialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.romakumari.dialogfragmentapp.databinding.ActivityMainBinding
import com.romakumari.dialogfragmentapp.databinding.ItemDialogBinding

class MainActivity : AppCompatActivity() , dialogClickInterface{
        lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.mainActivity=this

    }
    fun onButtonclick(mainClickTypes: MainClickTypes) {
        when (mainClickTypes) {
            MainClickTypes.get -> {
               Toast.makeText(this,"save text",Toast.LENGTH_SHORT).show()
            }

            MainClickTypes.next -> {
                var dialogClass = DialogClass()
                dialogClass.dialogClickInterface = this
                dialogClass.show(supportFragmentManager, DialogClass.TAG)
            }
            else ->{}

        }

    }

    override fun ondialogDismissClick(name: String) {
        binding.root.let {
            Snackbar.make(it,"Clicked item $name",Snackbar.LENGTH_SHORT).show()
        }
    }
}