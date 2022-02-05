package ru.gpb.javacourse.Investments.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "bond", schema = "public", catalog = "postgres")
public class BondEntity {
    @Basic
    @Column(name = "sec_id")
    private String secId;
    @Basic
    @Column(name = "short_name")
    private String shortName;
    @Basic
    @Column(name = "is_traded")
    private Boolean isTraded;
    @Basic
    @Column(name = "type")
    private String type;
    @Basic
    @Column(name = "issuer")
    private Integer issuer;
    @Basic
    @Column(name = "board_id")
    private String boardId;
    @Basic
    @Column(name = "price")
    private BigDecimal price;
    @Basic
    @Column(name = "yield_sec")
    private BigDecimal yieldSec;
    @Basic
    @Column(name = "mat_date")
    private Timestamp matDate;
    @Basic
    @Column(name = "coupon_percent")
    private BigDecimal couponPercent;
    @Basic
    @Column(name = "coupon_frequency")
    private BigDecimal couponFrequency;
    @Basic
    @Column(name = "issue_date")
    private Timestamp issueDate;
    @Basic
    @Column(name = "coupon_date")
    private Timestamp couponDate;
    @Basic
    @Column(name = "coupon_value")
    private BigDecimal couponValue;
    @Basic
    @Column(name = "is_early_repaid")
    private Boolean isEarlyRepaid;
    @Basic
    @Column(name = "trade_date")
    private Timestamp tradeDate;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "bond_id")
    private int bondId;

    public String getSecId() {
        return secId;
    }

    public void setSecId(String secId) {
        this.secId = secId;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Boolean getTraded() {
        return isTraded;
    }

    public void setTraded(Boolean traded) {
        isTraded = traded;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getIssuer() {
        return issuer;
    }

    public void setIssuer(Integer issuer) {
        this.issuer = issuer;
    }

    public String getBoardId() {
        return boardId;
    }

    public void setBoardId(String boardId) {
        this.boardId = boardId;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getYieldSec() {
        return yieldSec;
    }

    public void setYieldSec(BigDecimal yieldSec) {
        this.yieldSec = yieldSec;
    }

    public Timestamp getMatDate() {
        return matDate;
    }

    public void setMatDate(Timestamp matDate) {
        this.matDate = matDate;
    }

    public BigDecimal getCouponPercent() {
        return couponPercent;
    }

    public void setCouponPercent(BigDecimal couponPercent) {
        this.couponPercent = couponPercent;
    }

    public BigDecimal getCouponFrequency() {
        return couponFrequency;
    }

    public void setCouponFrequency(BigDecimal couponFrequency) {
        this.couponFrequency = couponFrequency;
    }

    public Timestamp getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Timestamp issueDate) {
        this.issueDate = issueDate;
    }

    public Timestamp getCouponDate() {
        return couponDate;
    }

    public void setCouponDate(Timestamp couponDate) {
        this.couponDate = couponDate;
    }

    public BigDecimal getCouponValue() {
        return couponValue;
    }

    public void setCouponValue(BigDecimal couponValue) {
        this.couponValue = couponValue;
    }

    public Boolean getEarlyRepaid() {
        return isEarlyRepaid;
    }

    public void setEarlyRepaid(Boolean earlyRepaid) {
        isEarlyRepaid = earlyRepaid;
    }

    public Timestamp getTradeDate() {
        return tradeDate;
    }

    public void setTradeDate(Timestamp tradeDate) {
        this.tradeDate = tradeDate;
    }

    public int getBondId() {
        return bondId;
    }

    public void setBondId(int bondId) {
        this.bondId = bondId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BondEntity that = (BondEntity) o;
        return bondId == that.bondId && Objects.equals(secId, that.secId) && Objects.equals(shortName, that.shortName) && Objects.equals(isTraded, that.isTraded) && Objects.equals(type, that.type) && Objects.equals(issuer, that.issuer) && Objects.equals(boardId, that.boardId) && Objects.equals(price, that.price) && Objects.equals(yieldSec, that.yieldSec) && Objects.equals(matDate, that.matDate) && Objects.equals(couponPercent, that.couponPercent) && Objects.equals(couponFrequency, that.couponFrequency) && Objects.equals(issueDate, that.issueDate) && Objects.equals(couponDate, that.couponDate) && Objects.equals(couponValue, that.couponValue) && Objects.equals(isEarlyRepaid, that.isEarlyRepaid) && Objects.equals(tradeDate, that.tradeDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secId, shortName, isTraded, type, issuer, boardId, price, yieldSec, matDate, couponPercent, couponFrequency, issueDate, couponDate, couponValue, isEarlyRepaid, tradeDate, bondId);
    }
}
