package com.example.admin.birthdayapp;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondaryActivity extends AppCompatActivity {

    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondary);

        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.NAME);

        TextView txtB = (TextView)findViewById(R.id.txtB);
        TextView txtName = (TextView)findViewById(R.id.txtName);

        txtB.setText("Happy Birthday");
        txtB.setTextSize(25);

        txtB.setTextColor(Color.parseColor("#008000"));

        txtB.setTypeface(null, Typeface.BOLD_ITALIC);
        txtName.setText(name);
        txtName.setTextColor(Color.parseColor("#275c8d"));
        txtName.setTextSize(20);
        txtName.setBackgroundColor(Color.parseColor("#008000"));
        txtName.setTypeface(null, Typeface.BOLD_ITALIC);
        TextView txtMsg = (TextView)findViewById(R.id.txtMsg);
        txtMsg.setText("May you have such an incredibly special birthday that every day afterward starts and ends with joy, love, laughter and peace of mind.");
        txtMsg.setBackgroundColor(Color.parseColor("#275c8d"));
        txtMsg.setTypeface(null, Typeface.ITALIC);
    }

    public void play(View v)
    {

        mp = MediaPlayer.create(this,R.raw.musics);
        mp.start();
    }

    public void stop(View v)
    {

        mp.stop();
    }
}
