package com.web.controller;


import com.web.DAO.AccountDAO;
import com.web.domain.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController{

    @Autowired
    public AccountDAO accountDAO;


    @RequestMapping(value="/")
    public String indexPage(ModelMap model) {
        Account account = accountDAO.getAll().get(0);
        model.addAttribute("message", account);
        return "index";
    }

    @RequestMapping(value="/registration")
    public String registrationPage(ModelMap model) {
        Account account = accountDAO.getAll().get(0);
        model.addAttribute("message", account);
        return "registration";
    }

    @RequestMapping(value = "/allOk", method = RequestMethod.POST)
    public String okregistration(ModelMap model) {

        model.addAttribute("message", "Spring 3 MVC - Hello World");
        return "allOk";
    }

    @RequestMapping(value = "/statistic-page")
    public String statistic(ModelMap model) {

        model.addAttribute("message", "Spring 3 MVC - Hello World");
        return "statistic-page";
    }
}
