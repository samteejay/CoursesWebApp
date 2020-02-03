/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samtj.CoursesWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Omali
 */
@Controller
public class CoursesController {
    
    @RequestMapping("/courses")
    public String courses() {
        return "courses.jsp";
    }
}
