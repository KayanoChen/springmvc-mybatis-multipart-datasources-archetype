package it.pkg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @ProjectName: kayanochen
 * @Package: it.pkg.controller
 * @Description:
 * @Author: ylkj
 * @CreateDate: 16:30 2018/10/31
 * @Version: 1.0
 */
@Controller
public class TestController {

    @Autowired
    private it.pkg.mapper.datasource0.TestMapper testMapper0;
    @Autowired
    private it.pkg.mapper.datasource1.TestMapper testMapper1;

    @RequestMapping("test")
    public ModelAndView test(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("test.jsp");
        mv.addObject("data0",testMapper0.getAllTest());
        mv.addObject("data1",testMapper1.getAllTest());
        return mv;
    }
}
