package com.hust_twj.androidart.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hust_twj.androidart.R;

import java.util.ArrayList;

/**
 *
 * Created by wenjing.tang on 2018/7/5.
 */

public class MainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;
    private ArrayList<SparseArray<String>> data;
    //private SparseArray data;

    public MainAdapter( Context mContext) {
        this.mContext = mContext;
    }

    public void setData(ArrayList<SparseArray<String>> data){
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_layout_activity_main, null, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        SparseArray<String> array = data.get(position);
        final int key = array.keyAt(0);
        String value = array.valueAt(0);

       // LogUtils.e("twj123",key +"--" + value );

        ((MainViewHolder)holder).mTextView.setText(value);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mOnItemClickedListener != null){
                    mOnItemClickedListener.onItemClicked(key);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }

    class MainViewHolder extends RecyclerView.ViewHolder{

        private TextView mTextView;

        MainViewHolder(View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.tv_chapter);
        }
    }

    public interface OnItemClickedListener{
        void onItemClicked(int chapter);
    }

    private OnItemClickedListener mOnItemClickedListener;

    public void setOnItemClickedListener(OnItemClickedListener onItemClickedListener){
        mOnItemClickedListener = onItemClickedListener;
    }
}
