package com.example.thancv.statepatternexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        StateRadio onRadio = new OnRadio();
        StateRadio offRadio = new OffRadio();

        Radio radio = new Radio();
        radio.setStateRadio(onRadio);
        radio.setStateRadio(offRadio);

        Log.e("aaaaaa", radio.isOpenRadio() + "");

    }
}
