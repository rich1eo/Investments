package ru.gpb.javacourse.Investments.infastructure.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.gpb.javacourse.Investments.aplication.workingWithTheDatabase.AppealDatabase;
import ru.gpb.javacourse.Investments.infastructure.mappers.InvestmentsMapper;

import java.util.List;

@Component
public class AppealDAO implements AppealDatabase {
    private InvestmentsMapper investmentsMapper;

    @Autowired
    public AppealDAO(InvestmentsMapper investmentsMapper) {
        this.investmentsMapper = investmentsMapper;
    }
    @Override
    public int getMoney(int id) {
        return investmentsMapper.getMoney(id);
    }

    @Override
    public void saveMoney(int money, int id) {
        investmentsMapper.insertMoney(money, id);
    }

    @Override
    public boolean getSecurity(String security, int id) {
        return investmentsMapper.getSecurity(security, id);
    }

    @Override
    public void saveSecurity(String security, int id) {
        investmentsMapper.saveSecurity(security, id);
    }

    @Override
    public boolean checkBalance(String login, int password) {
        return investmentsMapper.checkBalance(login, password);
    }

    @Override
    public List<String> getPossession(int id) {
        return null;
    }


}
