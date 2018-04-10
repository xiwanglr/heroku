package com.example.heroku;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * .
 * Created by li.rui on 2018-04-10.
 */
@Controller
public class IndexController {

    @RequestMapping("index")
    public Object index(){
        return "index";
    }
}
