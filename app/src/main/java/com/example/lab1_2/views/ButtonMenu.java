package com.example.lab1_2.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import com.example.lab1_2.R;

public class ButtonMenu extends LinearLayout {
    private Button button;

    public ButtonMenu(Context context) {
        super(context);

        init(null);
    }

    public ButtonMenu(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(attrs);
    }

    public ButtonMenu(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init(attrs);
    }

    public ButtonMenu(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);

        init(attrs);
    }

    private void init(@Nullable AttributeSet attrs) {
        LayoutInflater inflater = (LayoutInflater) getContext().
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.button_menu, this);

        button = (Button) findViewById(R.id.button_menu);

        @SuppressLint("Recycle") TypedArray typedArray = getTypedArray(attrs);
        setImage(typedArray.getResourceId(R.styleable.ButtonMenu_src_image, 0));
        setText(typedArray.getString(R.styleable.ButtonMenu_text));
    }

    private TypedArray getTypedArray(@Nullable AttributeSet attrs) {
        return getContext().obtainStyledAttributes(attrs, R.styleable.ButtonMenu);
    }

    private void setImage(int imageId) {
        Drawable drawable = getResources().getDrawable(imageId);
        button.setCompoundDrawablesRelativeWithIntrinsicBounds(null, drawable, null, null);
    }

    private void setText(String text) {
        button.setText(text);
    }
}
