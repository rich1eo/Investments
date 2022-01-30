package ru.gpb.javacourse.Investments.aplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.gpb.javacourse.Investments.aplication.Exception.errorType;
import ru.gpb.javacourse.Investments.aplication.dto.Client;
import ru.gpb.javacourse.Investments.aplication.dto.Investment;
import ru.gpb.javacourse.Investments.aplication.service.intermediary.IntermediaryOfWork;

@RestController
public class Controller {

    @Autowired
    private IntermediaryOfWork intermediaryOfWork;

    @PostMapping("/investment/acquisitionOfInvestments")
    public String acquisitionOfInvestments(@RequestBody Investment investment) {
        switch (investment.getTypeOfPurchaseAndSale()) {
            case "assetPurchases" -> {
                return intermediaryOfWork.assetPurchases(investment);
            }
            case "saleOfSecurity" -> {
                return intermediaryOfWork.saleOfSecurity(investment);
            }
            default -> {
                return errorType.UNKNOWN_TYPE_OF_SERVICE.getMessage();
            }
        }
    }
    @PostMapping("/investment/totalPriceOfAllSecurities")
    public int totalPriceOfAllSecurities(Client client) {
       return intermediaryOfWork.chekPossession(client.getId());
    }
}
