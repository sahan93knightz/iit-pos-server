package com.spring.boot.entity;

import com.spring.boot.util.AppConstants;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;

/**
 * Created by sahan on 4/21/16.
 */
@Entity
@Table(name = "item")
public class Item implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;

    @Column(name = "barcode", nullable = false)
    private String barcode = AppConstants.STRING_EMPTY;

    @Column(name = "expirable", nullable = false)
    private Boolean expirable = Boolean.FALSE;

    @Column(name = "name", nullable = false, unique = false, length = 255)
    private String name = AppConstants.STRING_EMPTY;

    @Column(name = "quantity", nullable = false)
    private BigInteger quantity;

    @JoinColumn(name = "brand_id", referencedColumnName = "id", nullable = false)
    @ManyToOne
    private Brand brand;

    @OneToMany(mappedBy = "item")
    private Collection<ReceivedItem> receivedItems;

    @OneToMany(mappedBy = "item")
    private Collection<SoldItem> soldItems;

    public Item() {
    }

    public Item(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getQuantity() {
        return quantity;
    }

    public void setQuantity(BigInteger quantity) {
        this.quantity = quantity;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Boolean isExpirable() {
        return expirable;
    }

    public Collection<SoldItem> getSoldItems() {
        return soldItems;
    }

    public void setSoldItems(Collection<SoldItem> soldItems) {
        this.soldItems = soldItems;
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
        return "lec5.entity.Item[ id=" + id + " ]";
    }

}
