package ru.gpb.javacourse.Investments.aplication.service;

import org.springframework.stereotype.Service;
import ru.gpb.javacourse.Investments.aplication.Exception.SaleException;
import ru.gpb.javacourse.Investments.aplication.dto.Client;
import ru.gpb.javacourse.Investments.aplication.dto.Investment;
import ru.gpb.javacourse.Investments.infastructure.dao.AppealDAO;

@Service

public class Sale {
    AppealDAO appealDAO;

    public Sale(AppealDAO appealDAO) {
        this.appealDAO = appealDAO;
    }

    public void saleOfSecurity(Investment investment) throws SaleException {
        boolean security = appealDAO.selectSecurity(investment.getNameOfTheSecurity(), investment.getClient().getId());
        if (security) {
            throw new SaleException("нет в наличии такой ценной бумаги");
        }
        int valueSecurity = 0;//реализовать логику просмотр цены на эту облигацию
        appealDAO.insertMoney(investment.getNameOfTheSecurity(), valueSecurity);
    }



}
