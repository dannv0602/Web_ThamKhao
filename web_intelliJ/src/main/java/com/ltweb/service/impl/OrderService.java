package com.ltweb.service.impl;

import com.ltweb.dao.IOrderDAO;
import com.ltweb.dao.impl.OrderDAO;
import com.ltweb.model.OrderModel;
import com.ltweb.service.IOrderService;

import java.util.List;

public class OrderService implements IOrderService {
    IOrderDAO orderDAO=new OrderDAO();


    @Override
    public List<OrderModel> findById(int madh) {
        return orderDAO.findById(madh);
    }
}
