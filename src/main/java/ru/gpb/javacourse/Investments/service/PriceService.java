package ru.gpb.javacourse.Investments.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gpb.javacourse.Investments.entity.Price;
import ru.gpb.javacourse.Investments.repository.PriceRepo;

@Service
@RequiredArgsConstructor
public class PriceService {
    private final PriceRepo priceRepo;

    public Price getPriceByBondId(Integer bondId) {
        return priceRepo.findPriceByBondId(bondId);
    }
}
