package com.cookandroid.progject5_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String result;
    EditText edTxt;
    TextView txtView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(baseLayout, params);

        edTxt = new EditText(this);
        edTxt.setText("Android");

        Button btn = new Button(this);
        btn.setText("버튼입니다.");

        txtView = new TextView(this);
        txtView.setText("텍스트뷰입니다.");

        baseLayout.addView(edTxt);
        baseLayout.addView(btn);
        baseLayout.addView(txtView);

        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                result=edTxt.getText().toString();
                txtView.setText(result);
            }
        });
    }
}