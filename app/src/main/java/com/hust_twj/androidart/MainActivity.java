package com.hust_twj.androidart;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;

import com.hust_twj.androidart.adapter.MainAdapter;
import com.hust_twj.androidart.utils.LogUtils;
import com.hust_twj.androidart.view.Chapter1Activity;

import java.util.ArrayList;

/**
 *
 * Created by wenjing.tang on 2018/7/5.
 */

public class MainActivity extends AppCompatActivity {

    private MainAdapter mAdapter;
    private RecyclerView mRecycleView;

    private static final int CHAPTER_1 = 1;
    private static final int CHAPTER_2 = 2;
    private static final int CHAPTER_3 = 3;
    private static final int CHAPTER_4 = 4;
    private static final int CHAPTER_5 = 5;
    private static final int CHAPTER_6 = 6;
    private static final int CHAPTER_7 = 7;
    private static final int CHAPTER_8 = 8;
    private static final int CHAPTER_9 = 9;
    private static final int CHAPTER_10 = 10;
    private static final int CHAPTER_11 = 11;
    private static final int CHAPTER_12 = 12;
    private static final int CHAPTER_13 = 13;
    private static final int CHAPTER_14 = 14;
    private static final int CHAPTER_15 = 15;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LogUtils.e("twj123","MainActivity  onCreate"  );
        setContentView(R.layout.activity_main);

        mRecycleView = findViewById(R.id.recycle_view);

        initData();

        bindListener();
    }

    private void initData() {
        mRecycleView.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new MainAdapter(this);

        ArrayList<SparseArray<String>> list = new ArrayList<>();
        SparseArray<String> array = new SparseArray<>();
        array.put(CHAPTER_1, "第1章 生命周期");
        list.add(array);

        array = new SparseArray<>();
        array.put(CHAPTER_3, "第3章 View事件");
        list.add(array);

        array = new SparseArray<>();
        array.put(CHAPTER_4, "第4章 View工作原理");
        list.add(array);

        array = new SparseArray<>();
        array.put(CHAPTER_6, "第6章 Drawable");
        list.add(array);

        array = new SparseArray<>();
        array.put(CHAPTER_7, "第7章 动画");
        list.add(array);

        array = new SparseArray<>();
        array.put(CHAPTER_8, "第8章 Window WindowManager");
        list.add(array);

        array = new SparseArray<>();
        array.put(CHAPTER_9, "第9章 四大组件");
        list.add(array);

        array = new SparseArray<>();
        array.put(CHAPTER_10, "第10章 消息机制");
        list.add(array);

        array = new SparseArray<>();
        array.put(CHAPTER_11, "第11章 线程和线程池");
        list.add(array);

        array = new SparseArray<>();
        array.put(CHAPTER_12, "第12章 Bitmap和Cache");
        list.add(array);

        array = new SparseArray<>();
        array.put(CHAPTER_15, "第15章 性能优化");
        list.add(array);

        mAdapter.setData(list);
        mRecycleView.setAdapter(mAdapter);
    }

    private void bindListener() {
        mAdapter.setOnItemClickedListener(new MainAdapter.OnItemClickedListener() {
            @Override
            public void onItemClicked(int chapterIndex) {
                switch (chapterIndex){
                    case CHAPTER_1:
                        Intent intent1 = new Intent(MainActivity.this, Chapter1Activity.class);
                        startActivity(intent1);
                        //顺序：MainActivity  onPause ——》 Chapter1Activity onCreate --》 MainActivity  onStop
                        //结论：前一个activity的onStop在后面一个activity的onCreate之后执行
                        break;
                }
            }
        });
    }


    @Override
    protected void onStart() {
        super.onStart();
        LogUtils.e("twj123","MainActivity  onStart"  );
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        LogUtils.e("twj123","MainActivity  onRestart"  );
    }

    @Override
    protected void onResume() {
        super.onResume();
        LogUtils.e("twj123","MainActivity  onResume"  );
    }

    @Override
    protected void onPause() {
        super.onPause();
        LogUtils.e("twj123","MainActivity  onPause"  );
    }

    @Override
    protected void onStop() {
        super.onStop();
        LogUtils.e("twj123","MainActivity  onStop"  );
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogUtils.e("twj123","MainActivity  onDestroy"  );
    }
}
