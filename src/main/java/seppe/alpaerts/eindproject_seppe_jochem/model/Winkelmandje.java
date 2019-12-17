package seppe.alpaerts.eindproject_seppe_jochem.model;

import javax.persistence.Entity;
import java.util.HashSet;

public class Winkelmandje {

    private HashSet <Rij> lijst;

    public Winkelmandje() {
    }

    public HashSet<Rij> getLijst() {
        return lijst;
    }

    public void setLijst(HashSet<Rij> lijst) {
        this.lijst = lijst;
    }

}
