package com.example.text;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText name;
    private EditText h;
    private EditText w;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.ed_name);
        h = (EditText) findViewById(R.id.ed_height);
        w = (EditText) findViewById(R.id.ed_wegiht);
    }
//    public void show(View view) {
//
//        double w_value = Double.parseDouble(w.getText().toString());
//        double h_value = Double.parseDouble(h.getText().toString());
//        double bmi = w_value / (h_value/100.0 * h_value/100.0);
//
//        ImageView view1 = (ImageView) findViewById(R.id.imageView);
//
//        DecimalFormat df = new DecimalFormat("#.##");
//        TextView b = findViewById(R.id.tv_showbmi);
//
//        String msg="";
//        if(bmi<18.5){
//            msg="體重過輕!";
//            Toast.makeText(this, "要多吃肉肉囉", Toast.LENGTH_LONG).show();
//            view1.setImageResource(R.drawable.bmi1);
//        }else if(bmi>24){
//            msg="體重過重";
//            Toast.makeText(this, "要少吃肉肉囉!", Toast.LENGTH_LONG).show();
//            view1.setImageResource(R.drawable.bmi3);
//        }else {
//            msg="體重正常";
//            Toast.makeText(this, "繼續保持呦~", Toast.LENGTH_SHORT).show();
//            view1.setImageResource(R.drawable.bmi2);
//        }
//        b.setText(name.getText().toString() + "你的BMI是" + df.format(bmi) + msg);
//    }

    public void nextPage(View view) {
        Bundle bundle = new Bundle();
        bundle.putString("h",h.getText().toString());
        bundle.putString("w",w.getText().toString());
        bundle.putString("name",name.getText().toString());

        Intent intent = new Intent(this,ShowBMIActivity.class);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
