package ru.gpb.javacourse.Investments.aplication.workingWithTheDatabase;

public interface AppealDatabase {
    int getMoney(int id);//просмотр сколько денег на балансе
    void insertMoney(String security, int id);//положить деньги на баланс
    boolean selectSecurity(String security, int id);//просмотр есть ли такая ценная бумага
}
