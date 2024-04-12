package com.example.mobileappproject.Utils

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.mobileappproject.R

class MoveFragments{

    companion object
    {
        // replacing frags on main activity
//        fun replaceFragmentOnMainActivity(fragmentManager: FragmentManager, frag: Fragment) {
//            fragmentManager.beginTransaction().apply {
//                replace(R.id.frameLayoutMainActivity, frag)
//                addToBackStack(null)
//                commit()
//            }
//        }

        // replacing frags on location frag host activity
        fun replaceFragmentOnPaymentHostActivity(fragmentManager: FragmentManager, frag: Fragment) {
            fragmentManager.beginTransaction().apply {
                replace(R.id.frameLayoutPaymentHostActivity, frag)
                addToBackStack(null)
                commit()
            }
        }
    }

    }

