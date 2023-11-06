package com.zambo.animal.midterm.activity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zambo.animal.midterm.databinding.ActivityMainBinding
import com.zambo.animal.midterm.fragment.AnimalNamesFragment
import com.zambo.animal.midterm.fragment.FragmentChanger
import com.zambo.animal.midterm.sharedpreferences.LocalStorage

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    companion object {
        var name: String? = null
        var detail: String? = null
        var dashboardID: Int? = null
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        LocalStorage.sharedPreferences = getSharedPreferences("ANIMAL_LOCAL_DATA", Context.MODE_PRIVATE)
        FragmentChanger.replaceFragment(this@MainActivity, AnimalNamesFragment(), binding.dashboardLayout.id)
        dashboardID = binding.dashboardLayout.id
    }
}