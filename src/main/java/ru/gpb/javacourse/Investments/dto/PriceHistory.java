package ru.gpb.javacourse.Investments.dto;

import lombok.Data;

import javax.persistence.OneToMany;
import java.time.LocalDateTime;


@Data
public class PriceHistory {
    private Long id;
    private LocalDateTime historyDate; // дата получения информации
    private double openPrice; // цена открытия
    private double lowPrice; // самая низкая цена
    private double highPrice; // самая высокая цена
    private double lastPrice; // цена последней сделки
    private String secId; //тикер ценной бумаги


}
