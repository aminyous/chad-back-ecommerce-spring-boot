package com.hichinfo.ecommerce.dto;

import com.hichinfo.ecommerce.entity.Address;
import com.hichinfo.ecommerce.entity.Customer;
import com.hichinfo.ecommerce.entity.Order;
import com.hichinfo.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {
    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
