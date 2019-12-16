package seppe.alpaerts.eindproject_seppe_jochem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import seppe.alpaerts.eindproject_seppe_jochem.model.DierenProduct;
import seppe.alpaerts.eindproject_seppe_jochem.model.ProductDAO;

@Controller
public class IndexController {

    @Autowired
    ProductDAO dao;

    @ModelAttribute(value = "all")
    public Iterable<DierenProduct> getAllProduct() {
        return dao.findAll();
    }

    @RequestMapping(value = {"", "/", "/index"}, method = RequestMethod.GET)
    public String showIndex(ModelMap map) {
        return "index";
    }

}
