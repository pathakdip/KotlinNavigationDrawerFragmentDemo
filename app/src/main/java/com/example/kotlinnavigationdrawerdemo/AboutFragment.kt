package com.example.kotlinnavigationdrawerdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class AboutFragment : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View=inflater.inflate(R.layout.fragment_about,container,false)

        val textViewAbout: TextView=view.findViewById(R.id.txtAbout)
        val about="This app shows a demo of Navigation Drawer with Fragment"

        textViewAbout.text=about

        return view
    }
}