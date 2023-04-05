package br.com.alura.edh_utils

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.alura.edh_utils.databinding.ActivityPlanechaseBinding

class PlanechaseActivity : AppCompatActivity() {

    private lateinit var binding : ActivityPlanechaseBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlanechaseBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}