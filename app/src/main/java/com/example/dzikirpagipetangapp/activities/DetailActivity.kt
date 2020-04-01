package com.example.dzikirpagipetangapp.activities

import android.graphics.Paint
import android.os.Build
import android.os.Bundle
import android.text.*
import android.text.style.ForegroundColorSpan
import android.util.Log
import android.view.View
import android.view.ViewTreeObserver
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import com.example.dzikirpagipetangapp.*
import com.google.android.material.card.MaterialCardView
import kotlinx.android.synthetic.main.activity_detail_doa.*


class DetailActivity : AppCompatActivity (){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_doa)
        val appbarView: Toolbar = findViewById(R.id.toolbar_detail_activity)
        setSupportActionBar(appbarView)


        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)

        appbarView.setNavigationOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                onBackPressed()
                finish()
            }
        })


        val bundle: Bundle? = intent.extras
//        val messageComing = bundle!!.getString("user_message")

        // NULL SAFETY WITH ====> variable?.let{  }
        // if bundle? becomes null? ; expression inside lambda will not be executed
        // NULL SAFETY WITH NOT NULL ASSERTTION ===> var!!.something

        bundle?.let {
            val constant = Constants(this)
            val numberOfDoa = bundle.getString("number_of_doa")
            val objComing = bundle.get(constant.KEY_DETAIL_DOA_OBJECT) as DoaItem
            val titleComing = bundle.getString(constant.KEY_DETAIL_DOA_TITLE)
//            supportActionBar!!.setTitle(titleComing)
            tv_title_detail_doa.text = titleComing

            val spannable = SpannableStringBuilder(numberOfDoa + "  " + objComing.title)
            spannable.setSpan(
                ForegroundColorSpan(ContextCompat.getColor(this@DetailActivity, R.color.colorAccent)),
                /* start index */ 0, /* end index */ 2,
                Spannable.SPAN_EXCLUSIVE_INCLUSIVE
            )
            tv_title_detail_doa.text = titleComing
            tv_detail_doa_item_title.text = spannable
            tv_detail_doa_item_ARAB.text = objComing.doa_pagi_item_arab!!.toHtml()
            tv_detail_doa_item_LATIN.text = objComing.doa_pagi_item_latin!!.toHtml()
            tv_detail_doa_item_ARTI.text = objComing.doa_pagi_item_arti!!.toHtml() //dari Extensions


            tv_detail_doa_item_LATIN_title.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
            tv_detail_doa_item_ARTI_title.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);
            tv_detail_doa_item_HADITS_title.setPaintFlags(Paint.UNDERLINE_TEXT_FLAG);

            Log.i("Detail_Activity: ", "DI_SINI_ARRAY_HADITS: 1111111=========")

            for (i in objComing.doa_pagi_item_hadits!!.indices) {
                // printing array elements
                Log.e("Detail_Activity", objComing.doa_pagi_item_hadits[i])
                val strAwal = if (i == 0) "" else "\n"
                tv_detail_doa_item_HADITS.append(strAwal + (i + 1).toString() + ". ")
                tv_detail_doa_item_HADITS.append(objComing.doa_pagi_item_hadits.get(i))

            }

        }


    }


}