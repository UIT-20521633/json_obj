package com.example.app;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class IndexAdapter extends RecyclerView.Adapter<IndexAdapter.IndexViewHolder> {
    public List<index> indexList;
    public void setData(List<index> list){
        this.indexList=list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public IndexViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_index,parent,false);
        return new IndexViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull IndexViewHolder holder, int position) {
        index Index = indexList.get(position);
        if(Index == null){
            return;
        }
        holder.ic_Index.setImageResource(Index.resourceId);
        holder.iName.setText(Index.iName);
        holder.iValue.setText(Index.iValue);
        holder.iUnit.setText(Index.iUnit);
    }

    @Override
    public int getItemCount() {
        if(indexList != null){
            return indexList.size();
        }
        return 0;
    }

    public class IndexViewHolder extends RecyclerView.ViewHolder{
        public TextView iName;
        public TextView iValue;
        public TextView iUnit;
        public ImageView ic_Index;
        public IndexViewHolder(@NonNull View itemView) {
            super(itemView);
            iName = itemView.findViewById(R.id.item_index_name);
            iValue = itemView.findViewById(R.id.item_index_value);
            ic_Index = itemView.findViewById(R.id.ic_Index);
            iUnit = itemView.findViewById(R.id.item_index_dv);
        }
    }
}
