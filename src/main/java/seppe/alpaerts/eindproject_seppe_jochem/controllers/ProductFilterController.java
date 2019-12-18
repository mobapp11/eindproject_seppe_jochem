package seppe.alpaerts.eindproject_seppe_jochem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import seppe.alpaerts.eindproject_seppe_jochem.model.DierenProduct;
import seppe.alpaerts.eindproject_seppe_jochem.model.ProductDAO;

@Controller
public class ProductFilterController {
    @Autowired
    ProductDAO dao;

    @ModelAttribute(value = "allCategorien")
    public Iterable<DierenProduct> getAllProduct() {
        return dao.findAll();
    }

    @RequestMapping(value= "/productfilter/{product}", method = RequestMethod.GET)
    public String showFilterProduct(ModelMap map, @PathVariable(value = "product")String product){
        map.addAttribute("ProductCategorie", ProductDAO.findByFilter(product));
            return "productfilter";
        }
    }
