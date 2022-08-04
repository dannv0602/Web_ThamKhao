package com.ltweb.dao.impl;

import com.ltweb.dao.IOrderDAO;
import com.ltweb.mapper.OrderMapper;
import com.ltweb.model.OrderModel;

import java.util.List;

public class OrderDAO extends AbstractDAO implements IOrderDAO {


    @Override
    public void add(OrderModel orderModel) {
        String sql = "INSERT INTO order values(?,?,?,?,?,?,?)";
        update(sql, new OrderMapper(), orderModel.getMaDH(), orderModel.getMaSP(), orderModel.getSoluong(), orderModel.getGia(), orderModel.getTime(), orderModel.getTrangthai(),orderModel.getImg());
    }



    @Override
    public List<OrderModel> findById(int madh) {
        String sql = "SELECT * FROM order WHERE transaction_id=?";
        return query(sql, new OrderMapper(), madh);
    }

    @Override
    public void edit(OrderModel orderModel) {

    }

    @Override
    public void delete(OrderModel orderModel) {

    }
}
