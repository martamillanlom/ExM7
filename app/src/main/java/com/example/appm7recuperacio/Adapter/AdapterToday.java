package com.example.appm7recuperacio.Adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AdapterToday extends RecyclerView.Adapter<AdapterToday.ViewHolder>{

    @NonNull
    @Override
    public AdapterToday.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterToday.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

        }
    }

}

