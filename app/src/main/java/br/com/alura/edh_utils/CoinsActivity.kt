package br.com.alura.edh_utils

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.alura.edh_utils.databinding.ActivityCoinsBinding

class CoinsActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCoinsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCoinsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}