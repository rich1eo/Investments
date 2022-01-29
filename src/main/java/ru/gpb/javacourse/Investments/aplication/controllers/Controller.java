package ru.gpb.javacourse.Investments.aplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.gpb.javacourse.Investments.aplication.Exception.errorType;
import ru.gpb.javacourse.Investments.aplication.dto.Investment;
import ru.gpb.javacourse.Investments.aplication.service.Purchases;
import ru.gpb.javacourse.Investments.aplication.service.Sale;

@RestController
public class Controller {
    @Autowired
    private Sale sale;
    @Autowired
    private Purchases purchases;

    @PostMapping("/investment/acquisitionOfInvestments")
    public String acquisitionOfInvestments(@RequestBody Investment investment) {
        switch (investment.getTypeOfPurchaseAndSale()) {
            case "assetPurchases" -> {
                return purchases.assetPurchases(investment);
            }
            case "saleOfSecurity" -> {
                return sale.saleOfSecurity(investment);
            }
            default -> {
                return errorType.UNKNOWN_TYPE_OF_SERVICE.getMessage();
            }
        }
    }
}
