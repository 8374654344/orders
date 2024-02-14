package com.items.orders.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class Orders {
    @Id
    int order_id;
    String item_name;
    int quantity;
    Date order_date;

    public Orders() {
    }

    public Orders(int order_id, String item_name, int quantity, Date order_date) {
        this.order_id = order_id;
        this.item_name = item_name;
        this.quantity = quantity;
        this.order_date = order_date;
    }

    public int getOrder_id() {
        return order_id;
    }

    public String getItem_name() {
        return item_name;
    }

    public int getQuantity() {
        return quantity;
    }

    public Date getOrder_date() {
        return order_date;
    }
}
