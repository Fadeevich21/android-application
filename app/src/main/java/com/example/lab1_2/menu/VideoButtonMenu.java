package com.example.lab1_2.menu;

import android.content.Context;
import android.widget.Toast;

public class VideoButtonMenu extends ButtonMenu {
    public VideoButtonMenu() {
        super("Видео");
    }

    @Override
    public void onClick(Context context) {
        Toast toast = Toast.makeText(context, name, Toast.LENGTH_SHORT);
        toast.show();
    }
}
