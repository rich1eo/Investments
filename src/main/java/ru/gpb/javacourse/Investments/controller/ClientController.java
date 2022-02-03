package ru.gpb.javacourse.Investments.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gpb.javacourse.Investments.service.ClientService;

@RestController
@RequiredArgsConstructor
public class ClientController {
    private final ClientService clientService;

    @PostMapping("/client/transfer")
    public void MakeTransfer() {

    }
}
