package ru.gpb.javacourse.Investments.aplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.gpb.javacourse.Investments.aplication.Exception.AplicationException;
import ru.gpb.javacourse.Investments.aplication.Exception.PurchasesException;
import ru.gpb.javacourse.Investments.aplication.Exception.SaleException;
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
    public void acquisitionOfInvestments(@RequestBody Investment investment) throws AplicationException, PurchasesException, SaleException {
        switch (investment.getTypeOfPurchaseAndSale()){
            case "assetPurchases":
                purchases.assetPurchases(investment);
            case "saleOfSecurity":
                sale.saleOfSecurity(investment);
            default:
                throw new AplicationException();
        }
    }
}
