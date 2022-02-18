package ru.gpb.javacourse.Investments.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gpb.javacourse.Investments.entity.Bond;
import ru.gpb.javacourse.Investments.entity.DepositaryAccount;
import ru.gpb.javacourse.Investments.repository.BondRepo;
import ru.gpb.javacourse.Investments.repository.DepositaryAccountRepo;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BondService {
    private final BondRepo bondRepo;
    private final DepositaryAccountRepo depositaryAccountRepo;
    private final DepositaryAccount depositaryAccount;

    public List<Bond> listBonds() {
        return bondRepo.findAll();
    }

    public void buyByTicker(Integer clientId, String secId, Integer amount, Double price) {
        Bond bond = bondRepo.findBondBySecId(secId);
        depositaryAccount.setBondByBondId(bond);
        depositaryAccount.setClientId(clientId);
        depositaryAccount.setDirection("Buy");
        depositaryAccount.setTradeAmount(amount);
        depositaryAccount.setTradePrice(price);
        depositaryAccountRepo.save(depositaryAccount);
    }
}
