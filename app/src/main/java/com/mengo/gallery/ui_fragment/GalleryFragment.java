package com.mengo.gallery.ui_fragment;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import com.mengo.gallery.R;
import com.mengo.gallery.adapter.GalleryAdapter;
import com.mengo.gallery.adapter.MyDiffCallback;
import com.mengo.gallery.beans.Pixabay;
import com.mengo.gallery.repository.PiaxbayRepository;

import java.util.List;

public class GalleryFragment extends Fragment {

    private GalleryViewModel mViewModel;

    public static GalleryFragment newInstance() {
        return new GalleryFragment();
    }

    private RecyclerView recyclerView;
    private SwipeRefreshLayout swipeRefreshLayout;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.gallery_fragment, container, false);
        recyclerView = view.findViewById(R.id.recycleView);
        swipeRefreshLayout = view.findViewById(R.id.swipeLayout);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mViewModel = ViewModelProviders.of(this, ViewModelProvider.AndroidViewModelFactory.getInstance(requireActivity().getApplication())).get(GalleryViewModel.class);
        // TODO: Use the ViewModel
        recyclerView.setLayoutManager(new GridLayoutManager(requireContext(), 2));
        GalleryAdapter galleryAdapter = new GalleryAdapter();
        recyclerView.setAdapter(galleryAdapter);
        if (mViewModel.data == null) {
            mViewModel.data = PiaxbayRepository.fetchData();
        }
        mViewModel.data.observe(this, pixabay -> {
            Log.d("my_log", "onChanged: " + pixabay.getTotal());
            galleryAdapter.submitList(pixabay.getHits());
        });


        swipeRefreshLayout.setOnRefreshListener(() -> {
            mViewModel.data = PiaxbayRepository.fetchData();

        });
    }

}
