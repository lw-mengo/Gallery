package com.mengo.gallery.httpUtil;

import com.mengo.gallery.beans.Pixabay;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WebService {
    @GET("?key=14895210-2bc8008ffe819bad6ed156565&image_type=photo&per_page=100")
    Call<Pixabay> fetchData(@Query("q") String keywords);
}
