package ru.gpb.javacourse.Investments.dto;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "client", schema = "investments", catalog = "postgres")
@Data
public class ClientEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "client_request_id")
    private int clientRequestId;
    @Basic
    @Column(name = "client_id")
    private Integer clientId;
    @Basic
    @Column(name = "brokerage_account")
    private Double brokerageAccount;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ClientEntity that = (ClientEntity) o;

        if (clientRequestId != that.clientRequestId) return false;
        if (clientId != null ? !clientId.equals(that.clientId) : that.clientId != null) return false;
        if (brokerageAccount != null ? !brokerageAccount.equals(that.brokerageAccount) : that.brokerageAccount != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = clientRequestId;
        result = 31 * result + (clientId != null ? clientId.hashCode() : 0);
        result = 31 * result + (brokerageAccount != null ? brokerageAccount.hashCode() : 0);
        return result;
    }
}
