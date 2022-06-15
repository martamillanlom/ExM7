package com.example.appm7recuperacio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.sql.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /**
         * main pot ser:
         * sunny
         * snow
         * cloud
         * fog
         */

        City Barcelona = new City("Barcelona", "0º", "sunny", "60%", "Lorem Ipsum dolor Sit amet", new ArrayList<Weather>(), new ArrayList<Weather>());
        Barcelona.today_prediction.add(new Weather("Now", "snow", "80%", "0º", ""));
        Barcelona.today_prediction.add(new Weather("10PM", "snow", "70%", "-3º", ""));
        Barcelona.today_prediction.add(new Weather("11PM", "snow", "30%", "2º", ""));
        Barcelona.today_prediction.add(new Weather("12AM", "cloud", "", "0º", ""));
        Barcelona.today_prediction.add(new Weather("1AM", "cloud", "", "4º", ""));
        Barcelona.today_prediction.add(new Weather("2AM", "cloud", "", "4º", ""));
        Barcelona.today_prediction.add(new Weather("3AM", "cloud", "", "10º", ""));

        Barcelona.tenday_prediction.add(new Weather("Today", "snow", "60%", "0º", "5º"));
        Barcelona.tenday_prediction.add(new Weather("Tue", "snow", "60%", "0º", "5º"));
        Barcelona.tenday_prediction.add(new Weather("Wed", "snow", "60%", "-1º", "5º"));
        Barcelona.tenday_prediction.add(new Weather("Thu", "snow", "60%", "-3º", "13º"));
        Barcelona.tenday_prediction.add(new Weather("Fri", "snow", "60%", "2º", "5º"));
        Barcelona.tenday_prediction.add(new Weather("Sat", "cloud", "", "10º", "15º"));
        Barcelona.tenday_prediction.add(new Weather("Sun", "cloud", "", "-1º", "12º"));


    }
}