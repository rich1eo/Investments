package ru.gpb.javacourse.Investments.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gpb.javacourse.Investments.dto.BondEntity;
import ru.gpb.javacourse.Investments.repository.BondRepository;
import ru.gpb.javacourse.Investments.repository.ClientRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BondService {

    private final BondRepository bondRepository;
    private final ClientRepository clientRepository;

    public List<BondEntity> listBonds (String secId) {
        if (secId != null) return bondRepository.findBySecId(secId);
        return bondRepository.findAll();
    }

}
