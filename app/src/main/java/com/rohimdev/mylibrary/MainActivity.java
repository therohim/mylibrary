package com.rohimdev.mylibrary;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.rohimdev.sweetdialog.SweetDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvTest = findViewById(R.id.tv_test);
        tvTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SweetDialog dialog = new SweetDialog(MainActivity.this, SweetDialog.WARNING_TYPE);
                dialog.setConfirmText("OK");
                dialog.setConfirmBackground(ContextCompat.getDrawable(MainActivity.this,R.drawable.button_green_background));
                dialog.setConfirmColor("#000000");
                dialog.setConfirmClickListener(new SweetDialog.SweetClickListener() {
                    @Override
                    public void onClick(SweetDialog sweetDialog) {
                        dialog.dismiss();
                    }
                });
                dialog.show();
            }
        });
    }
}