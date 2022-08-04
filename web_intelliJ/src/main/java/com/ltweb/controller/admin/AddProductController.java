package com.ltweb.controller.admin;

import com.ltweb.Util.FormUtil;
import com.ltweb.model.ProductModel;
import com.ltweb.service.IProductService;
import com.ltweb.service.impl.ProductService;

import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ResourceBundle;

@WebServlet(name = "AddProductController", urlPatterns = "/admin-product-add")
public class AddProductController extends HttpServlet {
    @Inject
    IProductService productService =new ProductService();
    ResourceBundle resourceBundle =ResourceBundle.getBundle("message");
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String message =request.getParameter("message");
        String alert =request.getParameter("alert");
        if(message!=null&alert!=null){
            request.setAttribute("message",resourceBundle.getString(message));
            request.setAttribute("alert",alert);
        }
        RequestDispatcher rd =request.getRequestDispatcher("/views/admin/addproduct.jsp");
        rd.forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProductModel productModel =FormUtil.toModel(ProductModel.class,request);
        productModel.setImage_link("chua co");
        System.out.println(productModel);
        if(productModel!=null){
            productService.add(productModel);
            response.sendRedirect(request.getContextPath()+"/admin-product-add?message=add_product_success&alert=success");
        }
    }
}
