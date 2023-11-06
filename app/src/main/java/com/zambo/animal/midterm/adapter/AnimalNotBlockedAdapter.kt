package com.zambo.animal.midterm.adapter

import android.app.Activity
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.zambo.animal.midterm.activity.MainActivity
import com.zambo.animal.midterm.data.AnimalData
import com.zambo.animal.midterm.databinding.ItemLayoutAnimalNotBlockedBinding
import com.zambo.animal.midterm.fragment.AnimalDetailsFragment
import com.zambo.animal.midterm.fragment.FragmentChanger

class AnimalNotBlockedAdapter(private val data: ArrayList<AnimalData>, private val activity: Activity) : RecyclerView.Adapter<AnimalNotBlockedAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemLayoutAnimalNotBlockedBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemLayoutAnimalNotBlockedBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.animalNameTextView.text = data[position].name
        holder.binding.selectCardView.setOnClickListener {
            MainActivity.name = data[position].name
            MainActivity.detail = data[position].detail
            FragmentChanger.replaceFragment(activity, AnimalDetailsFragment(), MainActivity.dashboardID!!)
        }
    }

}