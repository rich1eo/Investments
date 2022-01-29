package ru.gpb.javacourse.Investments.aplication.dto;

import lombok.Getter;

import java.time.LocalDate;

@Getter
public class Client {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthday;
}
