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

    public List<Bond> listBonds() {
        return bondRepo.findAll();
    }

    public void buyByTicker(Integer clientId, DepositaryAccount depositaryAccount) {
        depositaryAccount.setClientId(clientId);
        depositaryAccount.setDirection("buy");
        depositaryAccountRepo.save(depositaryAccount);
    }

    public void sellByTicker(Integer clientId, DepositaryAccount depositaryAccount) {
        depositaryAccount.setClientId(clientId);
        depositaryAccount.setDirection("sell");
        depositaryAccountRepo.save(depositaryAccount);
    }
}
