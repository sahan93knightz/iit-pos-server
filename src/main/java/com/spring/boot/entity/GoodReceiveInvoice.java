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
@Table(name = "good_receive_invoice")
public class GoodReceiveInvoice implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;
    @OneToMany(mappedBy = "goodReceiveInvoice")
    private Collection<ReceivedItem> receivedItems;

    public GoodReceiveInvoice() {
    }

    public GoodReceiveInvoice(Long id) {
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
    public Collection<ReceivedItem> getReceivedItems() {
        return receivedItems;
    }

    public void setReceivedItems(Collection<ReceivedItem> receivedItems) {
        this.receivedItems = receivedItems;
    }

    @Override
    public String toString() {
        return "lec5.entity.GoodReceiveInvoice[ id=" + id + " ]";
    }

}
