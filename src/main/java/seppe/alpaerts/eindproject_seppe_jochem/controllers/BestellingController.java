package seppe.alpaerts.eindproject_seppe_jochem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import seppe.alpaerts.eindproject_seppe_jochem.model.*;

import javax.validation.Valid;

/**Author Seppe
 **/

@Controller
public class BestellingController {

    @Autowired
    ProductDAO dao;

    /**
     * Modelattribute to make new bestelling
     *
     */

    @ModelAttribute(value = "nBestelling")
    public Bestelling nBestelling() {
        return new Bestelling();
    }

    /** get alle rijen winkelmandje, totaalprijs, created in class Winkelmandje
     *
     */

    @GetMapping(value = "/bestellingen")
    public String showWinkelmandje(ModelMap map) {
        map.addAttribute("alleRijen", Winkelmandje.getWINKELMANDJE());
        map.addAttribute("totaalprijs", Winkelmandje.bepaalTotaalPrijs());
        return "bestellingen";
    }

    /** to add Dierenproduct to winkelmandje
     *
     */



    @GetMapping(value = "/bestellingen/add/{id}")
    public String addToWinkelmandje(@PathVariable(value = "id") int id) {
        DierenProduct dProduct = dao.findById(id).get();
        Winkelmandje.addToWinkelmandje(dProduct);
        return "redirect:/index";

    }

    /** to delete dierenproduct from winkelmandje, find product by id -> remove product from winkel
     *
     */

    @RequestMapping(value = "/bestellingen/remove/{id}", method = RequestMethod.GET)
    public String removeFromWinkelmandje(@PathVariable(value = "id") int id) {
        DierenProduct dProduct = dao.findById(id).get();
        Winkelmandje.removeFromWinkelmandje(dProduct);
        return "redirect:/bestellingen";

    }

    /**to post the bestelling, return What's missing or return 'bedankt' page
     *
     */


    @RequestMapping(value = {"/bestellingen"}, method = RequestMethod.POST)
    public String saveBestelling(@ModelAttribute("nBestelling") @Valid Bestelling nBestelling, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "bestellingen";
        return "redirect:/bedankt";

    }


}
