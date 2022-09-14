package com.example.mypopupwindow;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Meng(View view) {

        View popupview = getLayoutInflater().inflate(R.layout.popup_view, null);

        View viewById = popupview.findViewById(R.id.button1);
        View viewById1 = popupview.findViewById(R.id.button2);
        PopupWindow popupWindow = new PopupWindow(popupview, ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        popupWindow.setBackgroundDrawable(getResources().getDrawable(com.google.android.material.R.drawable.abc_ic_star_black_16dp));
        popupWindow.showAsDropDown(view,view.getWidth(),-view.getHeight());
    }
}