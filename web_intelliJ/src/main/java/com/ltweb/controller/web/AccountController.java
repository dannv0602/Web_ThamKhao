package com.ltweb.controller.web;

import com.ltweb.Util.SessionUtil;
import com.ltweb.model.OrderModel;
import com.ltweb.model.UserModel;
import com.ltweb.service.impl.OrderService;

import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AccountController", urlPatterns = "/tai-khoan")
public class AccountController extends HttpServlet {
    OrderService orderService=new OrderService();
    @Inject
    OrderModel orderModel=new OrderModel();
    @Inject
    UserModel userModel=new UserModel();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        userModel = (UserModel) SessionUtil.getInstance().getValue(request, "user");
        if (userModel == null) {
            RequestDispatcher rd = request.getRequestDispatcher("/views/web/login.jsp");
            rd.forward(request, response);
        } else {
            orderModel.setList(orderService.findById(userModel.getId()));
            request.setAttribute("order",orderModel);
            RequestDispatcher rd = request.getRequestDispatcher("/views/web/account.jsp");
            rd.forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
