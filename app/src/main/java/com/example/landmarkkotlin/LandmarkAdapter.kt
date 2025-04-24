package com.example.landmarkkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.landmarkkotlin.databinding.RecyclerRowBinding

class LandmarkAdapter(val landmarkList:ArrayList<Landmark>): RecyclerView.Adapter<LandmarkAdapter.LandmarkHolder>()
{

    class LandmarkHolder(val binding:RecyclerRowBinding):RecyclerView.ViewHolder(binding.root){

    }


    //Layout ile bağlama işlemi yapılır
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LandmarkHolder {
        val binding=RecyclerRowBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return LandmarkHolder(binding)
    }

    //Kaç tane oluşturulcak
    override fun getItemCount(): Int {
        return landmarkList.size
    }

    //Bağlandıktan sonra ne olacak
    override fun onBindViewHolder(holder: LandmarkHolder, position: Int) {
        holder.binding.recyclerViewTextView.text=landmarkList.get(position).name
    }
}