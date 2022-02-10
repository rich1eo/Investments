package ru.gpb.javacourse.Investments.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.gpb.javacourse.Investments.dto.ClientEntity;

public interface ClientRepository extends JpaRepository<ClientEntity, Integer> {
}
