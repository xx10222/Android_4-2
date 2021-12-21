package com.cookandroid.final_practice;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.app.AlertDialog;
import android.app.FragmentTransaction;
import android.app.TabActivity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.media.Image;
import android.opengl.ETC1;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ContextMenu;
import android.view.Display;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SubMenu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Chronometer;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.MultiAutoCompleteTextView;
import android.widget.RadioButton;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import android.widget.ViewFlipper;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    String mName="???";
    String mPassword="???";

    TextView textResult;
    Button button;
    View dialogView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textResult=(TextView)findViewById(R.id.textResult);
        button=(Button)findViewById(R.id.Button1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialogView=(View)View.inflate(MainActivity.this,R.layout.dialog_login,null);
                AlertDialog.Builder dlg=new AlertDialog.Builder(MainActivity.this);
                dlg.setView(dialogView);
                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        final EditText dlgEdtName=(EditText)dialogView.findViewById(R.id.editName);
                        final EditText dlgEdtPassword=(EditText)dialogView.findViewById(R.id.editPassword);

                        mName=dlgEdtName.getText().toString();
                        mPassword=dlgEdtPassword.getText().toString();

                        textResult.setText("이름 : "+mName+"\n암호 : "+mPassword);
                    }
                });
                dlg.setNegativeButton("취소",null);
                dlg.show();
            }
        });

    }



}
