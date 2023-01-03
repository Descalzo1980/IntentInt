package ru.stas.intentint

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ru.stas.intentint.databinding.ActivityMainBinding

private const val EXTRA_API = "Build.VERSION_CODES.S"
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.sendInt.setOnClickListener {
            val intent = Intent(this,SecondActivity::class.java)
            intent.putExtra(EXTRA_API, Build.VERSION_CODES.S)
            startActivity(intent)
        }

    }
}