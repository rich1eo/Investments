package ru.gpb.javacourse.Investments.dto;

import lombok.Data;

import javax.persistence.OneToMany;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class Bond {
    private Long id;
    private String secId; //тикер
    private String shortName; // полное имя
    private boolean isTraded; // торгуется ли сейчас
    private String type; // тип: офз, корпоративная
    private int emitentId; // эмитент
    private String boardId; // режим торгов для офз T+1, для Т+0 муниципальные и корпоративные облигации
    private double price; // цена
    private double yieldSec; //доходность в процентах
    private LocalDateTime matDate; // дата погашения облигации
    private double couponPercent; // процент выплаты по купону
    private int couponFrequency; // частота выплаты купонов
    private LocalDateTime issueDate; // дата начала торгов
    private LocalDateTime couponDate; // дата выплаты следующего купона
    private double couponValue; // сумма выплаты купона
    private boolean earlyRepayment; // есть ли досрочное погашение
    private LocalDateTime tradedDate; // информация о дате последней торговой сессии

    @OneToMany(mappedBy = "bond")
    List<DepositaryAccount> depositaryAccounts; // депозитарный счет
}
