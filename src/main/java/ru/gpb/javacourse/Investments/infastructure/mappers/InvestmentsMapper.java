package ru.gpb.javacourse.Investments.infastructure.mappers;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface InvestmentsMapper {

    default int getMoney(int id) {
        //логика работы с базой, селект денег
        return 100;
    }

    default void insertMoney(int money, int id) {
        //логика работы с базой, сохранение денег
    }

    default boolean getSecurity(String security, int id) {
        //логика с базой, узнать есть ли такая облигация у клиента
        return false;
    }

    default void saveSecurity(String security, int id) {
        //логика работы с базой, сохранение облигаций
    }

    default boolean checkBalance(String login, int password) {
        //логика работы с базой, просмотр есть ли такой юзер
        return false;
    }

    default List<String> getPossession(int id) {
        return null;
    }
}
