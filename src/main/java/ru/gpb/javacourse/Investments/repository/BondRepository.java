package ru.gpb.javacourse.Investments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gpb.javacourse.Investments.dto.Bond;

import java.util.List;

public interface BondRepository extends JpaRepository<Bond, Long> {
    List<Bond> findBySecId(String secId);
}
