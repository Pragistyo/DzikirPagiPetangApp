package com.example.dzikirpagipetangapp.adapters

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.dzikirpagipetangapp.R
import com.example.dzikirpagipetangapp.toHtml
import kotlinx.android.synthetic.main.activity_main_item_landasan.view.*


class DemoViewPagerAdapter (
    private val context: Context

    ): RecyclerView.Adapter<DemoViewPagerAdapter.EventViewHolder>(){

    val eventList = listOf(

        "<b>&lt;&lt;&emsp;&emsp;(QS.Al-Ahzab : 42 - 43)&emsp;&emsp;>> </b><br/>\n“Dan bertasbihlah kepada-Nya diwaktu pagi dan petang, Dialah yang memberi rahmat kepadamu dan malaikat-Nya (memohonkan ampunan untukmu), " +
        "Supaya Dia mengeluarkan kamu dari kegelapan kepada cahaya (yang terang)." +
        " Dan adalah Dia Maha Penyayang kepada orang-orang yang beriman”."
        ,
        "<b>&lt;&lt;&emsp;&emsp;(QS. Ghafir: 55)&emsp;&emsp;>> </b> <br/>\n“Maka bersabarlah kamu, karena sesungguhnya janji Allah itu benar, dan mohonlah ampunan untuk dosamu dan bertasbihlah seraya memuji Tuhanmu pada waktu sore dan pagi”."
        ,
        "<b>&lt;&lt;&emsp;&emsp;(QS. Ar-Rum: 17)&emsp;&emsp;>> </b><br/>\n“Maka bertasbihlah kepada Allah di waktu kamu berada di sore hari dan waktu kamu berada di waktu pagi hari”."
    )
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        return EventViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.activity_main_item_landasan, parent, false))
    }

    override fun getItemCount(): Int {

        return eventList.size

    }

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        Log.i("DEMO_ADAPTER", "HERE IT IS")
        (holder.view.tv_landasan_viewPager as? TextView)?.also{
            it.text =  eventList.get(position).toHtml()
        }


    }

    inner class EventViewHolder(val view: View) : RecyclerView.ViewHolder(view){

    }
}