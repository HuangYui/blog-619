package com.hy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author : HY
 * @version : V1.0
 * @ClassName : MainController
 * @Description: 页面Controller
 * @date : 2021/8/2 16:40
 */
@Controller
@RequestMapping("/home")
public class PageController {

    @GetMapping("/lover-index")
    public String home() {
        return "index";
    }

}
