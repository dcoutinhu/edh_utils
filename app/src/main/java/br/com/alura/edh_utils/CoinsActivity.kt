package br.com.alura.edh_utils

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import br.com.alura.edh_utils.databinding.ActivityCoinsBinding
import kotlin.random.Random

class CoinsActivity : AppCompatActivity(), View.OnClickListener{

    private lateinit var binding : ActivityCoinsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCoinsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onButtonPress()

        // Red mana
        binding.coinsActivityRedmanaIncrementButton.setOnClickListener(this)
        binding.coinsActivityRedmanaDecrementButton.setOnClickListener(this)

        //Blue mana
        binding.coinsActivityBluemanaIncrementButton.setOnClickListener(this)
        binding.coinsActivityBluemanaDecrementButton.setOnClickListener(this)

        //Colorless mana
        binding.coinsActivityColorlessIncrementButton.setOnClickListener(this)
        binding.coinsActivityColorlessDecrementButton.setOnClickListener(this)

        //Storm count
        binding.coinsActivityStormIncrementButton.setOnClickListener(this)
        binding.coinsActivityStormDecrementButton.setOnClickListener(this)

//        binding.coinsActivityRedmanaIncrementButton.setOnLongClickListener {
//            resetCounter(binding.coinsActivityRedmanaCounter)
//            return@setOnLongClickListener true
//        }
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

    override fun onClick(view: View){
        when(view.id) {
            binding.coinsActivityRedmanaIncrementButton.id -> incrementCounter(binding.coinsActivityRedmanaCounter)
            binding.coinsActivityRedmanaDecrementButton.id -> decrementCounter(binding.coinsActivityRedmanaCounter)

            binding.coinsActivityBluemanaIncrementButton.id -> incrementCounter(binding.coinsActivityBluemanaCounter)
            binding.coinsActivityBluemanaDecrementButton.id -> decrementCounter(binding.coinsActivityBluemanaCounter)

            binding.coinsActivityColorlessIncrementButton.id -> incrementCounter(binding.coinsActivityColorlessCounter)
            binding.coinsActivityColorlessDecrementButton.id -> decrementCounter(binding.coinsActivityColorlessCounter)

            binding.coinsActivityStormIncrementButton.id -> incrementCounter(binding.coinsActivityStormCounter)
            binding.coinsActivityStormDecrementButton.id -> decrementCounter(binding.coinsActivityStormCounter)
        }
    }

}
