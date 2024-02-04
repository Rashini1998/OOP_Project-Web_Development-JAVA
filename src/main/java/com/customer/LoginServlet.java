package com.customer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

import static com.customer.CustomerDBUtil.validate;

public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        //catch the username and password
        String username =  req.getParameter("uid");
        String password =  req.getParameter("pass");

        try {
            List<Customer> cusDetails = CustomerDBUtil.validate(username,password);
            req.setAttribute("cusDetails",cusDetails);
        }catch (Exception e){
            e.printStackTrace();
        }
        RequestDispatcher dis = req.getRequestDispatcher("userAccount.jsp");
        dis.forward(req,resp);

    }
}
