package ru.gpb.javacourse.Investments.infastructure.mappers;

import org.springframework.stereotype.Component;

@Component
public interface InvestmentsMapper {

    default int getMoney(int id) {
        //логика работы с базой, селект денег
        return 100;
    }

    default void insertSecurity(String security, int id) {
        //логика работы с базой, сохранение бумаг
    }

    default boolean selectSecurity(String security, int id) {
        return false;
    }
}
