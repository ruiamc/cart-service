package com.labs.game.cartservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Data
public class CartService {

    @Autowired
    private CartRepository repository;

    public  CartService(CartRepository r)
    {
        this.repository = r;
    }

    public CartItem[] findByCustomer(String customer) {
        final CartItem[] cartItems = repository.findByCustomer(customer);
        if (cartItems == null)
            return new CartItem[0];
        else
            return cartItems;
    }
}
