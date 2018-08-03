package com.hust_twj.androidart.view.chapter1;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.hust_twj.androidart.R;
import com.hust_twj.androidart.utils.LogUtils;

/**
 *
 * Created by wenjing.tang on 2018/7/6.
 */

public class Chapter1Activity extends AppCompatActivity implements View.OnClickListener{

    private TextView mTvDialog;
    private TextView mTvStandard;
    private TextView mTvSingleTop;
    private TextView mTvSingleTask;
    private TextView mTvSingleInstance;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_chapter_1);

        LogUtils.e("twj123", "Chapter1Activity onCreate");

        findViews();
        bindListener();
    }

    private void findViews() {
        mTvDialog = findViewById(R.id.tv_dialog);
        mTvStandard = findViewById(R.id.tv_standard);
        mTvSingleTop = findViewById(R.id.tv_single_top);
        mTvSingleTask = findViewById(R.id.tv_single_task);
        mTvSingleInstance = findViewById(R.id.tv_single_instance);
    }

    private void bindListener() {
        mTvDialog.setOnClickListener(this);
        mTvStandard.setOnClickListener(this);
        mTvSingleTop.setOnClickListener(this);
        mTvSingleTask.setOnClickListener(this);
        mTvSingleInstance.setOnClickListener(this);
        findViewById(R.id.tv_intent_filter).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.tv_dialog:
                AlertDialog dialog = new AlertDialog.Builder(Chapter1Activity.this, R.style.Theme_AppCompat_DayNight_Dialog_Alert)
                        .setMessage("确定要清除数据吗？")
                        .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        })
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                                //setData("");
                            }
                        })
                        .create();
                // dialog.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);//关键
                dialog.show();
                break;
            case R.id.tv_standard:
                startActivity(new Intent(Chapter1Activity.this, StandardActivity.class));
                break;
            case R.id.tv_single_top:
                startActivity(new Intent(Chapter1Activity.this, SingleTopActivity.class));
                break;
            case R.id.tv_single_task:
                startActivity(new Intent(Chapter1Activity.this, SingleTaskActivity.class));
                break;
            case R.id.tv_single_instance:
                startActivity(new Intent(Chapter1Activity.this, SingleInstanceActivity.class));
                break;
            case R.id.tv_intent_filter:
                Intent intent = new Intent("com.hust_twj.chapter1.action1");
                //addCategory可以不添加，也可以添加一个或者多个Category
                //当不添加市，默认为android.intent.category.DEFAULT
                //添加一个或者多个时，必须保证在xml中都已定义
               // intent.addCategory("com.hust_twj.chapter1.category1");
                //intent.addCategory("com.hust_twj.chapter1.category2");
                startActivity(intent);
                break;
        }

    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        LogUtils.e("twj123","Chapter1Activity  onNewIntent"  );
    }

    @Override
    protected void onStart() {
        super.onStart();
        LogUtils.e("twj123","Chapter1Activity  onStart"  );
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        LogUtils.e("twj123","Chapter1Activity  onRestart"  );
    }

    @Override
    protected void onResume() {
        super.onResume();
        LogUtils.e("twj123","Chapter1Activity  onResume"  );
    }

    @Override
    protected void onPause() {
        super.onPause();
        LogUtils.e("twj123","Chapter1Activity  onPause"  );
    }

    @Override
    protected void onStop() {
        super.onStop();
        LogUtils.e("twj123","Chapter1Activity  onStop"  );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogUtils.e("twj123","Chapter1Activity  onDestroy"  );
    }
}
