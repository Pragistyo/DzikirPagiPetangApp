package com.example.dzikirpagipetangapp.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dzikirpagipetangapp.Constants

import com.example.dzikirpagipetangapp.R
import com.example.dzikirpagipetangapp.adapters.DzikirTitleListAdapter
import kotlinx.android.synthetic.main.fragment_pagi.*
import kotlinx.android.synthetic.main.fragment_pagi.view.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class FragmentPagi : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val layoutView = inflater.inflate(R.layout.fragment_pagi, container, false)

//        val itemTitleDoa =  layoutView.tv_title_pagi
//        itemTitleDoa.text= "DZIKIR PAGI"

        val constant = context?.let { Constants(it) }
        val vLayoutManager = LinearLayoutManager(context)
        vLayoutManager.orientation = RecyclerView.VERTICAL
        val myAdapter = context?.let { DzikirTitleListAdapter(it, constant!!.LIST_DOA_PAGI, constant.TITLE_DETAIL_DOA_PAGI) }

//        layoutView.rv_fragment_list_pagi.addItemDecoration(DividerItemDecoration(context, LinearLayoutManager.VERTICAL))

        layoutView.rv_fragment_list_pagi.layoutManager = vLayoutManager
        layoutView.rv_fragment_list_pagi.adapter = myAdapter

        return layoutView


    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


}
