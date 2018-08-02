package com.hust_twj.androidart.view.chapter1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.hust_twj.androidart.R;
import com.hust_twj.androidart.utils.LogUtils;

/**
 *
 * Created by wenjing.tang on 2018/8/2.
 */

public class SingleTopActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_single_top);

        LogUtils.e("twj123", " onCreate");

        findViewById(R.id.tv_single_top).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SingleTopActivity.this, SingleTopActivity.class));
            }
        });
        findViewById(R.id.tv_activity_b).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SingleTopActivity.this, Chapter1Activity.class));
            }
        });

    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        LogUtils.e("twj123", " onNewIntent");
    }

    @Override
    protected void onStart() {
        super.onStart();
        LogUtils.e("twj123", " onStart");
    }
}
