package com.eng1neeer_93.telegrambot.service;

import com.eng1neeer_93.telegrambot.config.BotConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Service
public class TelegramBot extends TelegramLongPollingBot {
    private final BotConfig botConfig;

    @Autowired
    public TelegramBot(BotConfig botConfig) {
        super(botConfig.getBotToken());
        this.botConfig = botConfig;
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()){
            String message = update.getMessage().getText();
            long chatID = update.getMessage().getChatId();

            switch (message) {
                case "/info":
                    sendMessage(chatID,"This is Telegram Java bot");
                    break;
                case "/start":
                    startCommand(chatID, update.getMessage().getChat().getFirstName());
                    break;
                default:
                    sendMessage(chatID,"Command is unknown");

            }
        }
    }

    private void sendMessage(long chatID, String sendMessageText) {
        SendMessage message = new SendMessage();
        message.setChatId(chatID);
        message.setText(sendMessageText);

        try {
            execute(message);
        } catch (TelegramApiException e) {
            throw new RuntimeException(e);
        }

    }

    private void startCommand(long chatID, String firstName) {
        String answer = firstName+", hello.";
        sendMessage(chatID, answer);
    }

    @Override
    public String getBotUsername() {
        return botConfig.getBotName();
    }
}
