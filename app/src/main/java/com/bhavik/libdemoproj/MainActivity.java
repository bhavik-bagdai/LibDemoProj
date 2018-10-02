package com.bhavik.libdemoproj;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.bhavik.butility.Airthmatic;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnsum, btnmin;
    EditText etfirst, etsec;
    TextView tvans;
    Airthmatic airthmatic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsum = findViewById(R.id.btnsum);
        btnmin = findViewById(R.id.btnmin);
        etfirst = findViewById(R.id.etfirst);
        etsec = findViewById(R.id.etsec);
        tvans = findViewById(R.id.tvans);
        airthmatic = new Airthmatic();
        btnsum.setOnClickListener(this);
        btnmin.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnsum :
                double ans = airthmatic.sum(Double.valueOf(etfirst.getText().toString()) , Double.valueOf(etsec.getText().toString()));
                tvans.setText(""+ans);
                break;
            case R.id.btnmin:
                double mans = airthmatic.min(Double.valueOf(etfirst.getText().toString()) , Double.valueOf(etsec.getText().toString()));
                tvans.setText(""+mans);
                break;
        }
    }
}
