package com.ltweb.dao.impl;

import com.ltweb.dao.ITransactionDAO;
import com.ltweb.mapper.TransactionMapper;
import com.ltweb.model.TransactionModel;

import java.util.List;

public class TransactionDAO extends AbstractDAO<TransactionModel> implements ITransactionDAO {

    @Override
    public List<TransactionModel> findById(int user_id) {
        String sql = "SELECT * FROM transaction where user_id=?";
        return query(sql, new TransactionMapper(), user_id);
    }

    @Override
    public void add(TransactionModel transactionModel) {
        String sql = "INSERT INTO transaction VALUES (?,?,?,?,?,?,?,?,?)";
        update(sql, new TransactionMapper(), transactionModel.getId(), transactionModel.getStatus(), transactionModel.getUser_id(), transactionModel.getUser_name(), transactionModel.getUser_email(), transactionModel.getUser_phone(), transactionModel.getAmount(), transactionModel.getPayment(), transactionModel.getMessage());
    }

    @Override
    public void edit(TransactionModel transactionModel) {

    }

    @Override
    public void delete(TransactionModel transactionModel) {

    }
}
