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

public class SingleTaskActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_single_task);

        LogUtils.e("twj123", " onCreate");


        findViewById(R.id.tv_activity_b).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SingleTaskActivity.this, Chapter1Activity.class));
            }
        });
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        LogUtils.e("twj123", " onNewIntent");
    }

    /**
     * 执行onNewIntent，onCreate不会执行，onStart会执行
     */
    @Override
    protected void onStart() {
        super.onStart();
        LogUtils.e("twj123", " onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        LogUtils.e("twj123", " onResume");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        LogUtils.e("twj123", " onRestart");
    }
}
