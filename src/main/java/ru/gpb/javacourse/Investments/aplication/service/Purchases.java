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
        int priceOfTheSecurity = 0;//написать логику получение цены на бумагу.
        if (priceOfTheSecurity > amountOfMoney) {
            throw new PurchasesException("нехватает денег");
        }
        appealDAO.insertMoney(investment.getNameOfTheSecurity(), investment.getClient().getId());
    }


}
