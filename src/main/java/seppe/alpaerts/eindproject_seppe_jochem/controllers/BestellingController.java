package seppe.alpaerts.eindproject_seppe_jochem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import seppe.alpaerts.eindproject_seppe_jochem.model.*;

import javax.validation.Valid;

@Controller
public class BestellingController {

    @Autowired
    ProductDAO dao;
    BestellingDAO daoBestelling;


    @ModelAttribute(value = "nBestelling")
    public Bestelling nBestelling() {
        return new Bestelling();
    }

    @GetMapping(value = "/bestellingen")
    public String showWinkelmandje(ModelMap map){
        map.addAttribute("alleRijen", Winkelmandje.getWinkelmandje());
        return "bestellingen";
    }

    @GetMapping(value = "/bestellingen/add/{id}")
    public String addToWinkelmandje (@PathVariable(value = "id")int id){
        DierenProduct dProduct= dao.findById(id).get();
        Winkelmandje.addToWinkelmandje(dProduct);
        return "redirect:/index";

    }

    @RequestMapping(value = "/bestellingen/remove/{id}")
    public String removeFromWinkelmandje (@PathVariable(value = "id")int id){
        DierenProduct dProduct= dao.findById(id).get();
        Winkelmandje.removeFromWinkelmandje(dProduct);
        return "redirect:/bestellingen";

    }

    @RequestMapping(value = {"/bestellingen"}, method = RequestMethod.POST)
    public String saveBestelling(@ModelAttribute("nBestelling") @Valid Bestelling nBestelling, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "bestellingen";
        return "redirect:/bedankt";
    }


    }
