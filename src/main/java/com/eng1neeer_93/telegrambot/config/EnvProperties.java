package com.eng1neeer_93.telegrambot.config;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
//@PropertySource("file:/home/mark/code/java/src/telegram-bot/.env")
@PropertySource("file:.env")
public class EnvProperties {
}
