package com.cookandroid.myapplication3;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Html;
import android.view.KeyEvent;
import android.view.MotionEvent;
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

    TextView textAndroid;
    RadioGroup rgroup1;
    RadioButton rdored, rdogreen, rdoblue;
    Button btnLeft, btnRight, btnDel, btnEnter, btnClr;
    EditText edit1;
    int l=0;
    int r=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("4번");

        textAndroid=(TextView)findViewById(R.id.TextAndroid);
        rgroup1=(RadioGroup)findViewById(R.id.Rgroup1);
        rdored=(RadioButton)findViewById(R.id.Rdored);
        rdogreen=(RadioButton)findViewById(R.id.Rdogreen);
        rdoblue=(RadioButton)findViewById(R.id.Rdoblue);
        btnLeft=(Button)findViewById(R.id.BtnLeft);
        btnRight=(Button)findViewById(R.id.BtnRight);
        btnDel=(Button)findViewById(R.id.BtnDel);
        btnEnter=(Button)findViewById(R.id.BtnEnter);
        btnClr=(Button)findViewById(R.id.BtnCLR);
        edit1=(EditText)findViewById(R.id.Edit1);

        textAndroid.setTextColor(Color.RED);
        textAndroid.setTypeface(Typeface.SANS_SERIF, Typeface.BOLD_ITALIC);

        rgroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (rgroup1.getCheckedRadioButtonId()) {
                    case R.id.Rdored:
                        textAndroid.setTextColor(Color.RED);
                        break;
                    case R.id.Rdogreen:
                        textAndroid.setTextColor(Color.GREEN);
                        break;
                    case R.id.Rdoblue:
                        textAndroid.setTextColor(Color.BLUE);
                        break;
                }
            }
        });

        btnLeft.setOnTouchListener(new View.OnTouchListener() {

            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btnLeft.setText("Click");
                return false;
            }
        });
        btnRight.setOnTouchListener(new View.OnTouchListener() {

            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                btnRight.setText("Click");
                return false;
            }
        });

        btnDel.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=edit1.getText().toString();
                edit1.setText(str.substring(0,str.length()-1));
            }
        });
        btnEnter.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),edit1.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
        btnClr.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                edit1.setText("");
            }
        });
    }
}