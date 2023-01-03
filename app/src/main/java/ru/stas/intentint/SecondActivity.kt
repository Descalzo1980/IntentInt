package ru.stas.intentint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.stas.intentint.databinding.ActivityMainBinding
import ru.stas.intentint.databinding.ActivitySecondBinding
private const val EXTRA_API = "Build.VERSION_CODES.S"
class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var intentInt = intent.getIntExtra(EXTRA_API,0)
        binding.tvReceivedInt.text = intentInt.toString()
    }
}