package com.coolweather.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.idescout.sql.SqlScoutServer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SqlScoutServer.create(this, getPackageName());
    }
}
