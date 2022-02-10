package ru.gpb.javacourse.Investments.dto;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "bond", schema = "investments", catalog = "postgres")
@Data
public class BondEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "bond_id")
    private int bondId;
    @Basic
    @Column(name = "sec_id")
    private String secId;
    @Basic
    @Column(name = "short_name")
    private String shortName;
    @Basic
    @Column(name = "board_id")
    private String boardId;
    @Basic
    @Column(name = "next_coupon")
    private Date nextCoupon;
    @Basic
    @Column(name = "coupon_percent")
    private Double couponPercent;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BondEntity that = (BondEntity) o;

        if (bondId != that.bondId) return false;
        if (secId != null ? !secId.equals(that.secId) : that.secId != null) return false;
        if (shortName != null ? !shortName.equals(that.shortName) : that.shortName != null) return false;
        if (boardId != null ? !boardId.equals(that.boardId) : that.boardId != null) return false;
        if (nextCoupon != null ? !nextCoupon.equals(that.nextCoupon) : that.nextCoupon != null) return false;
        if (couponPercent != null ? !couponPercent.equals(that.couponPercent) : that.couponPercent != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bondId;
        result = 31 * result + (secId != null ? secId.hashCode() : 0);
        result = 31 * result + (shortName != null ? shortName.hashCode() : 0);
        result = 31 * result + (boardId != null ? boardId.hashCode() : 0);
        result = 31 * result + (nextCoupon != null ? nextCoupon.hashCode() : 0);
        result = 31 * result + (couponPercent != null ? couponPercent.hashCode() : 0);
        return result;
    }
}
