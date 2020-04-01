package com.example.dzikirpagipetangapp.adapters

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CompoundButton
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.dzikirpagipetangapp.Constants
import com.example.dzikirpagipetangapp.DoaItem
import com.example.dzikirpagipetangapp.R
import com.example.dzikirpagipetangapp.activities.DetailActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.doa_item.view.*
import java.io.Serializable

class DzikirTitleListAdapter(
    private val context: Context,
    private val DoaItemsList: List<DoaItem>,
    private val DetailDoaText: String
)

    : RecyclerView.Adapter<DzikirTitleListAdapter.DoaPagiHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DoaPagiHolder {
        val view = DoaPagiHolder(LayoutInflater.from(parent.context).inflate(R.layout.doa_item, parent, false))
        return view
    }

    override fun getItemCount(): Int {
        return DoaItemsList.size
    }

    override fun onBindViewHolder(holder: DoaPagiHolder, position: Int) {
        Log.i("PAGI_ADAPTER: ", "GET_JUDUL: "+ DoaItemsList[position])

        // nge set nya di sini
        holder.setItem(DoaItemsList[position], position)
    }

    inner class DoaPagiHolder (itemView: View): RecyclerView.ViewHolder(itemView){
        private val textItemDoa = itemView.tv_item_doa
        private val textItemNumber = itemView.tv_item_doa_number
        private val checkBoxItem = itemView.checkbox_item_doa

        fun setItem (doaItem:DoaItem, pos:Int){
            textItemDoa.text = doaItem.title
            textItemNumber.text = (pos+1).toString() +"."


            checkBoxItem.isChecked = doaItem.checked
            checkBoxItem.setTag(pos)

            itemView.setOnClickListener(){
                val intent = Intent(context, DetailActivity::class.java)

                //harusnya bikin array of String, yg sekarang masih string
                // karena DetailDoaText isinya string, diisi dari fragment. berarti fragment yg lempar
                val constant =  Constants(context)
                intent.putExtra("number_of_doa", (pos+1).toString() +".")
                intent.putExtra(constant.KEY_DETAIL_DOA_OBJECT, doaItem as Serializable)
                intent.putExtra(constant.KEY_DETAIL_DOA_TITLE, DetailDoaText)
                context.startActivity(intent)
            }


//            itemView.checkbox_item_doa.setOnCheckedChangeListener() {
//                _, isChecked ->
//                val posInt = checkBoxItem.getTag()
//                if (isChecked)
//                    Toast.makeText(context,"Great ! Done This Dua: "+doaItem.title, Toast.LENGTH_SHORT).show()
//                else if (!isChecked)
//                    Toast.makeText(context,"Ooops ! You reset this", Toast.LENGTH_SHORT).show()
//            }

            checkBoxItem.setOnClickListener (object : View.OnClickListener{
                override fun onClick(v: View?){
                    val posInt = checkBoxItem.getTag() as Int
                    if(DoaItemsList.get(posInt).checked){
                        DoaItemsList[posInt].checked = false
                    }else{
                        DoaItemsList[posInt].checked = true
                    }
                }
            })

        }

    }
}