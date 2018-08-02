package com.hust_twj.androidart.view.chapter1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.hust_twj.androidart.R;
import com.hust_twj.androidart.utils.LogUtils;

/**
 *
 * Created by wenjing.tang on 2018/8/2.
 */

public class SingleInstanceActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_single_instance);

        LogUtils.e("twj123", " onCreate");

       // findViewById(R.id.)

    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        LogUtils.e("twj123", " onNewIntent");
    }
}
