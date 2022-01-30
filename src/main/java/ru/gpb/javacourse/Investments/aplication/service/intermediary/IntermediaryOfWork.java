package ru.gpb.javacourse.Investments.aplication.service.intermediary;

import org.springframework.stereotype.Component;
import ru.gpb.javacourse.Investments.aplication.dto.Investment;
import ru.gpb.javacourse.Investments.aplication.service.Purchases;
import ru.gpb.javacourse.Investments.aplication.service.Sale;
import ru.gpb.javacourse.Investments.aplication.service.information.Possession;

@Component
public class IntermediaryOfWork {

    private Purchases purchases;
    private Sale sale;
    private Possession possession;

    public IntermediaryOfWork(Purchases purchases,
                              Sale sale,
                              Possession possession) {
        this.purchases = purchases;
        this.sale = sale;
        this.possession = possession;
    }

    public String assetPurchases(Investment investment) {
        return purchases.assetPurchases(investment);
    }

    public String saleOfSecurity(Investment investment) {
        return sale.saleOfSecurity(investment);
    }

    public int chekPossession(int id) {
        return possession.chekPossession(id);
    }


}
