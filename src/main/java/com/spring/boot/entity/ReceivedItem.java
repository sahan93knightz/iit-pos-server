package com.spring.boot.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by sahan on 4/21/16.
 */
@Entity
@Table(name = "received_item")
public class ReceivedItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "quantity", nullable = false)
    private Double quantity;
    @JoinColumn(name = "item_id", referencedColumnName = "id", nullable = false)
    @ManyToOne
    private Item item;
    @JoinColumn(name = "good_receive_invoice_id", referencedColumnName = "id", nullable = false)
    @ManyToOne
    private GoodReceiveInvoice goodReceiveInvoice;

    public ReceivedItem() {
    }

    public ReceivedItem(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getQuantity() {
        return quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public GoodReceiveInvoice getGoodReceiveInvoice() {
        return goodReceiveInvoice;
    }

    public void setGoodReceiveInvoice(GoodReceiveInvoice goodReceiveInvoice) {
        this.goodReceiveInvoice = goodReceiveInvoice;
    }

    @Override
    public String toString() {
        return "lec5.entity.ReceivedItem[ id=" + id + " ]";
    }

}
