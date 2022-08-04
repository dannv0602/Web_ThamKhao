package com.ltweb.mapper;

import com.ltweb.model.TransactionModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TransactionMapper implements RowMapper<TransactionModel> {
    @Override
    public TransactionModel mapRow(ResultSet resultSet) {
        TransactionModel transactionModel = new TransactionModel();
        try {
            transactionModel.setId(resultSet.getInt("id"));
            transactionModel.setStatus(resultSet.getInt("status"));
            transactionModel.setUeser_id(resultSet.getInt("user_id"));
            transactionModel.setUser_name(resultSet.getString("user_name"));
            transactionModel.setUser_email(resultSet.getString("user_email"));
            transactionModel.setUser_phone(resultSet.getString("user_phone"));
            transactionModel.setAmount(resultSet.getLong("amount"));
            transactionModel.setPayment(resultSet.getString("payment"));
            transactionModel.setMessage(resultSet.getNString("message"));
            return transactionModel;

        } catch (SQLException e) {
            return null;
        }
    }
}