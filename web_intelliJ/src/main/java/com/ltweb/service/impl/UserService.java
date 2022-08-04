package com.ltweb.service.impl;

import com.ltweb.dao.IUserDAO;
import com.ltweb.dao.impl.UserDAO;
import com.ltweb.model.UserModel;
import com.ltweb.service.IUserService;

import javax.inject.Inject;

public class UserService implements IUserService {

    @Inject
    IUserDAO userDAO =new UserDAO();

    @Override
    public UserModel findOneByUserNameAndPassword(String username, String password) {
        return userDAO.findOneByUserNameAndPassword(username,password);
    }

    @Override
    public String checkRes(UserModel userModel) {
        if(userDAO.findByUserName(userModel.getUsername())!=null){
            return "user_is_exist";
        }
        if(userDAO.findByEmail(userModel.getEmail())!=null){
            return "email_is_exist";
        }
        return "1";

    }
    @Override
    public void update(UserModel userModel) {
        userDAO.edit(userModel);
    }

    @Override
    public void add(UserModel userModel){
        userDAO.add(userModel);
    }

    @Override
    public UserModel findById(int id) {
        return userDAO.findById(id);
    }
}
