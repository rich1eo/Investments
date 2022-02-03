package ru.gpb.javacourse.Investments.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gpb.javacourse.Investments.service.BondService;

@RestController
@RequiredArgsConstructor
public class BondController {
    private final BondService bondService;

    @PostMapping("/bond/buy")
    public void BuyByTicker() {

    }

    @PostMapping("/bond/sell")
    public void SellByTicker() {

    }
}
