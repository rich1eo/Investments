package ru.gpb.javacourse.Investments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gpb.javacourse.Investments.entity.Price;

@Repository
public interface PriceRepo extends JpaRepository<Price, Integer> {
    Price findPriceByBondId(Integer bondId);
}
