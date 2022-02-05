package ru.gpb.javacourse.Investments.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "depositary_account", schema = "public", catalog = "postgres")
public class DepositaryAccountEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "depositary_account_id")
    private int depositaryAccountId;
    @Basic
    @Column(name = "client_id")
    private int clientId;
    @Basic
    @Column(name = "sec_id")
    private String secId;
    @Basic
    @Column(name = "open_date")
    private Timestamp openDate;
    @Basic
    @Column(name = "close_date")
    private Timestamp closeDate;
    @Basic
    @Column(name = "is_active")
    private Boolean isActive;
    @ManyToOne
    @JoinColumn( name = "sec_id", referencedColumnName = "sec_id")
    private  DepositaryAccountEntity depositaryAccountBySecId;

    public int getDepositaryAccountId() {
        return depositaryAccountId;
    }

    public void setDepositaryAccountId(int depositaryAccountId) {
        this.depositaryAccountId = depositaryAccountId;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getSecId() {
        return secId;
    }

    public void setSecId(String secId) {
        this.secId = secId;
    }

    public Timestamp getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Timestamp openDate) {
        this.openDate = openDate;
    }

    public Timestamp getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Timestamp closeDate) {
        this.closeDate = closeDate;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DepositaryAccountEntity that = (DepositaryAccountEntity) o;
        return depositaryAccountId == that.depositaryAccountId && clientId == that.clientId && Objects.equals(secId, that.secId) && Objects.equals(openDate, that.openDate) && Objects.equals(closeDate, that.closeDate) && Objects.equals(isActive, that.isActive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(depositaryAccountId, clientId, secId, openDate, closeDate, isActive);
    }

   /* public Collection<BondEntity> getDepositaryAccount() {
        return depositaryAccount;
    }

    public void setDepositaryAccount(Collection<BondEntity> depositaryAccount) {
        this.depositaryAccount = depositaryAccount;
    }*/
}
