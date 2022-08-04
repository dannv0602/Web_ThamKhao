package com.ltweb.service;

import com.ltweb.model.ProductModel;

import javax.servlet.http.Part;
import java.util.List;

public interface IProductService {
    List<ProductModel> findAllByCatalogId(long catalog,Integer offset,Integer limit);
    List<ProductModel> findAll(Integer offset,Integer limit);
    List<ProductModel> findAllBySearch(String key);
    List<ProductModel> findAll();
    void add(ProductModel productModel);
    ProductModel findById(long id);
    void edit(ProductModel productModel);
    void delete(ProductModel productModel);

}

