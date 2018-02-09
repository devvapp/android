package com.devvapp.play.sunshine;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // field to store the weather display TextView
    TextView weatherDataTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forecast);

        // Use findViewById to get a reference to the weather display TextView
        weatherDataTextView = (TextView) findViewById(R.id.tv_weather_data);

        // Create an array of Strings that contain fake weather data
        String[] weatherDataList = {"Today 10pm, cloudy, 23/15","Today 11pm, cloudy, 22/14 ", "Today 12pm, cloudy, 19/12 "};

        // Append each String from the fake weather data array to the TextView
        for(String weatherData : weatherDataList){
            weatherDataTextView.append(weatherData + "\n\n\n");
        }
    }
}
