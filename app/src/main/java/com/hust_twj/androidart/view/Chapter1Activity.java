package com.hust_twj.androidart.view;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.hust_twj.androidart.R;
import com.hust_twj.androidart.utils.LogUtils;

/**
 *
 * Created by wenjing.tang on 2018/7/6.
 */

public class Chapter1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_chapter_1);

        LogUtils.e("twj123", "Chapter1Activity onCreate");
    }
}
