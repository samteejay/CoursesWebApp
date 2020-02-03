/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samtj.CoursesWebApp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Omali
 */
@Controller
public class CoursesController {
    
    @RequestMapping("/courses")
    public String courses(HttpServletRequest req) {
        HttpSession session = req.getSession();
        String cname = req.getParameter("cname");
        session.setAttribute("cname", cname);
        return "courses";
    }
}
