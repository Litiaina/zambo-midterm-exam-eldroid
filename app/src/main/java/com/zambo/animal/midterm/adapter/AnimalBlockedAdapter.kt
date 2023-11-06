package com.zambo.animal.midterm.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zambo.animal.midterm.activity.MainActivity
import com.zambo.animal.midterm.data.AnimalData
import com.zambo.animal.midterm.databinding.ItemLayoutAnimalBlockedBinding
import com.zambo.animal.midterm.fragment.FragmentChanger
import com.zambo.animal.midterm.fragment.ManageBlockFragment
import com.zambo.animal.midterm.sharedpreferences.LocalStorage

class AnimalBlockedAdapter(private val data: ArrayList<AnimalData>, private val activity: Activity) : RecyclerView.Adapter<AnimalBlockedAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemLayoutAnimalBlockedBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemLayoutAnimalBlockedBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.animalNameTextView.text = data[position].name
        holder.binding.unblockButton.setOnClickListener {
            with(LocalStorage.sharedPreferences!!.edit()) {
                for (animalIndex in LocalStorage.animals) {
                    if (animalIndex.name == data[position].name) {
                        putString(animalIndex.name, animalIndex.detail)
                        apply()
                    }
                }
            }
            FragmentChanger.replaceFragment(activity, ManageBlockFragment(), MainActivity.dashboardID!!)
        }
    }

}