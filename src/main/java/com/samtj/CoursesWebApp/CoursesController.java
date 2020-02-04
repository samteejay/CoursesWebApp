/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.samtj.CoursesWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Omali
 */
@Controller
public class CoursesController {
    
    @RequestMapping("/courses")
    public ModelAndView courses(@RequestParam("cname") String coursename) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("cname", coursename);
        mv.setViewName("courses");
        return mv;
    }
}
