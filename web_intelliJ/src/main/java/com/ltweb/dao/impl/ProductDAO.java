package com.ltweb.dao.impl;

import com.ltweb.dao.IProductDAO;
import com.ltweb.mapper.ProductMapper;
import com.ltweb.model.ProductModel;

import java.util.List;

public class ProductDAO extends AbstractDAO<ProductModel> implements IProductDAO {

    @Override
    public void add(ProductModel productModel) {
        String sql = "INSERT INTO `product`(`catalog_id`, `name`, `price`, `qty`, `content`, `discount`, `image_link`) VALUES (?,?,?,?,?,?,?)";
        update(sql, productModel.getCatalog_id(), productModel.getName(), productModel.getPrice(), productModel.getQty(), productModel.getContent(), productModel.getDiscount(), productModel.getImage_link());
    }

    @Override
    public ProductModel findById(long id) {
        String sql= "select * from product where id = ?";
        return query(sql,new ProductMapper(),id).isEmpty()? null:query(sql,new ProductMapper(),id).get(0);
    }

    @Override
    public void edit(ProductModel productModel) {
        String sql="UPDATE product SET catalog_id=?,name=?,price=?,qty=?,content=?,discount=?,image_link=? where id= ?";
        update(sql,productModel.getCatalog_id(),productModel.getName(),productModel.getPrice(),productModel.getQty(),productModel.getContent(),productModel.getDiscount(),productModel.getImage_link(),productModel.getId());
    }

    @Override
    public void delete(ProductModel productModel) {
        String sql="delete from product where id=?";
        update(sql,productModel.getId());
    }

    @Override
    public List<ProductModel> findAllByCatalogId(long catalog,Integer offset,Integer limit) {
        String sql="Select * from product where catalog_id=? LIMIT ?,?";
        return query(sql,new ProductMapper(),catalog,offset,limit);
    }

    @Override
    public List<ProductModel> findAll(Integer offset,Integer limit) {
        String sql="Select * from product LIMIT ?,?";
        return query(sql,new ProductMapper(),offset,limit);
    }

    @Override
    public List<ProductModel> findAll() {
        String sql="Select * from product ";
        return query(sql,new ProductMapper());
    }

    @Override
    public List<ProductModel> findAllBySearch(String key) {
        String sql="Select * from product where name LIKE '%"+key+"%'";
        return query(sql,new ProductMapper());
    }

}