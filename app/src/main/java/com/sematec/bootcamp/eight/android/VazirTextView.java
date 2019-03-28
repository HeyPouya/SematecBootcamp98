package com.sematec.bootcamp.eight.android;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;

public class VazirTextView extends AppCompatTextView {

    public VazirTextView(Context context) {
        super(context);
    }

    public VazirTextView(Context context, AttributeSet attrs) {
        super(context, attrs);


        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "vazir.ttf");
        this.setTypeface(typeface);
    }
}
