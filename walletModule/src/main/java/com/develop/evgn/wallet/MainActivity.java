package com.develop.evgn.wallet;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView sumView;
    private Button btnAdd;
    private Button btnTake;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sumView = (TextView)findViewById(R.id.sumView);

        btnAdd = (Button)findViewById(R.id.btnAdd);
        btnTake = (Button)findViewById(R.id.btnTake);
    }
}
