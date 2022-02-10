package ru.gpb.javacourse.Investments.dto;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;

@Entity
@Table(name = "price_by_day", schema = "investments", catalog = "postgres")
@Data
public class PriceByDayEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "price_id")
    private int priceId;
    @Basic
    @Column(name = "market_systime")
    private Date marketSystime;
    @Basic
    @Column(name = "open")
    private Double open;
    @Basic
    @Column(name = "last")
    private Double last;
    @Basic
    @Column(name = "high")
    private Double high;
    @Basic
    @Column(name = "low")
    private Double low;
    @Basic
    @Column(name = "bond_id")
    private Integer bondId;
    @OneToMany(mappedBy = "priceByDayByPriceId")
    private Collection<FinanceHistoryEntity> financeHistoriesByPriceId;
    @ManyToOne
    @JoinColumn(name = "bond_id", referencedColumnName = "bond_id")
    private BondEntity bondByBondId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PriceByDayEntity that = (PriceByDayEntity) o;

        if (priceId != that.priceId) return false;
        if (marketSystime != null ? !marketSystime.equals(that.marketSystime) : that.marketSystime != null)
            return false;
        if (open != null ? !open.equals(that.open) : that.open != null) return false;
        if (last != null ? !last.equals(that.last) : that.last != null) return false;
        if (high != null ? !high.equals(that.high) : that.high != null) return false;
        if (low != null ? !low.equals(that.low) : that.low != null) return false;
        if (bondId != null ? !bondId.equals(that.bondId) : that.bondId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = priceId;
        result = 31 * result + (marketSystime != null ? marketSystime.hashCode() : 0);
        result = 31 * result + (open != null ? open.hashCode() : 0);
        result = 31 * result + (last != null ? last.hashCode() : 0);
        result = 31 * result + (high != null ? high.hashCode() : 0);
        result = 31 * result + (low != null ? low.hashCode() : 0);
        result = 31 * result + (bondId != null ? bondId.hashCode() : 0);
        return result;
    }

    public Collection<FinanceHistoryEntity> getFinanceHistoriesByPriceId() {
        return financeHistoriesByPriceId;
    }

    public void setFinanceHistoriesByPriceId(Collection<FinanceHistoryEntity> financeHistoriesByPriceId) {
        this.financeHistoriesByPriceId = financeHistoriesByPriceId;
    }

    public BondEntity getBondByBondId() {
        return bondByBondId;
    }

    public void setBondByBondId(BondEntity bondByBondId) {
        this.bondByBondId = bondByBondId;
    }
}
