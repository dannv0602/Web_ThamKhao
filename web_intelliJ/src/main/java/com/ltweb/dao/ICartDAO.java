package com.ltweb.dao;

import com.ltweb.model.CartModel;

import java.util.List;

public interface ICartDAO extends DAO<CartModel> {
    List<CartModel> findAll(int id);

    CartModel findByProduct_Id(int user_id,int product_id);

    void delete(int user_id,int product_id);
}
