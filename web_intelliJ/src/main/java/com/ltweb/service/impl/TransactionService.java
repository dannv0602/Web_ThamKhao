package com.ltweb.service.impl;

import com.ltweb.dao.ITransactionDAO;
import com.ltweb.dao.impl.TransactionDAO;
import com.ltweb.model.TransactionModel;
import com.ltweb.service.ITransactionService;

import java.util.List;

public class TransactionService implements ITransactionService {
    ITransactionDAO transactionDAO= (ITransactionDAO) new TransactionDAO();
    @Override
    public List<TransactionModel> findById(int user_id) {
        return transactionDAO.findById(user_id);
    }
}
