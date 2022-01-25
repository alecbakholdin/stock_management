package com.bakholdin.stock_management.persistence;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.io.Serializable;
import java.util.Date;

@Data
@Embeddable
public class StockManagementRowId implements Serializable {
    @ManyToOne
    @JoinColumn(name="symbol")
    private CompanyRow companyRow;
    @Column
    @Temporal(TemporalType.DATE)
    private Date date_retrieved;
}