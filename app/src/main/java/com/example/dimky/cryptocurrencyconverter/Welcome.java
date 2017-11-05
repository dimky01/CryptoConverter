package com.example.dimky.cryptocurrencyconverter;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.dimky.cryptocurrencyconverter.MainActivity;
import com.example.dimky.cryptocurrencyconverter.R;

/**
 * Created by Administrator on 9/16/2017.
 */


public class Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome);

        Button getStrated = (Button) findViewById(R.id.getStarted);

        getStrated.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Welcome.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
