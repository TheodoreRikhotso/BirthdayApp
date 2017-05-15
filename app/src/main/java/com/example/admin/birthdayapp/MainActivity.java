package com.example.admin.birthdayapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String NAME="name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }

    public void card(View v)
    {
        EditText tvName= (EditText)findViewById(R.id.txtName);
       String name = tvName.getText().toString();
        Intent intent = new Intent(this, SecondaryActivity.class);
        intent.putExtra(NAME, name);
        startActivity(intent);


    }
}
