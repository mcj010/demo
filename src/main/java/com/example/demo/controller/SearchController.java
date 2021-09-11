package com.example.demo.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


/**
 * @author lucy
 */
@RestController
public class SearchController {

    private final Logger logger = Logger.getLogger(SearchController.class);

    @RequestMapping(value="/search", method= RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public String search(@RequestParam("q") String wd){
        logger.info("SearchController key=" + wd);
        return "search:" + wd;
    }
}
