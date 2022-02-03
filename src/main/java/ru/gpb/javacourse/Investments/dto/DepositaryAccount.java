package ru.gpb.javacourse.Investments.dto;

import lombok.Data;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import java.time.LocalDateTime;

// многие ко многим (клинет_x_облигация)
@Data
public class DepositaryAccount {
    private Long id;

    /*@ManyToOne
    @JoinColumn(name = "client_id")*/
    private Client client;

    /*@ManyToOne
    @JoinColumn (name = "bond_id")*/
    private Bond bond;


    private LocalDateTime dateOfCreated; // время действия

    @PrePersist
    private void init() { dateOfCreated = LocalDateTime.now(); }
}