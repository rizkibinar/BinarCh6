package id.co.rizki.binarch6.onboard

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import id.co.rizki.binarch6.MainActivity
import id.co.rizki.binarch6.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding : FragmentSecondBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSecondBinding.inflate(inflater, container, false)

        binding.btnStart.setOnClickListener {
            startActivity(Intent(requireActivity(),MainActivity::class.java))
            requireActivity().finish()
        }

        return binding.root
    }

}