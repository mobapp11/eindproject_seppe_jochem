package seppe.alpaerts.eindproject_seppe_jochem.model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * Autor: Seppe
 * dao made om bestellingen te kunnen opslaan, maar niet gebruikt
 *
 **/


public interface ProductDAO extends CrudRepository<DierenProduct, Integer> {

    /** Autor: Jochem
     */
    Iterable<DierenProduct> findByCategorie(String categorie);
}




