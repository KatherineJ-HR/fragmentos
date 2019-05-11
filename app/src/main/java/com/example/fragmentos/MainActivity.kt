package com.example.fragmentos

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    var EsFrag1 = true
    fun CambiarFragmento(view: View){
       val fragmento1 = fragmento1()
        val fragmento2 = fragmento2()
        val fragmento3 = fragmento3()
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        if (EsFrag1){
            EsFrag1 = false
            transaction.replace(R.id.reemplazar,fragmento1)
            transaction.addToBackStack(null)
            transaction.commit()
            EsFrag1 = true
            transaction.replace(R.id.reemplazar,fragmento2)
            transaction.addToBackStack(null)
            transaction.commit()
        }
else {       EsFrag1 = true
            transaction.replace(R.id.reemplazar,fragmento2)
            transaction.addToBackStack(null)
            transaction.commit()
            EsFrag1 = false
            transaction.replace(R.id.reemplazar,fragmento3)
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }
}
