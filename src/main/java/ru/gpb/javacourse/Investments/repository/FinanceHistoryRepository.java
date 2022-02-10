package ru.gpb.javacourse.Investments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gpb.javacourse.Investments.dto.FinanceHistoryEntity;

public interface FinanceHistoryRepository extends JpaRepository<FinanceHistoryEntity, Integer> {
}
