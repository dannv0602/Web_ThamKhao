package com.ltweb.dao;

import com.ltweb.model.OrderModel;

import java.util.List;

public interface IOrderDAO extends DAO<OrderModel>{
    List<OrderModel> findById(int id);
}
