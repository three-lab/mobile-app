package com.example.dashboard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUpTabBar()
    }

    private fun setUpTabBar() {
        val viewPager = findViewById<ViewPager2>(R.id.viewPager)
        val TabLayout = findViewById<TabLayout>(R.id.TabLayout)

        val adapter = TabPageAdapter(this, TabLayout.tabCount)
        viewPager.adapter = adapter

        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                TabLayout.selectTab(TabLayout.getTabAt(position))
            }
        })
    }
}
