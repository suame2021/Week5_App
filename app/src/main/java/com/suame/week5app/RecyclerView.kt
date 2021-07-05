package com.suame.week5app;

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.suame.myapplication.adapters.profileAdapter
import com.suame.myapplication.models.Profile
import com.suame.week5app.databinding.ActivityRecyclerViewBinding

class RecyclerView : AppCompatActivity(){
    private lateinit var  binding: ActivityRecyclerViewBinding
    private lateinit var myCountryAdapter: profileAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val profiles: List<Profile> = listOf(
            Profile(
                R.drawable.ic_pic1,
                "Onone Mary",

            ),
            Profile(
                R.drawable.ic_pic2,
                "Kate henry",

            ),
            Profile(
                R.drawable.ic_pic__9_,
                "Stephen Mike",

            ),
            Profile(
                R.drawable.ic_pic3,
                "Omeze Michael",

            ),
            Profile(
                R.drawable.ic_pic4,
                "Onyeka Sandra",

            ),
            Profile(
                R.drawable.ic_pic6,
                "Idinne Lucy",

            ),
            Profile(
                R.drawable.ic_pic7,
                "Amara Kester",

            ),
            Profile(
                R.drawable.ic_pic8,
                "Frank Union",

            ),
            Profile(
                R.drawable.ic_pic10,
                "Bamilola henry",

            ),
            Profile(
                R.drawable.ic_pic1,
                "Samide Soludo",

            ),
            Profile(
                R.drawable.ic_pic2,
                "Bamilila Afikpo",

            ),
            Profile(
                R.drawable.ic_pic3,
                "Juliana Judit",

            ),
            Profile(
                R.drawable.ic_pic4,
                "Kifodu Francis",

            ),
            Profile(
                R.drawable.ic_pic6,
                "Omede Gift",

            ),
            Profile(
                R.drawable.ic_pic7,
                "Obiageli Philomina",

            ),
            Profile(
                R.drawable.ic_pic8,
                "Okorie Philip",

            ),
            Profile(
                R.drawable.ic_pic4,
                "Omoge Blessing",

            ),
            Profile(
                R.drawable.ic_pic10,
                "Philip Mike",

            ),
            Profile(
                R.drawable.ic_pic2,
                "Frank Emmanuel",

            ),
            Profile(
                R.drawable.ic_pic6,
                "Okonta Ngozi",

            ),
            Profile(
                R.drawable.ic_pic8,
                "Okoro John",

            ),
        )

        myCountryAdapter=profileAdapter(profiles)
        binding.profileRecyclerView.adapter=myCountryAdapter
    }



}