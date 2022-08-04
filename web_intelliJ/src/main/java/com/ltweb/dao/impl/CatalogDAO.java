package com.ltweb.dao.impl;

import com.ltweb.dao.ICatalogDAO;
import com.ltweb.mapper.CatalogMapper;
import com.ltweb.model.CatalogModel;

import java.util.List;

public class CatalogDAO extends AbstractDAO<CatalogModel> implements ICatalogDAO<CatalogModel> {
    @Override
    public void add(CatalogModel catalogModelOrder) {
        String sql="INSERT INTO catalog VALUES (?,?,?)";
        update(sql, catalogModelOrder.getId() , catalogModelOrder.getName(), catalogModelOrder.getParent_id());
    }

    @Override
    public void edit(CatalogModel catalogModelOrder) {
        String sql="UPDATE `catalog` SET `id`=?,`name`=?,`parent_id`=? WHERE id=?";
        update(sql, catalogModelOrder.getId(), catalogModelOrder.getName(), catalogModelOrder.getParent_id(), catalogModelOrder.getId());
    }

    @Override
    public void delete(CatalogModel catalogModelOrder) {
        String sql ="DELETE From catalog where id =? ";
        update(sql, catalogModelOrder.getId());
    }

    @Override
    public List<CatalogModel> findAll() {
        String sql="SELECT * FROM catalog ";
        return query(sql,new CatalogMapper());
    }

    @Override
    public CatalogModel findOneById(long id) {
        String sql="SELECT * FROM catalog  WHERE id =?";
        if(!query(sql,new CatalogMapper(),id).isEmpty()) return query(sql,new CatalogMapper(),id).get(0);
        return null;
    }

}
