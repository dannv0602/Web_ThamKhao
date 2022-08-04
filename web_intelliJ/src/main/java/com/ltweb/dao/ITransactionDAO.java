package com.ltweb.dao;

import com.ltweb.model.TransactionModel;

import java.util.List;

public interface ITransactionDAO extends DAO<TransactionModel> {
    List<TransactionModel> findById(int user_id);
}
