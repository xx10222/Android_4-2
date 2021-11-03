package com.cookandroid.myapplication3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2;
    ImageView img1, img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("3번");

        btn1=(Button)findViewById(R.id.Btn1);
        btn2=(Button)findViewById(R.id.Btn2);
        img1=(ImageView)findViewById(R.id.Img1);
        img2=(ImageView)findViewById(R.id.Img2);

        btn1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                img1.setVisibility(View.INVISIBLE);
            }
        });
        btn2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                img1.setImageResource(0);
            }
        });
    }
}