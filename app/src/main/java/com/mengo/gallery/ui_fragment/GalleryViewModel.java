package com.mengo.gallery.ui_fragment;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.mengo.gallery.beans.Pixabay;
import com.mengo.gallery.httpUtil.DataCallback;
import com.mengo.gallery.repository.PixabayRepository;

public class GalleryViewModel extends AndroidViewModel implements DataCallback<Pixabay> {
    public GalleryViewModel(@NonNull Application application) {
        super(application);
    }

    // TODO: Implement the ViewModel
    private MutableLiveData<Pixabay> data;

    //    private String[] keywords_random = {"cat", "car", "bus", "sky", "girl", "beauty", "animal"};
//
    public MutableLiveData<Pixabay> getData() {
        if (data == null) {
            data = new MutableLiveData<>();
            fetchData();
        }
        return data;
    }

    //
    public void fetchData() {
        PixabayRepository.getInstance().fetchData(this);
    }

    @Override
    public void success(Pixabay pixabay) {
        this.data.setValue(pixabay);
    }

    @Override
    public void failed(String result) {

    }

//    public MutableLiveData<Pixabay> fetchData() {
//        Random random = new Random();
//        int num = random.nextInt(keywords_random.length);
//        String keywords = keywords_random[num];
//        RetrofitUtil.getInstance().getService().fetchData(keywords).enqueue(new Callback<Pixabay>() {
//            @Override
//            public void onResponse(Call<Pixabay> call, Response<Pixabay> response) {
//                data.setValue(response.body());
//            }
//
//            @Override
//            public void onFailure(Call<Pixabay> call, Throwable t) {
//                Log.d("jack", "onFailure: " + t.toString());
//            }
//        });
//        return data;
//    }
}
