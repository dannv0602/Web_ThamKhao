package com.ltweb.service;

import com.ltweb.model.TransactionModel;

import java.util.List;

public interface ITransactionService {
    List<TransactionModel> findById(int user_id);
}
