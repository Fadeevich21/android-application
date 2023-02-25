package com.example.lab1_2.menu;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class Menu {
    private final ArrayList<ButtonMenu> buttons;

    public Menu() {
        buttons = new ArrayList<>();
    }

    public void addButton(ButtonMenu button) {
        buttons.add(button);
    }

    public void removeButton(ButtonMenu button) {
        buttons.remove(button);
    }

    public void onClickButton(Context context, View view) {
        for (ButtonMenu button : buttons) {
            if (button.checkButtonName(((Button) view).getText().toString())) {
                ((Button) view).setTextColor(Color.parseColor("#FD5622"));
                button.onClick(context);
                break;
            }
        }
    }
}
