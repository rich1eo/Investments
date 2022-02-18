package ru.gpb.javacourse.Investments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.gpb.javacourse.Investments.entity.DepositaryAccount;

import java.util.List;

@Repository
public interface DepositaryAccountRepo extends JpaRepository<DepositaryAccount, Integer> {
    List<DepositaryAccount> findDepositaryAccountByDirection(String direction);
}
