package com.example.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/{input1}/and/{input2}")
    @ResponseBody
    public String add(@PathVariable Integer input1,@PathVariable Integer input2){

//        return "out put = " + (input1+input2);
        return String.valueOf(input1+input2);
    }

    @GetMapping("/sub/{input1}/from/{input2}")
    @ResponseBody
    public String sub(@PathVariable Integer input1,@PathVariable Integer input2){
        return "out put = " + (input1-input2);
    }

    @GetMapping("/multi/{input1}/and/{input2}")
    @ResponseBody
    public String multi(@PathVariable Integer input1,@PathVariable Integer input2){
        return "out put = " + (input1 * input2);
    }

    @GetMapping("/div/{input1}/by/{input2}")
    @ResponseBody
    public String div(@PathVariable Integer input1,@PathVariable Integer input2){
        return "out put = " + (input1/input2);
    }

}
