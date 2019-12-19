package seppe.alpaerts.eindproject_seppe_jochem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import seppe.alpaerts.eindproject_seppe_jochem.model.DierenProduct;
import seppe.alpaerts.eindproject_seppe_jochem.model.ProductDAO;

@Controller
public class ProductFilterController {

    @Autowired
    ProductDAO dao;

    @ModelAttribute(value = "categorie")
    public Iterable<DierenProduct> getAllProduct() {
        return dao.findAll();
    }

    @RequestMapping(value = "/productfilter/{categorie}", method = RequestMethod.GET)
    public String filter(ModelMap map, @PathVariable(value = "categorie") String product) {
        map.addAttribute("categorie", dao.findByCategorie(product));
        return "productFilter";

    }
}
