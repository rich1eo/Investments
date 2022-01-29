package ru.gpb.javacourse.Investments.infastructure.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.gpb.javacourse.Investments.aplication.workingWithTheDatabase.AppealDatabase;
import ru.gpb.javacourse.Investments.infastructure.mappers.InvestmentsMapper;

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
    public void insertMoney(String security, int id) {
        investmentsMapper.insertSecurity(security, id);
    }

    @Override
    public boolean selectSecurity(String security, int id) {
        return investmentsMapper.selectSecurity(security, id);
    }


}
