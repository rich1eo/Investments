package ru.gpb.javacourse.Investments.aplication.service;

import org.springframework.stereotype.Service;
import ru.gpb.javacourse.Investments.aplication.Exception.SaleException;
import ru.gpb.javacourse.Investments.aplication.dto.Investment;
import ru.gpb.javacourse.Investments.infastructure.dao.AppealDAO;

@Service
public class Sale {
    AppealDAO appealDAO;

    public Sale(AppealDAO appealDAO) {
        this.appealDAO = appealDAO;
    }

    public void saleOfSecurity(Investment investment) throws SaleException {
        boolean security = appealDAO.getSecurity(investment.getNameOfTheSecurity(), investment.getClient().getId());
        if (security) {
            throw new SaleException("нет у клиента в наличии такой ценной бумаги");
        }
        saveFunds(investment.getNameOfTheSecurity(), investment.getClient().getId());
    }

    public void saveFunds(String nameOfTheSecurity, int id) {
        int valueSecurity = 10;//реализовать логику просмотр цены на эту облигацию
        int amountOfMoney = appealDAO.getMoney(id);
        amountOfMoney += valueSecurity;
        appealDAO.saveMoney(amountOfMoney, id);
        appealDAO.saveSecurity(nameOfTheSecurity, valueSecurity);
    }


}
