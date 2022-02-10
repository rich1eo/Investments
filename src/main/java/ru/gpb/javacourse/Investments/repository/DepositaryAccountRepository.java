package ru.gpb.javacourse.Investments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gpb.javacourse.Investments.dto.DepositaryAccountEntity;

public interface DepositaryAccountRepository extends JpaRepository<DepositaryAccountEntity, Integer> {
}
