package com.example.demo.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


/**
 * @author lucy
 */
@RestController
@RequestMapping({"/","/v1","/v2"})
public class TestController {

    @Autowired
    Environment environment;

    private final Logger logger = Logger.getLogger(TestController.class);

    @RequestMapping(value="/test", method= RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public String getTest(HttpServletRequest request){
        logger.info("TestController");
        return "test" + environment.getProperty("local.server.port");
    }
}
