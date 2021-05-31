package com.help.back.service;

import com.help.back.entity.Cart;
import com.help.back.entity.ProductInOrder;
import com.help.back.entity.User;

import java.util.Collection;


public interface CartService {
    Cart getCart(User user);

    void mergeLocalCart(Collection<ProductInOrder> productInOrders, User user);

    void delete(String itemId, User user);

    void checkout(User user);
}
