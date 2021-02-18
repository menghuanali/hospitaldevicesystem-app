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
public final class DataNoticeAdapter extends MyAdapter<String> {

    public DataNoticeAdapter(Context context) {
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
            super(R.layout.data_notice_item);
            mTextView = (TextView) findViewById(R.id.text_notice_title);
        }

        @Override
        public void onBindView(int position) {
            mTextView.setText(getItem(position));
        }
    }
}