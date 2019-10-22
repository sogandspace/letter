package com.example.myapplication.model;

public interface MyCallback<T> {

    void onSucessful(T data);

    void onError (String message);
}
