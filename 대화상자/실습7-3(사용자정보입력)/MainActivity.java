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

    TextView tvName, tvEmail;
    Button button1;
    EditText dlgEdtName, dlgEdtEmail;
    TextView toastText;
    View dialogView, toastView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("사용자 정보 입력");

        tvName=(TextView)findViewById(R.id.tvName);
        tvEmail=(TextView)findViewById(R.id.tvEmail);
        button1=(Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                dialogView=(View)View.inflate(MainActivity.this,R.layout.dialog1,null);
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity.this);
                dlg.setTitle("사용자 정보 입력");

                dlg.setView(dialogView);
                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dlgEdtName=(EditText)dialogView.findViewById(R.id.dlgEdit1);
                        dlgEdtEmail=(EditText)dialogView.findViewById(R.id.dlgEdit2);

                        tvName.setText(dlgEdtName.getText().toString());
                        tvEmail.setText(dlgEdtEmail.getText().toString());
                    }
                });
                dlg.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast toast = new Toast(MainActivity.this);
                        toastView=(View)View.inflate(MainActivity.this, R.layout.toast1,null);
                        toastText=(TextView)toastView.findViewById(R.id.toastText1);
                        toastText.setText("취소했습니다");
                        toast.setView(toastView);
                        toast.show();
                    }
                });
                dlg.show();
            }
        });
    }



}
