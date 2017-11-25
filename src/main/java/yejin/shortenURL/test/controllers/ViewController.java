package yejin.shortenURL.test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by ByeongChan on 2017. 11. 23..
 */

@Controller
@RequestMapping("/")
public class ViewController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(){
        return "/home";
    }
}
