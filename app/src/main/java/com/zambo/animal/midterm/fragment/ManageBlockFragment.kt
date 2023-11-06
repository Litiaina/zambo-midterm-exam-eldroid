package com.zambo.animal.midterm.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.zambo.animal.midterm.activity.MainActivity
import com.zambo.animal.midterm.adapter.AnimalBlockedAdapter
import com.zambo.animal.midterm.data.AnimalData
import com.zambo.animal.midterm.databinding.FragmentManageBlockBinding
import com.zambo.animal.midterm.sharedpreferences.LocalStorage

class ManageBlockFragment : Fragment() {

    private var _binding: FragmentManageBlockBinding? = null
    private val binding get() = _binding!!
    private var animalArrayList: ArrayList<AnimalData>? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentManageBlockBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.animalBlockedRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        animalArrayList = ArrayList()

        for (animal in LocalStorage.animals) {
            if (LocalStorage.sharedPreferences!!.getString(animal.name, "") == "PARAMS_BLOCKED") {
                animalArrayList?.add(AnimalData(animal.name, animal.detail))
            }
        }

        binding.animalBlockedRecyclerView.adapter = AnimalBlockedAdapter(animalArrayList!!, requireActivity())

        binding.backImageButton.setOnClickListener {
            FragmentChanger.replaceFragment(requireActivity(), AnimalNamesFragment(), MainActivity.dashboardID!!)
        }
    }

}