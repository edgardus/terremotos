package cl.mineduc.sismica.actividad.repository;

import cl.mineduc.sismica.actividad.domain.usgs.earthquake.Geometry;
import org.springframework.data.repository.CrudRepository;

public interface GeometryRepository extends CrudRepository<Geometry, String> {
}
