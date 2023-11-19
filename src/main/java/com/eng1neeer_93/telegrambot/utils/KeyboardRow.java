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

        List<InlineKeyboardButton> secondRow = new ArrayList<>();

        InlineKeyboardButton rub = new InlineKeyboardButton();
        rub.setText("RU ruble");
        rub.setCallbackData("RUB");

        InlineKeyboardButton pln = new InlineKeyboardButton();
        pln.setText("PL zloty");
        pln.setCallbackData("PLN");

        InlineKeyboardButton cad = new InlineKeyboardButton();
        cad.setText("CA dollar");
        cad.setCallbackData("CAD");

        firstRow.add(usd);
        firstRow.add(eur);
        firstRow.add(ils);

        secondRow.add(rub);
        secondRow.add(pln);
        secondRow.add(cad);

        rows.add(firstRow);
        rows.add(secondRow);

        keyboardMarkup.setKeyboard(rows);

        return keyboardMarkup;
    }
}
