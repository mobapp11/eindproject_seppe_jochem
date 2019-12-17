package seppe.alpaerts.eindproject_seppe_jochem.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import seppe.alpaerts.eindproject_seppe_jochem.model.ProductDAO;

@Controller
public class controllerBedankt {
    @Autowired
    ProductDAO dao;

    @RequestMapping(method = RequestMethod.GET, value = "/bedankt")
    public String showBedankt() {
        return "bedankt";
    }
}