package com.luv2code.springdemo.controller;

import com.luv2code.springdemo.dao.CustomerDAO;
import com.luv2code.springdemo.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController
{
    @Autowired
    private CustomerDAO customerDAO;

    @GetMapping( "/list")
    public String listCustomers( Model model){

        List<Customer> customers = customerDAO.getCustomers();
        model.addAttribute( "customers", customers );

        return "list-customers";
    }
}
