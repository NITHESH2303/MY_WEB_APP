package com.example.mywebapp;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController
{
    @RequestMapping("home")
    //@ResponseBody
    public ModelAndView home(Alien alien) {
//        HttpSession session = req.getSession();
//        String name = req.getParameter("name");
        ModelAndView mv  = new ModelAndView();
//        System.out.println("hi " + myName);
//        session.setAttribute("name",myName);
        mv.addObject("obj",alien);
        mv.setViewName("home.jsp");
        return mv;
    }
}