package ru.gpb.javacourse.Investments.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gpb.javacourse.Investments.entity.DepositaryAccount;
import ru.gpb.javacourse.Investments.repository.DepositaryAccountRepo;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DepoAccountService {
    private final DepositaryAccountRepo depositaryAccountRepo;

    public List<DepositaryAccount> list() { return depositaryAccountRepo.findAll(); }
}
