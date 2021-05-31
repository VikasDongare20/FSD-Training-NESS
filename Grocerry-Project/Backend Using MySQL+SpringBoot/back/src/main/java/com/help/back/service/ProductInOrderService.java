package com.help.back.service;

import com.help.back.entity.ProductInOrder;
import com.help.back.entity.User;

public interface ProductInOrderService {
    void update(String itemId, Integer quantity, User user);
    ProductInOrder findOne(String itemId, User user);
}
