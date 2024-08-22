package com.foreverinlove.adapter

import android.annotation.SuppressLint
import android.app.Activity
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.foreverinlove.R
import com.foreverinlove.objects.DetailPhase
import com.tomer.fadingtextview.FadingTextView


@SuppressLint("NotifyDataSetChanged")
class DetailsPhaseAdepter(
    val context: Activity,
    private var phaseData: ArrayList<DetailPhase>,
) :
    RecyclerView.Adapter<DetailsPhaseAdepter.Viewholder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Viewholder {
        val view: View =
            LayoutInflater.from(context).inflate(R.layout.gridview_item, parent, false)
        return Viewholder(view)
    }

    override fun onBindViewHolder(holder: Viewholder, position: Int) {

        holder.apply {


            if(phaseData[position].txtDetail!=""){
                txtlable.text=mackCapital(phaseData[position].txtDetail)
            }else if (phaseData[position].txtfeedDetail.size == 1){
                txtlable.text=mackCapital(phaseData[position].txtfeedDetail.getOrNull(0)?:"")
            }else if (phaseData[position].txtfeedDetail.isNotEmpty()){
                txtfeedlable.setTexts(phaseData[position].txtfeedDetail)
            }

            Glide.with(context).load(phaseData[position].imageDetail).into(userImage)

            Log.d("TAG", "onBindViewHolder: testAbTextData>>"+txtlable.text.toString()+">>${phaseData[position].txtfeedDetail.size}>>${phaseData[position].txtDetail}")

            if(txtlable.text.toString() == ""){
                txtfeedlable.visibility=View.VISIBLE
                txtlable.visibility=View.GONE
            }else{
                txtlable.visibility=View.VISIBLE
                txtfeedlable.visibility=View.GONE
            }


        }


    }


    override fun getItemCount(): Int {
        return phaseData.size
    }


    inner class Viewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val userImage: ImageView = itemView.findViewById(R.id.imglable)
        val txtfeedlable: FadingTextView = itemView.findViewById(R.id.txtfeedlable)
        val txtlable: TextView = itemView.findViewById(R.id.txtlable)

    }

    fun mackCapital(text:String): String {
        return text.substring(0,1).toUpperCase()+text.substring(1).toLowerCase()
    }

}