package com.hust_twj.androidart.view;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

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

        bindListener();
    }

    private void bindListener() {
        findViewById(R.id.tv_dialog).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
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
            }
        });
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
