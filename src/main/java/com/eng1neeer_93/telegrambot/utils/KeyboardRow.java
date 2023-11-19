package com.eng1neeer_93.telegrambot.utils;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class KeyboardRow {
    public static InlineKeyboardMarkup createKeyboardCurrency() {
        InlineKeyboardMarkup keyboardMarkup = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rows  = new ArrayList<>();

        List<InlineKeyboardButton> firstRow = new ArrayList<>();

        InlineKeyboardButton usd = new InlineKeyboardButton();
        usd.setText("US dollar");
        usd.setCallbackData("USD");

        InlineKeyboardButton eur = new InlineKeyboardButton();
        eur.setText("EU euro");
        eur.setCallbackData("EUR");

        InlineKeyboardButton ils = new InlineKeyboardButton();
        ils.setText("IL shekel");
        ils.setCallbackData("ILS");

        firstRow.add(usd);
        firstRow.add(eur);
        firstRow.add(ils);

        rows.add(firstRow);

        keyboardMarkup.setKeyboard(rows);

        return keyboardMarkup;
    }
}
