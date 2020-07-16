package com.android.example.navigation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.android.example.navigation.R
import kotlinx.android.synthetic.main.main_fragment.*

class MainFragment: Fragment() {
    private lateinit var lilly: Button;
    private lateinit var orchid: Button;

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button).setOnClickListener(View.OnClickListener {
           Navigation.createNavigateOnClickListener(R.id.action_mainActivity_to_roseDescriptionFragment, null)
            Navigation.findNavController(view).navigate(R.id.action_mainActivity_to_roseDescriptionFragment)
        })

        view.findViewById<Button>(R.id.button_lilly).setOnClickListener(View.OnClickListener {
            Navigation.createNavigateOnClickListener(R.id.click, null)
            Navigation.findNavController(view).navigate(R.id.click)
        })

        view.findViewById<Button>(R.id.button_orchids).setOnClickListener(View.OnClickListener {
            Navigation.createNavigateOnClickListener(R.id.click_orchid, null)
            Navigation.findNavController(view).navigate(R.id.click_orchid)
        })

    }
}