package com.ltweb.dao;

import com.ltweb.model.UserModel;

public interface IUserDAO extends DAO<UserModel> {
    UserModel findOneByUserNameAndPassword(String username, String password);

    UserModel findByUserName(String username);

    UserModel findByEmail(String email);

    UserModel findById(int id);
}
