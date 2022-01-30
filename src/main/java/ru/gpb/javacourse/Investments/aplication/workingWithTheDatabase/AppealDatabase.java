package ru.gpb.javacourse.Investments.aplication.workingWithTheDatabase;

import java.util.List;

public interface AppealDatabase {
    int getMoney(int id);//просмотр сколько денег на балансе
    void saveMoney(int money, int id);//положить деньги на баланс
    boolean getSecurity(String security, int id);//просмотр есть ли такая ценная бумага
    void saveSecurity(String security, int id);//сохранить ценную бумагу в базе
    boolean checkBalance(String login, int password);//посмотреть существует ли такой пользователь
    List<String> getPossession(int id);//достать все ценные бумаги клиента

}
