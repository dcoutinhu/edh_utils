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

        onButtonPress()
    }

    private fun onButtonPress() {
    }

    private fun flipTheCoin(imageId: Int, coinSide: String) {
        binding.ivCoin.animate().apply {
            duration = 1000
            rotationYBy(1000F)
            binding.ivCoin.isClickable = false
        }.withEndAction {
            binding.ivCoin.setImageResource(imageId)
        }.start()
    }


}
