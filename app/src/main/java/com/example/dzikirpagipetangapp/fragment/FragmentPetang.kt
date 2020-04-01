package com.example.dzikirpagipetangapp.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dzikirpagipetangapp.Constants

import com.example.dzikirpagipetangapp.R
import com.example.dzikirpagipetangapp.adapters.DzikirTitleListAdapter
import kotlinx.android.synthetic.main.fragment_petang.*
import kotlinx.android.synthetic.main.fragment_petang.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class FragmentPetang : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val layoutView = inflater.inflate(R.layout.fragment_petang, container, false)
//        val itemTitleDoa = layoutView.tv_title_petang
//        itemTitleDoa.text= "DZIKIR PETANG"

        val constant = context?.let { Constants(it) }
        val vLayoutManager = LinearLayoutManager(context)
        vLayoutManager.orientation = RecyclerView.VERTICAL
        val myAdapter = activity?.let { DzikirTitleListAdapter(it,constant!!.LIST_DOA_PETANG, constant.TITLE_DETAIL_DOA_PETANG) }
        layoutView.rv_fragment_list_petang.layoutManager= vLayoutManager
        layoutView.rv_fragment_list_petang.adapter = myAdapter


        return layoutView
    }


}
