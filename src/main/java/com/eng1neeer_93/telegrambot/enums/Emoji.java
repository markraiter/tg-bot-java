package com.eng1neeer_93.telegrambot.enums;

public enum Emoji {
    SMILE(":smile:"),
    BLUSH(":blush:"),
    WINK_EYE(":stuck_out_tongue_winking_eye:"),
    MONEY_BAG(":moneybag:"),
    DOLLAR(":dollar:");

    private String emoji;

    Emoji(String emoji) {
        this.emoji = emoji;
    }

    public String getEmoji() {
        return emoji;
    }
}
