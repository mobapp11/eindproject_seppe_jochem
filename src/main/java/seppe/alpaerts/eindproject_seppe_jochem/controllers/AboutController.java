package seppe.alpaerts.eindproject_seppe_jochem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class AboutController {

    @RequestMapping(method = RequestMethod.GET, value = "/about")
    public String showAbout() {
        return "about";
    }
}
