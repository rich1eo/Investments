package ru.gpb.javacourse.Investments.dto;

import lombok.Data;

import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class Client {
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDateTime birthday;
    private String phoneNumber;
    private Long brokerageAccount; // брокерский счет

    @OneToMany(mappedBy = "client")
    List<DepositaryAccount> depositaryAccounts; // депозитарный счет
}
