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

    public String getCountry_id() {
        return country_id;
    }

    public void setCountry_id(String country_id) {
        this.country_id = country_id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public BigDecimal getRegion_id() {
        return region_id;
    }

    public void setRegion_id(BigDecimal region_id) {
        this.region_id = region_id;
    }

    @Column(name = "country_name")
    private BigDecimal region_id;

}
