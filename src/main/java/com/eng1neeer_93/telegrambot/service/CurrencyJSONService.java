package com.eng1neeer_93.telegrambot.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

@Service
@PropertySource("application.properties")
public class CurrencyJSONService {
    private static String URL;

    @Value("${json.url}")
    public static void setURL(String url) {
        CurrencyJSONService.URL = url;
    }
}
