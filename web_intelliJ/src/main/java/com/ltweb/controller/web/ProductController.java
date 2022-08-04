package com.ltweb.controller.web;

import com.ltweb.Util.FormUtil;
import com.ltweb.model.ProductModel;
import com.ltweb.service.IProductService;
import com.ltweb.service.impl.ProductService;

import javax.inject.Inject;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet( urlPatterns = "/san-pham")
public class ProductController extends HttpServlet {
    @Inject
    IProductService productService =new ProductService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String key = request.getParameter("search");
        if(key!=null){
            ProductModel productModel =new ProductModel();
            productModel.setList(productService.findAllBySearch(key));
            request.setAttribute("product",productModel);
        }else {
            ProductModel productModel = FormUtil.toModel(ProductModel.class, request);
            Integer limit =9;
            Integer offset = (productModel.getPage()-1)*limit;
            if (productModel != null) {
                productModel.setList(productService.findAllByCatalogId(productModel.getCatalog_id(),offset,limit));
            } else {
                productModel.setList(productService.findAll(offset,limit));
            }
            request.setAttribute("product", productModel);
        }
        RequestDispatcher rd = request.getRequestDispatcher("/views/web/product.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
