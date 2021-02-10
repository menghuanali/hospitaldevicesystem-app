package com.pch.demo.ui.adapter;

import android.content.Context;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.pch.demo.R;
import com.pch.demo.common.MyAdapter;

/**
 *    author : 潘成花
 *    
 *    time   : 2020/11/05
 *    desc   : 可进行拷贝的副本
 */
public final class CopyAdapter extends MyAdapter<String> {

    public CopyAdapter(Context context) {
        super(context);
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder();
    }

    private final class ViewHolder extends MyAdapter.ViewHolder {

        private ViewHolder() {
            super(R.layout.copy_item);
        }

        @Override
        public void onBindView(int position) {

        }
    }
}