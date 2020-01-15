package com.mengo.gallery.httpUtil;

public interface DataCallback<T> {
    void success(T t);

    void failed(String result);
}
