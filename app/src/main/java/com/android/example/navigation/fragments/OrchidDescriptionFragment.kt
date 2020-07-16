package com.android.example.navigation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.android.example.navigation.R

class OrchidDescriptionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.orchid_desc, container, false)

        view.findViewById<Button>(R.id.button_orc_photos).setOnClickListener {
            Navigation.findNavController(view)
                .navigate(R.id.action_orchidDescriptionFragment_to_orchidPhotosFragment)
        }
        return view
    }

}