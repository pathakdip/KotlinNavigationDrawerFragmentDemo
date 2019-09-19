package com.example.kotlinnavigationdrawerdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class HomeFragment : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view: View=inflater.inflate(R.layout.fragment_home,container,false)

        val textViewHome: TextView=view.findViewById(R.id.txtWelcome)
        val welcome: String="Welcome Home"

        textViewHome.text=welcome

        return view
    }
}