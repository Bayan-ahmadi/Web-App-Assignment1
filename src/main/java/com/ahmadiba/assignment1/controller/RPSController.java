package com.ahmadiba.assignment1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RPSController {

    private final Logger logger = LoggerFactory.getLogger(RPSController.class);

    @GetMapping(value={"/", "/Input"})
    public String input(){
        logger.trace("input() is called");
        return "Input";
    }
}
