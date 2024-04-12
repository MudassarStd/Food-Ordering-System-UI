package com.example.task
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import androidx.viewpager2.widget.ViewPager2
import com.example.mobileappproject.Adapters.FragmentPagesAdapter
import com.example.mobileappproject.databinding.ActivityRecommendedOptionBinding

class recommendedOption : AppCompatActivity() {
    private lateinit var mBinding: ActivityRecommendedOptionBinding
    private lateinit var adapter: FragmentPagesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityRecommendedOptionBinding.inflate(layoutInflater)
        setContentView(mBinding.root)
        supportActionBar?.title = "Recommended Options"

        adapter = FragmentPagesAdapter(supportFragmentManager, lifecycle)

        mBinding.tabLayout.addTab(mBinding.tabLayout.newTab().setText("Food"))
        mBinding.tabLayout.addTab(mBinding.tabLayout.newTab().setText("Drinks"))

        mBinding.viewPager.adapter = adapter

        mBinding.tabLayout.addOnTabSelectedListener(object : OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                if (tab != null) {
                    mBinding.viewPager.currentItem = tab.position
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {}

            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })

        mBinding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                mBinding.tabLayout.selectTab(mBinding.tabLayout.getTabAt(position))
            }
        })
    }
}
