package com.example.pillreminderapp.datastorage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.pillreminderapp.R;

class MedicineViewHolder extends RecyclerView.ViewHolder {
    private final TextView MedicineItemView;

    private MedicineViewHolder(View itemView) {
        super(itemView);
        MedicineItemView = itemView.findViewById(R.id.textView);
    }

    public void bind(String text) {
        MedicineItemView.setText(text);
    }

    static MedicineViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recyclerview_item, parent, false);
        return new MedicineViewHolder(view);
    }
}