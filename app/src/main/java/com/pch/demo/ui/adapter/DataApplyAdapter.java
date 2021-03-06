package com.pch.demo.ui.adapter;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.pch.demo.R;
import com.pch.demo.common.MyAdapter;

/**
 *    author : 潘成花
 *    time   : 2021/02/22
 *    desc   : 状态数据列表
 */
public final class DataApplyAdapter extends MyAdapter<String> {

    public DataApplyAdapter(Context context) {
        super(context);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder();
    }

    private final class ViewHolder extends MyAdapter.ViewHolder {

        private TextView mTextView;

        private ViewHolder() {
            super(R.layout.data_apply_item);
            mTextView = (TextView) findViewById(R.id.tv_status_text);
        }

        @Override
        public void onBindView(int position) {
            mTextView.setText(getItem(position));
        }
    }
}