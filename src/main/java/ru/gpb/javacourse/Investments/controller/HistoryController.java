package ru.gpb.javacourse.Investments.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gpb.javacourse.Investments.entity.DepositaryAccount;
import ru.gpb.javacourse.Investments.service.DepoAccountService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class HistoryController {
    private final DepoAccountService depoAccountService;

    @GetMapping("/history")
    public List<DepositaryAccount> getInvestingHistory() {
        return depoAccountService.list();
    }

}
