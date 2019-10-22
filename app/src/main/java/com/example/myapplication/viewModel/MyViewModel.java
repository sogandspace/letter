package com.example.myapplication.viewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;

import com.example.myapplication.model.Letter;
import com.example.myapplication.model.MyCallback;
import com.example.myapplication.model.Repo;

public class MyViewModel extends AndroidViewModel {

    private MutableLiveData<Letter> mRecievedData;
    private Repo mRepo;

    public MyViewModel(@NonNull Application application) {
        super(application);
        mRecievedData = new MutableLiveData<>();
        mRepo = new Repo();
    }

    public void RequestData () {
        mRepo.getRequest(new MyCallback<Letter>() {

            @Override
            public void onSucessful(Letter data) {
                mRecievedData.setValue(data);

            }
            @Override
            public void onError(String message) {

            }
        });
    }

    public MutableLiveData<Letter> getRequestData() {
        return mRecievedData;
    }
}
