package ru.gpb.javacourse.Investments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gpb.javacourse.Investments.entity.Bond;


public interface BondRepo extends JpaRepository<Bond, Integer> {
    Bond findBondBySecId(String secId);
}
