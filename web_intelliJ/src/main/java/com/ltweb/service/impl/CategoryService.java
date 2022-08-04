package com.ltweb.service.impl;

import com.ltweb.dao.ICatalogDAO;
import com.ltweb.dao.impl.CatalogDAO;
import com.ltweb.model.CatalogModel;
import com.ltweb.service.ICategoryService;

import java.util.List;

public class CategoryService  implements ICategoryService<CatalogModel> {
    ICatalogDAO catalogorderDAO =new CatalogDAO();


    @Override
    public List<CatalogModel> findAll() {
        return catalogorderDAO.findAll();
    }


}
