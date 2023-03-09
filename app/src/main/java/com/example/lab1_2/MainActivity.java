package com.example.lab1_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

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
        super.onCreate(savedInstanceState);

        menu = new Menu();
        ButtonMenu[] buttons = {new HomeButtonMenu(), new MoviesButtonMenu(),
                new CreateButtonMenu(), new VideoButtonMenu(), new ChannelButtonMenu()};
        fillMenu(buttons);

        setContentView(R.layout.activity_main);
    }

    public void onClickButtonMenu(View view) {
        menu.onClickButton(getApplicationContext(), view);
    }

    public void onClickSearch(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Поиск", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onClickSubscribe(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Подписаться", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onClickLogo(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Лого", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onClickMore(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Больше", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onClickLike(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Нравится", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onClickComment(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Комментарий", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onClickReply(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Отправить", Toast.LENGTH_SHORT);
        toast.show();
    }

    public void onClickDislike(View view) {
        Toast toast = Toast.makeText(getApplicationContext(), "Не нравится", Toast.LENGTH_SHORT);
        toast.show();
    }
}