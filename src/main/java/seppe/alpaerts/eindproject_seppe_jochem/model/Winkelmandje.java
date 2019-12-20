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

    /** Author: Seppe
     * add to winkelmandje, wanneer je product toevoegt, maakt hij nieuwe rij met aantal 1
     */

    public static void addToWinkelmandje(DierenProduct dProduct) {
        WINKELMANDJE.add(new Rij(dProduct, 1));
    }

    /** Author: Seppe
     * Geschreven bij consultatie van David
     *
     */
    public static void removeFromWinkelmandje(DierenProduct dProduct) {
        Rij toRemove = null;
        for (Rij r : WINKELMANDJE) {
            if(r.getDierenProduct().equals(dProduct) ){
                toRemove = r;
            }
        }
        WINKELMANDJE.remove(toRemove);
    }

    /** Author: Seppe
     * om totaalprijs te bepalen, for loop waarbij elke rij zijn prijs optelt bij de totaalprijs
     */


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
