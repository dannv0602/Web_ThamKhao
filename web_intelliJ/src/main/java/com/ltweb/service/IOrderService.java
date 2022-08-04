package com.ltweb.service;

import com.ltweb.model.OrderModel;

import java.util.List;

public interface IOrderService {
    List<OrderModel> findById(int madh);
}
