package br.com.alura.edh_utils

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import br.com.alura.edh_utils.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Coins n' Thumbs button function
        binding.mainActivityCoins.setOnClickListener {
            val Intent = Intent(this,CoinsActivity::class.java)
            startActivity(Intent)
        }

        //Planechase button function
        binding.mainActivityPlanechase.setOnClickListener {
            val Intent = Intent(this,PlanechaseActivity::class.java)
            startActivity(Intent)
        }
    }

}