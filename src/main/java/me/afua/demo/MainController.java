package me.afua.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {
    @RequestMapping("/")
    public String showFirstRoute()
    {
        return "index";
    }

    @RequestMapping("/randomroutethatiwanttouse")
    public String showNextRoute()
    {
        return "random";
    }
}
