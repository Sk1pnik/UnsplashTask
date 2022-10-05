package com.skipnik.unsplashtask.presentation.detailsfragment

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import com.bumptech.glide.Glide
import com.skipnik.unsplashtask.R
import com.skipnik.unsplashtask.databinding.FragmentDetailsBinding

class DetailsFragment : Fragment(R.layout.fragment_details) {

    private val args: DetailsFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val binding = FragmentDetailsBinding.bind(view)

        binding.apply {
            val photo = args.photo

            Glide.with(this@DetailsFragment)
                .load(photo.urls.full)
                .into(imageView)
        }
    }
}