package com.example.lab1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.lab1_2.menu.Menu;
import com.example.lab1_2.menu.ButtonMenu;
import com.example.lab1_2.menu.HomeButtonMenu;
import com.example.lab1_2.menu.MoviesButtonMenu;
import com.example.lab1_2.menu.CreateButtonMenu;
import com.example.lab1_2.menu.VideoButtonMenu;
import com.example.lab1_2.menu.ChannelButtonMenu;

public class MainActivity extends AppCompatActivity {
    private Menu menu;

    private void fillMenu(ButtonMenu[] buttons) {
        for (ButtonMenu button : buttons)
            menu.addButton(button);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        menu = new Menu();
        ButtonMenu[] buttons = {new HomeButtonMenu(), new MoviesButtonMenu(),
                new CreateButtonMenu(), new VideoButtonMenu(), new ChannelButtonMenu()};
        fillMenu(buttons);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickButtonMenu(View view) {
        menu.onClickButton(getApplicationContext(), view);
    }
}