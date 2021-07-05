package com.suame.myapplication.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.suame.myapplication.models.Profile
import com.suame.week5app.databinding.ProfileItemBinding

class profileAdapter (val profiles:List<Profile>): RecyclerView.Adapter<profileAdapter.ProfileViewHolder>(){

    class ProfileViewHolder(private val binding: ProfileItemBinding):RecyclerView.ViewHolder(binding.root) {
        fun bind(profile: Profile) {
            binding.flag.setImageResource(profile.passport)
            binding.name.text=profile.name

        }


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileViewHolder {
        var binding=ProfileItemBinding.inflate(LayoutInflater.from(parent.context))
        return ProfileViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProfileViewHolder, position: Int) {
        val country = profiles[position]
        holder.bind(country)

    }

    override fun getItemCount(): Int {
        return profiles.size


        }
interface onItemClickListner
{
    fun onItemCLick(profiles:Profile,position: Int)

}

}