package com.cookandroid.multiautotv;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] items = {"CSI-뉴욕", "CSI-라스베가스","CSI-마이애미", "Friends", "Fringe", "Lost"};
        String[] mulitems = {"c언어", "java", "perl", "php", "json", "javascript", "python", "c#", "c++"};

        AutoCompleteTextView auto = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, items);
        auto.setAdapter(adapter);

        MultiAutoCompleteTextView multi = (MultiAutoCompleteTextView)findViewById(R.id.multiAutoCompleteTextView1);
        MultiAutoCompleteTextView.CommaTokenizer token = new MultiAutoCompleteTextView.CommaTokenizer();
        ArrayAdapter<String> muladapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, mulitems);
        multi.setTokenizer(token);
        multi.setAdapter(muladapter);

    }
}