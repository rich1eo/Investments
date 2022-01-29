package ru.gpb.javacourse.Investments.aplication.dto;

import lombok.Getter;

@Getter
public class Investment {
    Client client;
    String typeOfPurchaseAndSale;
    String nameOfTheSecurity;
}
