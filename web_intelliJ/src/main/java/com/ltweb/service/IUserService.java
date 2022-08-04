package com.ltweb.service;

import com.ltweb.model.UserModel;

public interface IUserService {
    UserModel findOneByUserNameAndPassword(String username, String password);

    String checkRes(UserModel userModel);

    void add(UserModel userModel);

    UserModel findById(int id);

    void update(UserModel userModel);
}
