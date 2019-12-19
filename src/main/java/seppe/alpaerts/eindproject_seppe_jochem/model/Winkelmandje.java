package seppe.alpaerts.eindproject_seppe_jochem.model;

import javax.persistence.Entity;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/** Author: Seppe
 *  Created winkelmandje om weer te geven op bestellingpagina, dit is een lijst van alle producten die worden toegevoegd via index pagina
 */

public class Winkelmandje {

    private static HashSet<Rij> WINKELMANDJE = new HashSet<>();
    private BigDecimal totaalprijs;

    public Winkelmandje() {
    }


    public static void addToWinkelmandje(DierenProduct dProduct) {
        WINKELMANDJE.add(new Rij(dProduct, 1));
    }

    public static void removeFromWinkelmandje(DierenProduct dProduct) {
        WINKELMANDJE.remove(new Rij(dProduct, 1));
    }

    public static void deleteRij(Rij product) {
        WINKELMANDJE.remove(product);
    }


    public static BigDecimal bepaalTotaalPrijs() {
        BigDecimal totaalprijs = new BigDecimal(0);
        for (Rij rij : WINKELMANDJE) {
            BigDecimal prijs = rij.getDierenProduct().getPrijs();
            totaalprijs = totaalprijs.add(prijs);
        }
        return totaalprijs;
    }

    public BigDecimal getTotaalprijs() {
        return totaalprijs;
    }

    public void setTotaalprijs(BigDecimal totaalprijs) {
        this.totaalprijs = totaalprijs;
    }

    public static HashSet<Rij> getWINKELMANDJE() {
        return WINKELMANDJE;
    }

    public static void setWINKELMANDJE(HashSet<Rij> WINKELMANDJE) {
        Winkelmandje.WINKELMANDJE = WINKELMANDJE;
    }
}
