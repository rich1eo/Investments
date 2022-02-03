package ru.gpb.javacourse.Investments.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepositaryAccountController {
    @GetMapping("/depositaryAccount")
    public void GetInvestingHistory() {

    }
}
