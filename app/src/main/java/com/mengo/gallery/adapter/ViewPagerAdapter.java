package com.mengo.gallery.adapter;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.mengo.gallery.R;
import com.mengo.gallery.beans.Pixabay;

import uk.co.senab.photoview.PhotoView;

public class ViewPagerAdapter extends ListAdapter<Pixabay.HitsBean, ViewPagerAdapter.PagerPhotoViewHolder> {


    public ViewPagerAdapter() {
        super(DIFF_CALLBACK);
    }

    @NonNull
    @Override
    public PagerPhotoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pager_photo_view, parent, false);
        PagerPhotoViewHolder holder = new PagerPhotoViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull PagerPhotoViewHolder holder, int position) {
        Log.d("watch", "onBindViewHolder:::: " + getItem(position).getPageURL());
        Glide.with(holder.itemView)
                .load(getItem(position).getPreviewURL())
                .placeholder(R.drawable.ic_photo_black_24dp)
                .into(holder.photoView);
    }

    private static final DiffUtil.ItemCallback<Pixabay.HitsBean> DIFF_CALLBACK = new DiffUtil.ItemCallback<Pixabay.HitsBean>() {
        @Override
        public boolean areItemsTheSame(@NonNull Pixabay.HitsBean oldItem, @NonNull Pixabay.HitsBean newItem) {
            return oldItem == newItem;
        }

        @Override
        public boolean areContentsTheSame(@NonNull Pixabay.HitsBean oldItem, @NonNull Pixabay.HitsBean newItem) {
            return oldItem.getId() == newItem.getId();
        }
    };

    static class PagerPhotoViewHolder extends RecyclerView.ViewHolder {
        PhotoView photoView;

        public PagerPhotoViewHolder(@NonNull View itemView) {
            super(itemView);
            photoView = itemView.findViewById(R.id.pager_photo_view_image);
        }
    }
}
