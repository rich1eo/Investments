package ru.gpb.javacourse.Investments.aplication.service;

import org.springframework.stereotype.Service;
import ru.gpb.javacourse.Investments.aplication.Exception.PurchasesException;
import ru.gpb.javacourse.Investments.aplication.dto.Investment;
import ru.gpb.javacourse.Investments.infastructure.dao.AppealDAO;

@Service
public class Purchases {
    AppealDAO appealDAO;

    public Purchases(AppealDAO appealDAO) {
        this.appealDAO = appealDAO;
    }


    public void assetPurchases(Investment investment) throws PurchasesException {
        int amountOfMoney = appealDAO.getMoney(investment.getClient().getId());
        int priceOfTheSecurity = 10;//написать логику получение цены на бумагу.
        if (priceOfTheSecurity > amountOfMoney) {
            throw new PurchasesException("нехватает денег");
        }
        amountOfMoney -= priceOfTheSecurity;
        saveSecurity(amountOfMoney, investment.getClient().getId(), investment.getNameOfTheSecurity());
    }

    public void saveSecurity(int amountOfMoney, int id, String nameOfTheSecurity) {
        appealDAO.saveMoney(amountOfMoney, id);
        appealDAO.saveSecurity(nameOfTheSecurity, id);
    }


}
