package com.mengo.gallery.repository;

import com.mengo.gallery.beans.Pixabay;
import com.mengo.gallery.httpUtil.DataCallback;
import com.mengo.gallery.httpUtil.RetrofitUtil;

import java.util.Random;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PixabayRepository {

    public static PixabayRepository getInstance() {
        return new PixabayRepository();
    }

    private String[] keywords_random = {"cat", "car", "bus", "sky", "girl", "beauty", "animal"};

    public void fetchData(DataCallback<Pixabay> pixabayDataCallback) {
        Random random = new Random();
        int num = random.nextInt(keywords_random.length);
        String keywords = keywords_random[num];

        RetrofitUtil.getInstance().getService().fetchData(keywords).enqueue(new Callback<Pixabay>() {
            @Override
            public void onResponse(Call<Pixabay> call, Response<Pixabay> response) {
                pixabayDataCallback.success(response.body());
            }

            @Override
            public void onFailure(Call<Pixabay> call, Throwable t) {
                pixabayDataCallback.failed(t.toString());
            }
        });

    }

}
