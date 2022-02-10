package ru.gpb.javacourse.Investments.dto;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "finance_history", schema = "investments", catalog = "postgres")
public class FinanceHistoryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "finance_history_id")
    private int financeHistoryId;
    @Basic
    @Column(name = "trade_date")
    private Date tradeDate;
    @Basic
    @Column(name = "amount")
    private Double amount;
    @Basic
    @Column(name = "direction")
    private Integer direction;
    @Basic
    @Column(name = "client_request_id")
    private Integer clientRequestId;
    @Basic
    @Column(name = "bond_id")
    private Integer bondId;
    @Basic
    @Column(name = "price_id")
    private Integer priceId;
    @ManyToOne
    @JoinColumn(name = "client_request_id", referencedColumnName = "client_request_id")
    private ClientEntity clientByClientRequestId;
    @ManyToOne
    @JoinColumn(name = "bond_id", referencedColumnName = "bond_id")
    private BondEntity bondByBondId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FinanceHistoryEntity that = (FinanceHistoryEntity) o;

        if (financeHistoryId != that.financeHistoryId) return false;
        if (tradeDate != null ? !tradeDate.equals(that.tradeDate) : that.tradeDate != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (direction != null ? !direction.equals(that.direction) : that.direction != null) return false;
        if (clientRequestId != null ? !clientRequestId.equals(that.clientRequestId) : that.clientRequestId != null)
            return false;
        if (bondId != null ? !bondId.equals(that.bondId) : that.bondId != null) return false;
        if (priceId != null ? !priceId.equals(that.priceId) : that.priceId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = financeHistoryId;
        result = 31 * result + (tradeDate != null ? tradeDate.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (direction != null ? direction.hashCode() : 0);
        result = 31 * result + (clientRequestId != null ? clientRequestId.hashCode() : 0);
        result = 31 * result + (bondId != null ? bondId.hashCode() : 0);
        result = 31 * result + (priceId != null ? priceId.hashCode() : 0);
        return result;
    }

    public ClientEntity getClientByClientRequestId() {
        return clientByClientRequestId;
    }

    public void setClientByClientRequestId(ClientEntity clientByClientRequestId) {
        this.clientByClientRequestId = clientByClientRequestId;
    }

    public BondEntity getBondByBondId() {
        return bondByBondId;
    }

    public void setBondByBondId(BondEntity bondByBondId) {
        this.bondByBondId = bondByBondId;
    }
}
