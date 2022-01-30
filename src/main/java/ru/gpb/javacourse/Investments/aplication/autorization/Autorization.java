package ru.gpb.javacourse.Investments.aplication.autorization;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Autorization {

    public int balance;
    public String status;
}
