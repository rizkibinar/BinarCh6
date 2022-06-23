package id.co.rizki.binarch6.onboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import id.co.rizki.binarch6.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var binding : FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }
}