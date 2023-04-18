package br.com.alura.edh_utils

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import br.com.alura.edh_utils.databinding.ActivityCoinsBinding
import kotlin.random.Random

class CoinsActivity : AppCompatActivity() {

    private lateinit var binding : ActivityCoinsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCoinsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onButtonPress()
        binding.coinsActivityRedmanaIncrementButton.setOnClickListener {
            incrementCounter(binding.coinsActivityRedmanaCounter)
        }

        binding.coinsActivityRedmanaIncrementButton.setOnLongClickListener {
            resetCounter(binding.coinsActivityRedmanaCounter)
            return@setOnLongClickListener true
        }

        binding.coinsActivityRedmanaDecrementButton.setOnClickListener {
            decrementCounter(binding.coinsActivityRedmanaCounter)
        }
    }

    private fun onButtonPress() {
        binding.coinsActivityFlipButton.setOnClickListener {
            val randomNumber : Int = (1..2).random()

            if (randomNumber == 1) {
                flipTheCoin(R.drawable.iv_heads,"Heads!")
            }
            else {
                flipTheCoin(R.drawable.iv_tails,"Tails!")
            }
        }
    }

    private fun flipTheCoin(imageId: Int, coinSide: String) {
        binding.ivCoin.animate().apply {
            duration = 1000
            rotationYBy(1800F)
            binding.ivCoin.isClickable = false
        }.withEndAction {
            binding.ivCoin.setImageResource(imageId)
        }.start()
    }

    private fun incrementCounter(counterText: TextView) {
        var valueInt = counterText.text.toString().toInt()
        valueInt += 1
        counterText.text = valueInt.toString()
    }

    private fun decrementCounter(counterText: TextView) {
        var valueInt = counterText.text.toString().toInt()
        valueInt -= 1
        counterText.text = valueInt.toString()
    }

    private fun resetCounter(counterText: TextView) {
        counterText.text = "0"
    }
}
