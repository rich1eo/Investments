package ru.gpb.javacourse.Investments.dto;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "depositary_account", schema = "investments", catalog = "postgres")
@Data
public class DepositaryAccountEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "depositary_account_id")
    private int depositaryAccountId;
    @Basic
    @Column(name = "balance_date")
    private Integer balanceDate;
    @Basic
    @Column(name = "balance_amount")
    private Double balanceAmount;
    @Basic
    @Column(name = "client_id")
    private Integer clientId;
    @Basic
    @Column(name = "bond_id")
    private Integer bondId;
    @ManyToOne
    @JoinColumn(name = "client_id", referencedColumnName = "client_request_id")
    private ClientEntity clientByClientId;
    @ManyToOne
    @JoinColumn(name = "bond_id", referencedColumnName = "bond_id")
    private BondEntity bondByBondId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepositaryAccountEntity that = (DepositaryAccountEntity) o;

        if (depositaryAccountId != that.depositaryAccountId) return false;
        if (balanceDate != null ? !balanceDate.equals(that.balanceDate) : that.balanceDate != null) return false;
        if (balanceAmount != null ? !balanceAmount.equals(that.balanceAmount) : that.balanceAmount != null)
            return false;
        if (clientId != null ? !clientId.equals(that.clientId) : that.clientId != null) return false;
        if (bondId != null ? !bondId.equals(that.bondId) : that.bondId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = depositaryAccountId;
        result = 31 * result + (balanceDate != null ? balanceDate.hashCode() : 0);
        result = 31 * result + (balanceAmount != null ? balanceAmount.hashCode() : 0);
        result = 31 * result + (clientId != null ? clientId.hashCode() : 0);
        result = 31 * result + (bondId != null ? bondId.hashCode() : 0);
        return result;
    }

    public ClientEntity getClientByClientId() {
        return clientByClientId;
    }

    public void setClientByClientId(ClientEntity clientByClientId) {
        this.clientByClientId = clientByClientId;
    }

    public BondEntity getBondByBondId() {
        return bondByBondId;
    }

    public void setBondByBondId(BondEntity bondByBondId) {
        this.bondByBondId = bondByBondId;
    }
}
