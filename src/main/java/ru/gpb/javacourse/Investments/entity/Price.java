package ru.gpb.javacourse.Investments.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "price", schema = "investments", catalog = "postgres")
@Data
public class Price {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "price_id")
    private int priceId;
    @Basic
    @Column(name = "bond_id")
    private Integer bondId;
    @Basic
    @Column(name = "bid")
    private Double bid;
    @Basic
    @Column(name = "offer")
    private Double offer;
    @Basic
    @Column(name = "open")
    private Double open;
    @Basic
    @Column(name = "high")
    private Double high;
    @Basic
    @Column(name = "low")
    private Double low;
    @Basic
    @Column(name = "last")
    private Double last;
    @Basic
    @Column(name = "market_price")
    private Double marketPrice;
    @Basic
    @Column(name = "market_price_today")
    private Double marketPriceToday;
    @Basic
    @Column(name = "update_time")
    private Timestamp updateTime;
    @ManyToOne
    @JoinColumn(name = "bond_id", referencedColumnName = "bond_id")
    private Bond bondByBondId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Price that = (Price) o;

        if (priceId != that.priceId) return false;
        if (!Objects.equals(bondId, that.bondId)) return false;
        if (!Objects.equals(bid, that.bid)) return false;
        if (!Objects.equals(offer, that.offer)) return false;
        if (!Objects.equals(open, that.open)) return false;
        if (!Objects.equals(high, that.high)) return false;
        if (!Objects.equals(low, that.low)) return false;
        if (!Objects.equals(last, that.last)) return false;
        if (!Objects.equals(marketPrice, that.marketPrice)) return false;
        if (!Objects.equals(marketPriceToday, that.marketPriceToday))
            return false;
        if (!Objects.equals(updateTime, that.updateTime)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = priceId;
        result = 31 * result + (bondId != null ? bondId.hashCode() : 0);
        result = 31 * result + (bid != null ? bid.hashCode() : 0);
        result = 31 * result + (offer != null ? offer.hashCode() : 0);
        result = 31 * result + (open != null ? open.hashCode() : 0);
        result = 31 * result + (high != null ? high.hashCode() : 0);
        result = 31 * result + (low != null ? low.hashCode() : 0);
        result = 31 * result + (last != null ? last.hashCode() : 0);
        result = 31 * result + (marketPrice != null ? marketPrice.hashCode() : 0);
        result = 31 * result + (marketPriceToday != null ? marketPriceToday.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }

}
