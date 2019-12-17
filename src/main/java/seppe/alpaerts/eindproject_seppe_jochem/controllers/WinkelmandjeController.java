package seppe.alpaerts.eindproject_seppe_jochem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import seppe.alpaerts.eindproject_seppe_jochem.model.Rij;
import seppe.alpaerts.eindproject_seppe_jochem.model.WinkelmandjeDAO;

import java.util.HashSet;

@Controller

public class WinkelmandjeController {

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public HashSet<Rij> findAll(){
        return WinkelmandjeDAO.getWinkelmandje();
    }








}
