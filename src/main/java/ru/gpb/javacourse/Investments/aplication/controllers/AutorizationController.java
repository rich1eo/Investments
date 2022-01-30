package ru.gpb.javacourse.Investments.aplication.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.gpb.javacourse.Investments.aplication.autorization.Autorization;
import ru.gpb.javacourse.Investments.aplication.autorization.ClientAutorization;
import ru.gpb.javacourse.Investments.aplication.service.information.CheckBalance;

@RestController
public class AutorizationController {

    @Autowired
    CheckBalance checkBalance;
    @PostMapping("/investment/checkBalance")
    public Autorization checkBalance(@RequestBody ClientAutorization clientAutorization) {
        return checkBalance.checkBalance(clientAutorization);
    }
}
