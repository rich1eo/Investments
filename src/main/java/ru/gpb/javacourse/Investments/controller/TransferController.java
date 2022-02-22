package ru.gpb.javacourse.Investments.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.gpb.javacourse.Investments.entity.Bond;
import ru.gpb.javacourse.Investments.entity.DepositaryAccount;
import ru.gpb.javacourse.Investments.entity.Price;
import ru.gpb.javacourse.Investments.service.BondService;
import ru.gpb.javacourse.Investments.service.PriceService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TransferController {
    private final BondService bondService;
    private final PriceService priceService;

    @GetMapping("/")
    public List<Bond> bonds() {
        return bondService.listBonds();
    }

    @GetMapping("/bond/{id}")
    public Price bondInfo(@PathVariable Integer id) {
        return priceService.getPriceByBondId(id);
    }

    @PostMapping("/sell")
    public void sellByTicker(@RequestParam Integer clientId, @RequestParam DepositaryAccount depositaryAccount) {
        bondService.sellByTicker(clientId, depositaryAccount);
    }

    @PostMapping("/buy")
    public void buyByTicker(@RequestParam Integer clientId, @RequestParam DepositaryAccount depositaryAccount) {
        bondService.buyByTicker(clientId, depositaryAccount);
    }

    @PostMapping("/transfer")
    public void makeTransfer() {

    }

}
