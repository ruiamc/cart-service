package com.labs.game.cardservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

    @GetMapping("/cart-items")
    public CartItem[] getCartItems(){
        return new CartItem[0];
    }
}