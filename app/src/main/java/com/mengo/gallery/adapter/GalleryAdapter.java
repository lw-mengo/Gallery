package com.mengo.gallery.adapter;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.mengo.gallery.R;
import com.mengo.gallery.beans.Pixabay;

import java.util.ArrayList;

import io.supercharge.shimmerlayout.ShimmerLayout;

public class GalleryAdapter extends ListAdapter<Pixabay.HitsBean, GalleryAdapter.MyViewHolder> {

    public GalleryAdapter() {
        super(DIFF_CALLBACK);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gallery_cell, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
//        holder.itemView.setOnClickListener(view1 -> {
//            Bundle bundle = new Bundle();
//            bundle.putParcelable("PHOTO", getItem(holder.getAdapterPosition()));
//            Navigation.findNavController(holder.imageView).navigate(R.id.action_galleryFragment_to_photoFragment2, bundle);
//
//        });
        holder.itemView.setOnClickListener(view1 -> {
            Bundle bundle = new Bundle();
//            List<Pixabay.HitsBean> data = getCurrentList();
//            boolean b = data instanceof ArrayList;
//            Log.d("watch", String.valueOf(b));
//            ArrayList<Pixabay.HitsBean> result = new ArrayList<>(getCurrentList().size());
//            for (Pixabay.HitsBean bean : getCurrentList()) {
//                result.add(bean);
//            }
//            Log.d("watch", String.valueOf(result.size()));
            bundle.putParcelableArrayList("PHOTO_LIST", new ArrayList(getCurrentList()));
            bundle.putInt("position_num", holder.getAdapterPosition());
            Navigation.findNavController(holder.itemView).navigate(R.id.action_galleryFragment_to_photoPagerFragment, bundle);
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.shimmerLayout.setShimmerAngle(0);
        holder.shimmerLayout.setShimmerColor(0x55FFFFFF);
        holder.shimmerLayout.startShimmerAnimation();
        Glide.with(holder.itemView)
                .load(getItem(position).getPreviewURL())
                .placeholder(R.drawable.ic_photo_black_24dp)
                .listener(new RequestListener<Drawable>() {
                    @Override
                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                        if (holder.shimmerLayout != null) {
                            holder.shimmerLayout.stopShimmerAnimation();
                        }
                        return false;
                    }
                })
                .into(holder.imageView);
    }


    static class MyViewHolder extends RecyclerView.ViewHolder {
        ShimmerLayout shimmerLayout;
        ImageView imageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            shimmerLayout = itemView.findViewById(R.id.shimmerLayout);
            imageView = itemView.findViewById(R.id.pager_photo_cell);
        }
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
}
