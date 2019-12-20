package seppe.alpaerts.eindproject_seppe_jochem.model.product;

import org.springframework.data.repository.CrudRepository;
import seppe.alpaerts.eindproject_seppe_jochem.model.product.DierenProduct;

/**
 * Autor: Seppe
 * dao made om bestellingen te kunnen opslaan, maar niet gebruikt
 **/


public interface ProductDAO extends CrudRepository<DierenProduct, Integer> {

    /**
     * Autor: Jochem
     */
    Iterable<DierenProduct> findByCategorie(String categorie);
}




