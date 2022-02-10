package ru.gpb.javacourse.Investments.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gpb.javacourse.Investments.repository.DepositaryAccountRepository;

@Service
public class DepositaryAccountService {
    @Autowired
    private DepositaryAccountRepository depositaryAccountRepository;


}
