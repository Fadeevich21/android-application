package com.example.lab1_2.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

import com.example.lab1_2.R;

public class HomeContent extends CardView {
    private TextView nicknameView;
    private ImageButton logoButton;
    private TextView subscribersView;

    private ImageView imageVideoView;
    private TextView videoNameView;
    private TextView yearsView;
    private TextView watchingView;

    private Button likeButton;
    private Button commentButton;
    private ImageButton replyButton;
    private ImageButton dislikeButton;


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
        inflate();
        initComponents();
        setAttributes(attrs);
    }

    private void inflate() {
        LayoutInflater inflater = (LayoutInflater) getContext().
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.home_content, this);
    }

    private void initComponents() {
        nicknameView = findViewById(R.id.nickname);
        logoButton = findViewById(R.id.logo);
        subscribersView = findViewById(R.id.subscribers);

        imageVideoView = findViewById(R.id.image_video);
        videoNameView = findViewById(R.id.video_name);
        yearsView = findViewById(R.id.year);
        watchingView = findViewById(R.id.watching);

        likeButton = findViewById(R.id.like_button);
        commentButton =  findViewById(R.id.comment_button);
        replyButton = findViewById(R.id.reply_button);
        dislikeButton = findViewById(R.id.dislike_button);
    }

    private void setAttributes(AttributeSet attrs) {
        @SuppressLint("Recycle") TypedArray typedArray = getTypedArray(attrs);

        setLogo(typedArray.getResourceId(R.styleable.HomeContent_logo, 0));
        setNickname(typedArray.getString(R.styleable.HomeContent_nickname));
        setSubscribers(typedArray.getString(R.styleable.HomeContent_number_subscribers));

        setImageVideo(typedArray.getResourceId(R.styleable.HomeContent_src_image_video, 0));
        setVideoName(typedArray.getString(R.styleable.HomeContent_video_name));
        setYears(typedArray.getString(R.styleable.HomeContent_year));
        setWatching(typedArray.getString(R.styleable.HomeContent_number_watching));

        setLikes(typedArray.getString(R.styleable.HomeContent_number_likes));
        setComments(typedArray.getString(R.styleable.HomeContent_number_comments));
    }


    private TypedArray getTypedArray(@Nullable AttributeSet attrs) {
        return getContext().obtainStyledAttributes(attrs, R.styleable.HomeContent);
    }


    private void setNickname(String nickname) {
        nicknameView.setText(nickname);
    }

    private void setLogo(int logoId) {
        logoButton.setImageResource(logoId);
    }

    private void setSubscribers(String subscribers) {
        subscribersView.setText(subscribers);
    }


    private void setImageVideo(int imageVideoId) {
        imageVideoView.setImageResource(imageVideoId);
    }

    private void setVideoName(String videoName) {
        videoNameView.setText(videoName);
    }

    private void setYears(String years) {
        yearsView.setText(years);
    }

    private void setWatching(String watching) {
        watchingView.setText(watching);
    }


    private void setLikes(String likes) {
        likeButton.setText(likes);
    }

    private void setComments(String comments) {
        commentButton.setText(comments);
    }
}
