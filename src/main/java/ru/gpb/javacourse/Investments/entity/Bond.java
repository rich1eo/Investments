package ru.gpb.javacourse.Investments.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "bond", schema = "investments", catalog = "postgres")
@Data
public class Bond {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "bond_id")
    private int bondId;
    @Basic
    @Column(name = "sec_id")
    private String secId;
    @Basic
    @Column(name = "sec_name")
    private String secName;
    @Basic
    @Column(name = "coupon_value")
    private Double couponValue;
    @Basic
    @Column(name = "next_coupon")
    private Date nextCoupon;
    @Basic
    @Column(name = "coupon_percent")
    private Double couponPercent;
    @Basic
    @Column(name = "mat_date")
    private Date matDate;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bond that = (Bond) o;

        if (bondId != that.bondId) return false;
        if (!Objects.equals(secId, that.secId)) return false;
        if (!Objects.equals(secName, that.secName)) return false;
        if (!Objects.equals(couponValue, that.couponValue)) return false;
        if (!Objects.equals(nextCoupon, that.nextCoupon)) return false;
        if (!Objects.equals(couponPercent, that.couponPercent))
            return false;
        if (!Objects.equals(matDate, that.matDate)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bondId;
        result = 31 * result + (secId != null ? secId.hashCode() : 0);
        result = 31 * result + (secName != null ? secName.hashCode() : 0);
        result = 31 * result + (couponValue != null ? couponValue.hashCode() : 0);
        result = 31 * result + (nextCoupon != null ? nextCoupon.hashCode() : 0);
        result = 31 * result + (couponPercent != null ? couponPercent.hashCode() : 0);
        result = 31 * result + (matDate != null ? matDate.hashCode() : 0);
        return result;
    }
}
