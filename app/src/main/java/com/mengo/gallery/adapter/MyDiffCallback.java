package com.mengo.gallery.adapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import com.mengo.gallery.beans.Pixabay;

public class MyDiffCallback extends DiffUtil.ItemCallback<Pixabay.HitsBean> {
    @Override
    public boolean areItemsTheSame(@NonNull Pixabay.HitsBean oldItem, @NonNull Pixabay.HitsBean newItem) {
        return oldItem == newItem;
    }

    @Override
    public boolean areContentsTheSame(@NonNull Pixabay.HitsBean oldItem, @NonNull Pixabay.HitsBean newItem) {
        return oldItem.getId() == newItem.getId();
    }
}
