package seppe.alpaerts.eindproject_seppe_jochem.model;

import org.springframework.data.repository.CrudRepository;

public interface ProductDAO extends CrudRepository<DierenProduct, Integer> {

    public static DierenProduct findByFilter(String categorie) {
        DierenProduct prodduct = findByFilter(categorie);
        return prodduct;
    }
}




