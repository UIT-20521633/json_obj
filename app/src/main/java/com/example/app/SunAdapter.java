package com.example.app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SunAdapter extends RecyclerView.Adapter<SunAdapter.SunViewHolder> {
    public List<Sun> sunList;
    public void setData(List<Sun> list){
        this.sunList=list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public SunViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sun,parent,false);
        return new SunViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SunViewHolder holder, int position) {
        Sun sun = sunList.get(position);
        if(sun == null){
            return;
        }
        holder.ic_Sun.setImageResource(sun.resourceId);
        holder.sunName.setText(sun.sunName);
        holder.sunValue.setText(sun.sunValue);
    }

    @Override
    public int getItemCount() {
        if(sunList != null){
            return sunList.size();
        }
        return 0;
    }

    public class SunViewHolder extends RecyclerView.ViewHolder{
        public TextView sunName;
        public TextView sunValue;
        public ImageView ic_Sun;
        public SunViewHolder(@NonNull View itemView) {
            super(itemView);
            sunName = itemView.findViewById(R.id.item_sun_name);
            sunValue = itemView.findViewById(R.id.item_sun_value);
            ic_Sun = itemView.findViewById(R.id.ic_sun);
        }
    }
}
