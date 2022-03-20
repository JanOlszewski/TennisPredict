package com.tennispredict.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/app")
public class IndexController {

    @GetMapping(value = "")
    public String index() {
        return "forward:app/index.html";
    }
    
    @GetMapping(value = "/")
    public String indexSlashed() {
        return "forward:index.html";
    }

}
