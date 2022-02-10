package ru.gpb.javacourse.Investments.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.gpb.javacourse.Investments.dto.ClientEntity;
import ru.gpb.javacourse.Investments.repository.BondRepository;
import ru.gpb.javacourse.Investments.repository.ClientRepository;
import ru.gpb.javacourse.Investments.repository.FinanceHistoryRepository;
import ru.gpb.javacourse.Investments.repository.PriceByDayRepository;

@Service
public class FinanceHistoryService {
    @Autowired
    private FinanceHistoryRepository financeHistoryRepository;
    @Autowired
    private PriceByDayRepository priceByDayRepository;
    @Autowired
    private BondRepository bondRepository;
    @Autowired
    private ClientRepository clientRepository;

    public void saveFinanceHistory() {

    }
}
