package ru.gpb.javacourse.Investments.aplication.service.information;

import org.springframework.stereotype.Service;
import ru.gpb.javacourse.Investments.infastructure.dao.AppealDAO;

import java.util.List;

@Service
public class Possession {
    AppealDAO appealDAO;

    public Possession(AppealDAO appealDAO) {
        this.appealDAO = appealDAO;
    }

    public int chekPossession(int id) {
        List<String> possessions = appealDAO.getPossession(id);
        return calculateTheTotalCost(possessions);
    }

    public int calculateTheTotalCost(List<String> possessions) {
        int totalCost = 0;
        for(String security : possessions) {
            int securityPrice = 10;//реализовать получение цены для ценной бумаги
            totalCost+= securityPrice;
        }
        return totalCost;
    }

}
