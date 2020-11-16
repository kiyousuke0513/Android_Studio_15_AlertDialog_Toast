package com.example.alertdialog_toast;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void BTN_Toast_Trig(View view) {
        final Toast toast = Toast.makeText(getBaseContext(), "hello world",Toast.LENGTH_SHORT);
        toast.show();
        new CountDownTimer(1000, 100)
        {
            public void onTick(long millisUntilFinished) {toast.show();}
            public void onFinish() {toast.cancel();}
        }.start();
    }

    public void BTN_Alert_Dialog_Trig(View view) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
        alertDialog.setTitle("對話框測試");
        alertDialog.setMessage("這是一個對話視窗");
        alertDialog.setPositiveButton("關閉視窗", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //Toast.makeText(getBaseContext(),"確定",Toast.LENGTH_SHORT).show();
            }
        });
//        alertDialog.setNegativeButton("中立",(dialog, which) -> {
//            //setToast("中立");
//        });
//        alertDialog.setNeutralButton("取消",(dialog, which) -> {
//            //setToast("取消");
//        });
        alertDialog.setCancelable(true);
        alertDialog.show();
    }
}