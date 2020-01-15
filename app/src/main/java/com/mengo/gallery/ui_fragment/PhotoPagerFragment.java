package com.mengo.gallery.ui_fragment;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.mengo.gallery.R;
import com.mengo.gallery.adapter.ViewPagerAdapter;
import com.mengo.gallery.beans.Pixabay;
import com.mengo.gallery.beans.Pixabay.HitsBean;

import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class PhotoPagerFragment extends Fragment {

    private ViewPager2 viewPager2;
    private TextView textView;

    public PhotoPagerFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_photo_pager, container, false);
        viewPager2 = view.findViewById(R.id.viewPager);
        textView = view.findViewById(R.id.photoTag);
        return view;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ViewPagerAdapter adapter = new ViewPagerAdapter();
        List<HitsBean> beanList = getArguments().getParcelableArrayList("PHOTO_LIST");
        adapter.submitList(beanList);
        viewPager2.setAdapter(adapter);

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                textView.setText((position + 1) + "/" + beanList.size());
            }
        });
        viewPager2.setCurrentItem(getArguments().getInt("position_num"));


    }
}
