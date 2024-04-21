package com.example.mobileappproject.screens

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(
    private val fragmentList: ArrayList<Fragment>,
    fm: FragmentManager,
    lifecycle: Lifecycle
) : FragmentStateAdapter(fm, lifecycle) {

    override fun getItemCount(): Int {
        // Return the number of fragments in the list
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        // Return the fragment corresponding to the specified position
        return fragmentList[position]
    }
}