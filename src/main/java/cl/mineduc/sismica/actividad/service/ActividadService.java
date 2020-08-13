package cl.mineduc.sismica.actividad.service;

import cl.mineduc.sismica.actividad.domain.usgs.earthquake.*;
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

    public List<Feature> saveFeatures(FeatureCollection featureCollection) {
        List<Feature> featureList = new ArrayList<Feature>();
        for (Feature f : featureCollection.getFeatures()) {
            f.setGeometry( geometryRepository.save(f.getGeometry()));
            f.setProperties ( propertiesRepository.save(f.getProperties()));
            featureList.add(featureRepository.save(f));
        }


        return featureList;

    }
}
