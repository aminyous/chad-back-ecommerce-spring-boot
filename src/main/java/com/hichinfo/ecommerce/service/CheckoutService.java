package com.hichinfo.ecommerce.service;

import com.hichinfo.ecommerce.dto.Purchase;
import com.hichinfo.ecommerce.dto.PurchaseResponse;

public interface CheckoutService {
    PurchaseResponse placeOrder(Purchase purchase);
}
