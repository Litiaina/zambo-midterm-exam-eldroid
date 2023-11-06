package com.zambo.animal.midterm.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zambo.animal.midterm.activity.MainActivity
import com.zambo.animal.midterm.databinding.FragmentAnimalDetailsBinding
import com.zambo.animal.midterm.sharedpreferences.LocalStorage

class AnimalDetailsFragment : Fragment() {

    private var _binding: FragmentAnimalDetailsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAnimalDetailsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.animalNameTextView.text = MainActivity.name
        binding.animalDetailsTextView.text = MainActivity.detail

        binding.backImageButton.setOnClickListener {
            FragmentChanger.replaceFragment(requireActivity(), AnimalNamesFragment(), MainActivity.dashboardID!!)
        }

        binding.blockButton.setOnClickListener {
            with(LocalStorage.sharedPreferences!!.edit()) {
                for (animal in LocalStorage.animals) {
                    if (animal.name == MainActivity.name) {
                        putString(animal.name, "PARAMS_BLOCKED")
                        apply()
                    }
                }
            }
            FragmentChanger.replaceFragment(requireActivity(), AnimalNamesFragment(), MainActivity.dashboardID!!)
        }

    }

}