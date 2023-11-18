package com.eng1neeer_93.telegrambot.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class CurrencyJSON {
    @JsonProperty("cc")
    private String currencyCode;

    @JsonProperty("txt")
    private String currencyText;

    @JsonProperty("rate")
    private double rate;
}
