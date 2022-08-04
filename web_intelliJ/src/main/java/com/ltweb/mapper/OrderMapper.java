package com.ltweb.mapper;

import com.ltweb.model.OrderModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OrderMapper implements RowMapper<OrderModel> {

    @Override
    public OrderModel mapRow(ResultSet resultSet) {
        OrderModel orderModel = new OrderModel();
        try {
            orderModel.setMaDH(resultSet.getInt("transaction_id"));
            orderModel.setMaSP(resultSet.getInt("product_id"));
            orderModel.setSoluong(resultSet.getInt("qty"));
            orderModel.setGia(resultSet.getInt("amount"));
            orderModel.setTime(resultSet.getString("time"));
            orderModel.setTrangthai(resultSet.getString("status"));
            orderModel.setImg(resultSet.getString("img"));
            return orderModel;

        } catch (SQLException e) {
            return null;
        }
    }

}