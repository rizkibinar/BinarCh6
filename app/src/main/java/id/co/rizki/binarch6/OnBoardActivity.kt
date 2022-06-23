package id.co.rizki.binarch6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.ViewPager
import id.co.rizki.binarch6.onboard.FirstFragment
import id.co.rizki.binarch6.onboard.SecondFragment

class OnBoardActivity : AppCompatActivity() {

    lateinit var viewPager : ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)

        val isOnBoardShown = SharedPrefManager.getIsOnBoardingShown(this)
        if(isOnBoardShown) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            finish()
        }

        viewPager = findViewById(R.id.viewpager)

        viewPager.adapter = SimpleViewPagerAdapter(supportFragmentManager)

    }

    private inner class SimpleViewPagerAdapter(fm : FragmentManager) : FragmentStatePagerAdapter(fm) {
        override fun getCount(): Int = 2

        override fun getItem(position: Int): Fragment = if(position == 0) FirstFragment() else SecondFragment()


    }
}