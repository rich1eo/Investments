package ru.gpb.javacourse.Investments.aplication.Exception;

import lombok.Getter;

@Getter
public enum errorType {
    PURCHASES_EXCEPTION("нехватает денег"),
    NO_ERRORS("опреция прошла успешно"),
    UNKNOWN_TYPE_OF_SERVICE("неизвестный тип услуги"),
    ERROR_AUTORIZATION("ошибка авторизации"),
    AUTHORIZATION_WAS_SUCCESSFUL("авторизация прошла успешно"),
    SALE_EXCEPTION("нет у клиента в наличии такой ценной бумаги");

    private final String message;

    errorType(String message) {
        this.message = message;
    }
}