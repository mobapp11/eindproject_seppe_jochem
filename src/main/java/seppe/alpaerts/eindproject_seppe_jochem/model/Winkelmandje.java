package seppe.alpaerts.eindproject_seppe_jochem.model;

import javax.persistence.Entity;
import java.util.HashSet;
import java.util.Set;

public class Winkelmandje {

    public static HashSet <Rij> WINKELMANDJE= new HashSet<>();

    public Winkelmandje() {
    }


    public static void addToWinkelmandje (DierenProduct dProduct) {WINKELMANDJE.add(new Rij(dProduct,1));}

    public static void removeFromWinkelmandje(DierenProduct dProduct) {WINKELMANDJE.remove(new Rij(dProduct,1));}

    public static HashSet<Rij> getWinkelmandje() {return WINKELMANDJE;}

}
