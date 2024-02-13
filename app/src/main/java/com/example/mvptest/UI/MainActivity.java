package com.example.mvptest.UI;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mvptest.R;

public class MainActivity extends AppCompatActivity implements CountryView {
    private Button btngetCountry;
    private TextView txtCountry;
    private CountryPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btngetCountry = findViewById(R.id.btngetCountry);
        txtCountry = findViewById(R.id.textView);
        presenter = new CountryPresenter(this);
        btngetCountry.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                presenter.getCountryName();
            }
        });
    }
    @Override
    public void onGetCountry(String country) {
        txtCountry.setText(country);
    }
}