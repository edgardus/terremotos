package cl.mineduc.sismica.actividad.repository;

import cl.mineduc.sismica.actividad.domain.usgs.earthquake.Feature;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeatureRepository extends CrudRepository<Feature, String> {

}
