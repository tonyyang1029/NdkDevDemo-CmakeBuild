package com.ty.android.ndkdevdemo_cmakebuild;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ty.android.ndkdevdemo.NdkLib;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView mTV        = null;
    private Button   mBtnGet    = null;
    private Button   mBtnUpdate = null;

    private NdkLib   mLib       = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLib = new NdkLib();

        mTV = findViewById(R.id.ID_MAIN_TV);
        mBtnGet = findViewById(R.id.ID_MAIN_BTN_GET);
        mBtnGet.setOnClickListener(this);
        mBtnUpdate = findViewById(R.id.ID_MAIN_BTN_UPDATE);
        mBtnUpdate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.ID_MAIN_BTN_GET:
                mTV.setText(mLib.getData());
                break;
            case R.id.ID_MAIN_BTN_UPDATE:
                mLib.updateData();
                break;
            default:
                break;
        }
    }
}
