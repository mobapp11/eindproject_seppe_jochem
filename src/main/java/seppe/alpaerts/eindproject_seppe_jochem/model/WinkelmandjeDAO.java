package seppe.alpaerts.eindproject_seppe_jochem.model;

import org.springframework.data.repository.CrudRepository;

import java.util.HashSet;

public interface WinkelmandjeDAO {
    public static final HashSet <Rij> WINKELMANDJE= new HashSet<>();

    public static void addRij (Rij c) {WINKELMANDJE.add(c);}

    public static void removeRij (Rij c) {WINKELMANDJE.remove(c);}

    public static HashSet<Rij> getWinkelmandje() {return WINKELMANDJE;}

}
