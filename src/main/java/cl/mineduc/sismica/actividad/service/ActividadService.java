package cl.mineduc.sismica.actividad.service;

import cl.mineduc.sismica.actividad.domain.usgs.earthquake.Feature;
import cl.mineduc.sismica.actividad.domain.usgs.earthquake.FeatureCollection;
import cl.mineduc.sismica.actividad.repository.FeaturePropertiesRepository;
import cl.mineduc.sismica.actividad.repository.FeatureRepository;
import cl.mineduc.sismica.actividad.repository.GeometryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class ActividadService {
    @Autowired
    private FeatureRepository featureRepository;
    @Autowired
    private FeaturePropertiesRepository propertiesRepository;
    @Autowired
    private GeometryRepository geometryRepository;

    /***
     * Metodo encargado de Persistir en la base de datos
     * los eventos sismicos en {@link Feature}.
     * @param {@link FeatureCollection} featureCollection
     * @return {@link List} <{@link Feature} >
     */
    public List<Feature> saveFeatures(FeatureCollection featureCollection) {
        List<Feature> featureList = new ArrayList<Feature>();
        try {
            for (Feature f : featureCollection.getFeatures()) {
                //Valida si existe el registro.
                if (!featureRepository.findById(f.getId()).isPresent()) {
                    f.setGeometry(geometryRepository.save(f.getGeometry()));
                    f.setProperties(propertiesRepository.save(f.getProperties()));
                    featureList.add(featureRepository.save(f));
                } else {
                    featureList.add(f);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return featureList;

    }
}
