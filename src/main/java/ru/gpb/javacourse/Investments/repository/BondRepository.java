package ru.gpb.javacourse.Investments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gpb.javacourse.Investments.dto.BondEntity;

import java.util.List;

public interface BondRepository extends JpaRepository<BondEntity, Integer> {
    List<BondEntity> findBySecId(String secId);
}
