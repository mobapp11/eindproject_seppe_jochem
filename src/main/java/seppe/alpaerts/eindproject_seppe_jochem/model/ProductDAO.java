package seppe.alpaerts.eindproject_seppe_jochem.model;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ProductDAO extends CrudRepository<DierenProduct, Integer> {

    Iterable<DierenProduct>  findByCategorie(String categorie) ;
}




