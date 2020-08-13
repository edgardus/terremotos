package cl.mineduc.sismica.actividad.repository;

import cl.mineduc.sismica.actividad.domain.usgs.earthquake.FeatureProperties;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeaturePropertiesRepository extends CrudRepository<FeatureProperties, Long> {
}
