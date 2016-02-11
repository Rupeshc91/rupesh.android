package com.customdrawable;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.TargetApi;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ScrollView;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private ColorAnimationDrawable colorAnimationDrawable;
    private Drawable mActionBarBackgroundDrawable;

    @TargetApi(Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        mActionBarBackgroundDrawable = new ColorDrawable(Color.parseColor("#ff0000"));
//        getSupportActionBar().setBackgroundDrawable(mActionBarBackgroundDrawable);
        button = (Button) findViewById(R.id.button);
        Keyframe kf0 = Keyframe.ofFloat(0f, 0f);
        Keyframe kf1 = Keyframe.ofFloat(.5f, 360f);
        Keyframe kf2 = Keyframe.ofFloat(1f, 0f);
        PropertyValuesHolder pvhRotation = PropertyValuesHolder.ofKeyframe("rotation", kf0, kf1, kf2);
        ObjectAnimator rotationAnim = ObjectAnimator.ofPropertyValuesHolder(button, pvhRotation);
        rotationAnim.setDuration(5000);
        rotationAnim.start();
//
//        colorAnimationDrawable = new ColorAnimationDrawable();
//
//        button.setBackgroundDrawable(colorAnimationDrawable);
//        colorAnimationDrawable.start();
//        ((CustomScrollVIew) findViewById(R.id.scroll_view)).setOnScrollChangedListener(mOnScrollChangedListener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

//    private CustomScrollVIew.OnScrollChangedListener mOnScrollChangedListener = new CustomScrollVIew.OnScrollChangedListener() {
//        public void onScrollChanged(ScrollView who, int l, int t, int oldl, int oldt) {
//            final int headerHeight = findViewById(R.id.image_header).getHeight() - getSupportActionBar().getHeight();
//            final float ratio = (float) Math.min(Math.max(t, 0), headerHeight) / headerHeight;
//            final int newAlpha = (int) (ratio * 255);
//            mActionBarBackgroundDrawable.setAlpha(newAlpha);
//        }
//    };

}
