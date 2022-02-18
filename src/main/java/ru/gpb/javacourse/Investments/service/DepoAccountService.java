package ru.gpb.javacourse.Investments.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gpb.javacourse.Investments.entity.Bond;
import ru.gpb.javacourse.Investments.entity.DepositaryAccount;
import ru.gpb.javacourse.Investments.repository.DepositaryAccountRepo;

@Service
@RequiredArgsConstructor
public class DepoAccountService {
    private final DepositaryAccountRepo depositaryAccountRepo;

    public void createDepoRecord(DepositaryAccount depositaryAccount) {
        depositaryAccountRepo.save(depositaryAccount);

    }
}
