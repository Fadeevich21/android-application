package com.example.lab1_2.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

public class HomeContent extends CardView {
    private TextView nicknameView;
    private ImageButton logo;
    private TextView numberSubscribers;

    private ImageView imageVideoView;
    private TextView videoNameView;
    private TextView yearsView;
    private TextView watchingView;

    private TextView likesView;
    private TextView commentsView;
    private TextView repliesView;
    private TextView dislikesView;


    public HomeContent(@NonNull Context context) {
        super(context);

        init(null);
    }

    public HomeContent(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);

        init(attrs);
    }

    public HomeContent(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init(attrs);
    }

    private void init(@Nullable AttributeSet attrs) {

    }
}
