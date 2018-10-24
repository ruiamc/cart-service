package com.labs.game.cartservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity(name = "cartitems")
public class CartItem {
    @Id
    private Integer id;
    @Column
    private String customer;
    @Column
    private String product;
    @Column
    private int quantity;

    public CartItem(Integer i, String c, String p, int q)
    {
        this.id = i;
        this.customer = c;
        this.product = p;
        this.quantity = q;

    }

}
