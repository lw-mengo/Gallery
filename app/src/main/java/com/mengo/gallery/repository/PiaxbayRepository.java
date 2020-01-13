package com.mengo.gallery.repository;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;

import com.mengo.gallery.beans.Pixabay;
import com.mengo.gallery.httpUtil.RetrofitUtil;

import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PiaxbayRepository {

    private final static String[] keywords_random = {"cat", "car", "bus", "sky", "girl", "beauty", "animal"};

    public static MutableLiveData<Pixabay> fetchData() {
        Random random = new Random();
        int num = random.nextInt(keywords_random.length);
        String keywords = keywords_random[num];
        MutableLiveData<Pixabay> data = new MutableLiveData<>();
        RetrofitUtil.getInstance().getService().fetchData(keywords).enqueue(new Callback<Pixabay>() {
            @Override
            public void onResponse(Call<Pixabay> call, Response<Pixabay> response) {
                data.setValue(response.body());
                Log.d("info", "onResponse: " +data.getValue().getTotal());
            }

            @Override
            public void onFailure(Call<Pixabay> call, Throwable t) {
                Log.d("error", "onFailure: " + t.toString());
            }
        });
        return data;
    }

}