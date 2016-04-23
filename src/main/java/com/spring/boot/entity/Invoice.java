package com.spring.boot.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

/**
 * Created by sahan on 4/21/16.
 */
@Entity
@Table(name = "invoice")
public class Invoice implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @OneToMany(mappedBy = "invoice")
    private Collection<SoldItem> soldItems;

    public Invoice() {
    }

    public Invoice(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @XmlTransient
    public Collection<SoldItem> getSoldItems() {
        return soldItems;
    }

    public void setSoldItems(Collection<SoldItem> soldItems) {
        this.soldItems = soldItems;
    }

    @Override
    public String toString() {
        return "lec5.entity.GoodReceiveInvoice[ id=" + id + " ]";
    }

}
