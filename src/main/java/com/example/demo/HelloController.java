package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * HelloController
 *
 * @author hxx
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    /**
     * GirlProperties
     */
    @Autowired
    private GirlProperties girlProperties;

    /**
     * say
     *
     * @param id id
     * @return String
     */
    @RequestMapping(value = "/say", method = RequestMethod.GET)
    public String say(@RequestParam(value = "id", required = false, defaultValue = "0") Integer id) {
        return "id:" + id;
//        return girlProperties.getCupSize();
    }
}
