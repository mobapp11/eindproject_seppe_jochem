package seppe.alpaerts.eindproject_seppe_jochem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import seppe.alpaerts.eindproject_seppe_jochem.model.Bestelling;
import seppe.alpaerts.eindproject_seppe_jochem.model.BestellingDAO;
import seppe.alpaerts.eindproject_seppe_jochem.model.DierenProduct;
import seppe.alpaerts.eindproject_seppe_jochem.model.ProductDAO;

import javax.validation.Valid;

@Controller
public class WinkelmandController {

    @Autowired
    ProductDAO dao;
    BestellingDAO daoBestelling;

    @ModelAttribute(value = "all")
    public Iterable<DierenProduct> getAllProducten() {
        return dao.findAll();
    }

    @ModelAttribute(value = "allBestellingen")
    public Iterable<Bestelling> getAllBestellingen() {
        return daoBestelling.findAll();
    }

    @ModelAttribute(value = "nBestelling")
    public Bestelling newBestelling (){
        return new Bestelling();
    }

    @ModelAttribute
    @RequestMapping(value = {"/bestellingen"}, method = RequestMethod.GET)
    public String showWinkelmand(ModelMap map) {
        return "bestellingen";
    }

    @RequestMapping(value = {"/bestellingen"}, method = RequestMethod.POST)
    public String saveBestelling(@ModelAttribute("nBestelling")@Valid Bestelling nBestelling, BindingResult bindingResult){
        if (bindingResult.hasErrors())
            return "bestellingen";
        daoBestelling.save(nBestelling);
        return "redirect:/index";}






    }
