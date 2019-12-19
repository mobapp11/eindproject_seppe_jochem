package seppe.alpaerts.eindproject_seppe_jochem.model;

import org.springframework.data.repository.CrudRepository;

/** Author:Seppe
 * dao gemaakt om evt bestellingen te kunnen saven, maar niet toegepast
 */

public interface BestellingDAO extends CrudRepository<Bestelling, Integer> {
}
