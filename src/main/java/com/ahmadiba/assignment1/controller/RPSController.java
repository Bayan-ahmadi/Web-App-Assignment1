package com.ahmadiba.assignment1.controller;

import com.ahmadiba.assignment1.domain.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RPSController {

    private final Logger logger = LoggerFactory.getLogger(RPSController.class);

    @GetMapping(value={"/", "/Input"})
    public String input(){
        logger.trace("input() is called");
        return "Input";
    }

    @GetMapping("/Output")
    public ModelAndView output(@ModelAttribute Result result){
        logger.trace("output() is called");
        logger.debug("result = " + result);
        return new ModelAndView("Output", "result", result);
    }
}
