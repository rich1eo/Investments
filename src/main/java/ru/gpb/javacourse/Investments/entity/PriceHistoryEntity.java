package ru.gpb.javacourse.Investments.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "price_history", schema = "public", catalog = "postgres")
public class PriceHistoryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "price_history_id")
    private int priceHistoryId;
    @Basic
    @Column(name = "history_date")
    private Timestamp historyDate;
    @Basic
    @Column(name = "open_price")
    private BigDecimal openPrice;
    @Basic
    @Column(name = "low_price")
    private BigDecimal lowPrice;
    @Basic
    @Column(name = "high_price")
    private BigDecimal highPrice;
    @Basic
    @Column(name = "last_price")
    private BigDecimal lastPrice;
    @Basic
    @Column(name = "sec_id")
    private String secId;
    @OneToMany(mappedBy = "priceHistoryBySecId")
    private Collection<BondEntity> priceHistoryBySecId;

    public int getPriceHistoryId() {
        return priceHistoryId;
    }

    public void setPriceHistoryId(int priceHistoryId) {
        this.priceHistoryId = priceHistoryId;
    }

    public Timestamp getHistoryDate() {
        return historyDate;
    }

    public void setHistoryDate(Timestamp historyDate) {
        this.historyDate = historyDate;
    }

    public BigDecimal getOpenPrice() {
        return openPrice;
    }

    public void setOpenPrice(BigDecimal openPrice) {
        this.openPrice = openPrice;
    }

    public BigDecimal getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(BigDecimal lowPrice) {
        this.lowPrice = lowPrice;
    }

    public BigDecimal getHighPrice() {
        return highPrice;
    }

    public void setHighPrice(BigDecimal highPrice) {
        this.highPrice = highPrice;
    }

    public BigDecimal getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(BigDecimal lastPrice) {
        this.lastPrice = lastPrice;
    }

    public String getSecId() {
        return secId;
    }

    public void setSecId(String secId) {
        this.secId = secId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PriceHistoryEntity that = (PriceHistoryEntity) o;
        return priceHistoryId == that.priceHistoryId && Objects.equals(historyDate, that.historyDate) && Objects.equals(openPrice, that.openPrice) && Objects.equals(lowPrice, that.lowPrice) && Objects.equals(highPrice, that.highPrice) && Objects.equals(lastPrice, that.lastPrice) && Objects.equals(secId, that.secId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priceHistoryId, historyDate, openPrice, lowPrice, highPrice, lastPrice, secId);
    }

    public Collection<BondEntity> getPriceHistoryBySecId() {
        return priceHistoryBySecId;
    }

    public void setPriceHistoryBySecId(Collection<BondEntity> priceHistoryBySecId) {
        this.priceHistoryBySecId = priceHistoryBySecId;
    }
}
