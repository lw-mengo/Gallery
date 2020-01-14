package com.mengo.gallery.ui_fragment;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.mengo.gallery.beans.Pixabay;
import com.mengo.gallery.httpUtil.RetrofitUtil;
import com.mengo.gallery.repository.PiaxbayRepository;

import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GalleryViewModel extends AndroidViewModel {
    public GalleryViewModel(@NonNull Application application) {
        super(application);
    }

    // TODO: Implement the ViewModel
    private MutableLiveData<Pixabay> data;

    private String[] keywords_random = {"cat", "car", "bus", "sky", "girl", "beauty", "animal"};

    public MutableLiveData<Pixabay> getData() {
        String TAG = "bug_";
        if (data == null) {
            Log.d(TAG, "getData::::::this method executed!!! ");
            data = new MutableLiveData<>();
            fetchData();
        }
        else {
            fetchData();
        }
        return data;
    }

    public void fetchData() {
        this.data = PiaxbayRepository.getInstance().fetchData();
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
