package com.coderefer.customviewtutorial;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class CurvedView extends View {

    public CurvedView(Context context) {
        super(context);
    }

    public CurvedView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        TypedArray typedArray = getContext().obtainStyledAttributes(attrs, R.styleable.CurvedView);
        int count = typedArray.getInt(R.styleable.CurvedView_cv_count,1);
        typedArray.recycle();
    }

    public CurvedView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int widthMode = MeasureSpec.getMode(widthMeasureSpec);
        int widthSize = MeasureSpec.getSize(widthMode);
        int heightMode = MeasureSpec.getMode(heightMeasureSpec);
        int heightSize = MeasureSpec.getSize(heightMode);
    }
}
