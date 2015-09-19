package com.peculiarproportionalities.justbreathe.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Tarish on 9/13/2015.
 */
@Controller
public class DefaultController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showWelcomePage() {
        return "index";
    }
}
