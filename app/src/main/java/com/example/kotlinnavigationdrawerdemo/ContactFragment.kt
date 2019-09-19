package com.example.kotlinnavigationdrawerdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class ContactFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view:View=inflater.inflate(R.layout.fragment_contact, container, false)

        val textViewContact:TextView=view.findViewById(R.id.txtHello)

        val info: String="For any query, contact 9876543210.\nThanks!"
        textViewContact.text=info

        return view
    }
}