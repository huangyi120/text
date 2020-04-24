package com.example.text;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class ShowBMIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_bmi);

        TextView show_name = (TextView) findViewById(R.id.tv_name);
        ImageView view1 = (ImageView) findViewById(R.id.iv_pic);
        TextView show_bmi = (TextView) findViewById(R.id.tv_bmi);

        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("name");
        String h = bundle.getString("h");
        String w = bundle.getString("w");

        double bmi = Double.parseDouble(w) / (Double.parseDouble(h)/100.0 * Double.parseDouble(h)/100.0);

        DecimalFormat df = new DecimalFormat("#.##");

        String msg="";
        if(bmi<18.5){
            msg=getString(R.string.strtoolow);
            view1.setImageResource(R.drawable.bmi1);
        }else if(bmi>24){
            msg=getString(R.string.strtoohigh);
            view1.setImageResource(R.drawable.bmi3);
        }else {
            msg=getString(R.string.strstd);
            view1.setImageResource(R.drawable.bmi2);
        }
        show_bmi.setText(name);
        show_bmi.setText(getString(R.string.strshowbmi) + df.format(bmi) + msg);
    }
}
