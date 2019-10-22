package com.example.myapplication.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.model.Letter;
import com.example.myapplication.viewModel.MyViewModel;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private MyViewModel mMyViewModel;
    private TextView tvTitle, tvSub;
    private Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTitle =findViewById(R.id.tvTitle);
        tvSub =findViewById(R.id.tvSub);
        btnSend =findViewById(R.id.btnSend);

        mMyViewModel = ViewModelProviders.of(this).get(MyViewModel.class);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMyViewModel.RequestData();
            }
        });

        mMyViewModel.getRequestData().observe(this, new Observer<Letter>() {
            @Override
            public void onChanged(Letter letter) {
                tvTitle.setText(letter.getTitle());
                tvSub.setText(letter.getSub());
            }
        });
    }
}
