package com.example.task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.task.databinding.ActivityBottomnavBinding

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        var binding : ActivityBottomnavBinding =  ActivityBottomnavBinding.inflate(layoutInflater)
        setContentView(binding.root)

//Fragents
        val homefragment=homefragment();
        val favourite=favourite();
        val compass=compass();
        val chat=chat();
        val EventNots=EventNots();

        setCurrentFragment(homefragment);


        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home->setCurrentFragment(homefragment)
                R.id.compass->setCurrentFragment(compass)
                R.id.heart->setCurrentFragment(favourite)
                R.id.chat->setCurrentFragment(chat)
                R.id.notes->setCurrentFragment(EventNots)

            }
            true
        }
    }
    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }
}