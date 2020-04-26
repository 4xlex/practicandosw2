package com.example.lab2pc.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table
public class countries {
    @Id
    private String country_id;
    @Column(name = "country_id")
    private String country_name;
    @Column(name = "country_name")
    private BigDecimal region_id;

}
