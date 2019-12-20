package seppe.alpaerts.eindproject_seppe_jochem.model.bestelling;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

/**
 * Author: Seppe Alpaerts
 * Made class for bestelling, to make a form
 */

@Entity
public class Bestelling {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NotBlank(message = "Allé allé iedereen heeft een naam, dus ook jij!")
    private String naam;
    @NotBlank(message = "Allé allé iedereen heeft een achternaam, dus ook jij!")
    private String voornaam;
    @NotBlank(message = "Allé allé iedereen heeft een e-mail adres, dus ook jij!")
    private String email;
    @NotBlank(message = "Ik hoop dat je niet dakloos bent!")
    private String adres;
    private String telnr;

    public Bestelling() {
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getTelnr() {
        return telnr;
    }

    public void setTelnr(String telnr) {
        this.telnr = telnr;
    }
}
