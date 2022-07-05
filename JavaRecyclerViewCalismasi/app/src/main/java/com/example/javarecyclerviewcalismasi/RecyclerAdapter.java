package com.example.javarecyclerviewcalismasi;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.javarecyclerviewcalismasi.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.LandMarkHolder>{
    ArrayList<LandMark> arrayList;
    public RecyclerAdapter(ArrayList<LandMark> arrayList) {
        this.arrayList = arrayList;
    }
    @NonNull
    @Override
    public LandMarkHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding rw= RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new LandMarkHolder(rw);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.LandMarkHolder holder, int position) {
        holder.binding.recyclerRowTextView.setText(arrayList.get(position).name);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(holder.itemView.getContext(),DetailActivity.class);
                intent.putExtra("landmark",arrayList.get(position));
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class LandMarkHolder extends RecyclerView.ViewHolder{
        private RecyclerRowBinding binding;
        public LandMarkHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
