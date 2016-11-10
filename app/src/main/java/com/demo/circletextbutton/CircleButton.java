package com.demo.circletextbutton;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.widget.TextView;


/**
 * Created by wang on 2016/11/10.
 */

public class CircleButton extends TextView {

    private Context mContext;

    public CircleButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
    }

    @Override
    protected void onDraw(Canvas canvas) {

        Paint paint = new Paint();
        paint.setColor(ContextCompat.getColor(mContext, R.color.colorPrimary));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((float) 3.0);
        canvas.drawCircle(DensityUtil.dip2px(mContext, 78), DensityUtil.dip2px(mContext, 78), (getMeasuredWidth() - 10) / 2, paint);
        super.onDraw(canvas);
    }
}
