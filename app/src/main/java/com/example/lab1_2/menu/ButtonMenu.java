package com.example.lab1_2.menu;

import android.content.Context;

import java.util.Objects;

public abstract class ButtonMenu {
    protected final String name;

    public ButtonMenu(String name) {
        this.name = name;
    }

    public boolean checkButtonName(String name) {
        return Objects.equals(this.name, name);
    }

    public abstract void onClick(Context context);
}
