package seppe.alpaerts.eindproject_seppe_jochem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import seppe.alpaerts.eindproject_seppe_jochem.model.BestellingDAO;

@Controller
public class WinkelmandController {

    @Autowired
    BestellingDAO dao;

    @ModelAttribute
    @RequestMapping(value = {"/bestellingen"}, method = RequestMethod.GET)
    public String showWinkelmand(ModelMap map) {
        return "bestellingen";
    }



}
