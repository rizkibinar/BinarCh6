package id.co.rizki.binarch6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import id.co.rizki.binarch6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //step 2 untuk viewbinding, deklarasikan variable berdasarkan xml
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // step 3 untuk viewbinding, bind xml ke variable
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGanti.setOnClickListener {
            binding.textHello.text = "Text Berhasil di ganti"
        }

    }
}