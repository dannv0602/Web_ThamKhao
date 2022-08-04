package com.ltweb.dao;

import com.ltweb.model.CatalogModel;

import java.util.List;

public interface ICatalogDAO<T> extends DAO<T> {
    void add(CatalogModel catalogModelOrder);
    List<T> findAll();
    T findOneById(long id);
}
