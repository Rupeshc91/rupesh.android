package com.customdrawable;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/**
 * Created by rupesh on 20/10/15.
 */
public class CustomScrollVIew extends ScrollView {
    private OnScrollChangedListener mOnScrollChangedListener;

    public interface OnScrollChangedListener {
        void onScrollChanged(ScrollView who, int l, int t, int oldl, int oldt);
    }

    public CustomScrollVIew(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomScrollVIew(Context context) {
        super(context);
    }

    public void setOnScrollChangedListener(OnScrollChangedListener listener) {
        mOnScrollChangedListener = listener;
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        if (mOnScrollChangedListener != null) {
            mOnScrollChangedListener.onScrollChanged(this, l, t, oldl, oldt);
        }

    }
}
