package com.mengo.gallery.ui_fragment;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.mengo.gallery.beans.Pixabay;

public class GalleryViewModel extends AndroidViewModel {
    public GalleryViewModel(@NonNull Application application) {
        super(application);
    }

    // TODO: Implement the ViewModel
    public MutableLiveData<Pixabay> data;


}
