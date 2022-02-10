package ru.gpb.javacourse.Investments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gpb.javacourse.Investments.dto.PriceByDayEntity;

public interface PriceByDayRepository extends JpaRepository<PriceByDayEntity, Integer> {
}
