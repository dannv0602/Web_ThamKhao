package com.ltweb.dao;

import com.ltweb.model.ProductModel;

import java.util.List;

public interface IProductDAO extends DAO<ProductModel> {
    List<ProductModel> findAllByCatalogId(long catalog,Integer offset,Integer limit);
    List<ProductModel> findAll(Integer offset,Integer limit);
    List<ProductModel> findAll();
    List<ProductModel> findAllBySearch(String key);
    void add(ProductModel productModel);
    ProductModel findById(long id);
}
