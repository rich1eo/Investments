package ru.gpb.javacourse.Investments.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "depositary_account", schema = "investments", catalog = "postgres")
@Data
public class DepositaryAccount {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "depositary_account_id")
    private int depositaryAccountId;
    @Basic
    @Column(name = "client_id")
    private Integer clientId;
    @Basic
    @Column(name = "bond_id", insertable = false, updatable = false)
    private Integer bondId;
    @Basic
    @Column(name = "trade_amount")
    private Integer tradeAmount;
    @Basic
    @Column(name = "trade_price")
    private Double tradePrice;
    @Basic
    @Column(name = "direction")
    private String direction;
    @Basic
    @Column(name = "trade_date")
    private Timestamp tradeDate;
    @ManyToOne
    @JoinColumn(name = "bond_id", referencedColumnName = "bond_id")
    private Bond bondByBondId;

    @PrePersist
    private void init() {
        tradeDate = Timestamp.valueOf(LocalDateTime.now());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepositaryAccount that = (DepositaryAccount) o;

        if (depositaryAccountId != that.depositaryAccountId) return false;
        if (!Objects.equals(clientId, that.clientId)) return false;
        if (!Objects.equals(bondId, that.bondId)) return false;
        if (!Objects.equals(tradeAmount, that.tradeAmount)) return false;
        if (!Objects.equals(tradePrice, that.tradePrice)) return false;
        if (!Objects.equals(direction, that.direction)) return false;
        if (!Objects.equals(tradeDate, that.tradeDate)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = depositaryAccountId;
        result = 31 * result + (clientId != null ? clientId.hashCode() : 0);
        result = 31 * result + (bondId != null ? bondId.hashCode() : 0);
        result = 31 * result + (tradeAmount != null ? tradeAmount.hashCode() : 0);
        result = 31 * result + (tradePrice != null ? tradePrice.hashCode() : 0);
        result = 31 * result + (direction != null ? direction.hashCode() : 0);
        result = 31 * result + (tradeDate != null ? tradeDate.hashCode() : 0);
        return result;
    }

}
