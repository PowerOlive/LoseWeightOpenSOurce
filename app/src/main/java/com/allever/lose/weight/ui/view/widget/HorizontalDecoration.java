package com.allever.lose.weight.ui.view.widget;

import android.graphics.Rect;

import androidx.recyclerview.widget.RecyclerView;

import android.view.View;

/**
 * @author hasee
 * @date 2017/8/29
 */

public class HorizontalDecoration extends RecyclerView.ItemDecoration {
    private int space;

    public HorizontalDecoration(int space) {
        this.space = space;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        int position = parent.getChildAdapterPosition(view);
        outRect.left = space;
        outRect.right = space;
        outRect.top = space / 2;
        outRect.bottom = space / 2;
    }
}
