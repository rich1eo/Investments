package ru.gpb.javacourse.Investments.aplication.service;

import org.springframework.stereotype.Service;
import ru.gpb.javacourse.Investments.aplication.Exception.errorType;
import ru.gpb.javacourse.Investments.aplication.dto.Investment;
import ru.gpb.javacourse.Investments.infastructure.dao.AppealDAO;

@Service
public class Purchases {
    AppealDAO appealDAO;

    public Purchases(AppealDAO appealDAO) {
        this.appealDAO = appealDAO;
    }


    public String assetPurchases(Investment investment) {
        int amountOfMoney = appealDAO.getMoney(investment.getClient().getId());
        int priceOfTheSecurity = 10;//написать логику получение цены на бумагу.
        if (priceOfTheSecurity > amountOfMoney) {
            return errorType.PURCHASES_EXCEPTION.getMessage();
        }
        amountOfMoney -= priceOfTheSecurity;
        saveSecurity(amountOfMoney, investment.getClient().getId(), investment.getNameOfTheSecurity());
        return errorType.NO_ERRORS.getMessage();
    }

    public void saveSecurity(int amountOfMoney, int id, String nameOfTheSecurity) {
        appealDAO.saveMoney(amountOfMoney, id);
        appealDAO.saveSecurity(nameOfTheSecurity, id);
    }

}
