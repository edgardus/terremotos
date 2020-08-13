package cl.mineduc.sismica.actividad.controller;

import cl.mineduc.sismica.actividad.domain.usgs.earthquake.Feature;
import cl.mineduc.sismica.actividad.domain.usgs.earthquake.FeatureCollection;
import cl.mineduc.sismica.actividad.service.ActividadService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
public class ConsultaActividadController {


    private static final Logger log = LoggerFactory.getLogger(ConsultaActividadController.class);

    private final RestTemplate restTemplate = new RestTemplate();
    @Autowired
    private ActividadService actividadService;

    @GetMapping("/fecha")
    public FeatureCollection consultaPorFecha(
            @RequestParam(value = "starttime", defaultValue = "") String starttime,
            @RequestParam(value = "endtime", defaultValue = "2020-12-31") String endtime) {

        FeatureCollection featureCollection = new FeatureCollection();
        try {
            if (starttime == null || starttime.isEmpty()) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                starttime = dateFormat.format(new Date());
            }
            log.info("starttime=" + starttime);
            log.info("endtime=" + endtime);
            String url = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson" +
                    "&starttime=" + starttime +
                    "&endtime=" + endtime;

            log.info("url = " + url);
            featureCollection = restTemplate.getForObject(url, FeatureCollection.class);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("error en :----", e.getCause());
        }
        log.info("<<<<<<<----");
        return featureCollection;
    }

    @GetMapping("/magnitud")
    public FeatureCollection consultaPorMagnitud(
            @RequestParam(value = "minmagnitude", defaultValue = "6") String min,
            @RequestParam(value = "maxmagnitude", defaultValue = "10") String max) {

        FeatureCollection featureCollection = new FeatureCollection();
        String url = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson" +
                "&minmagnitude=" + min +
                "&maxmagnitude=" + max;
        log.info("url = " + url);
        featureCollection = restTemplate.getForObject(url, FeatureCollection.class);
        return featureCollection;
    }

    @GetMapping("/")
    public List<Feature> persiste() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date hoyEs = new Date();
        String startDate = dateFormat.format(hoyEs);
        Calendar tomorrowIs = Calendar.getInstance();
        tomorrowIs.setTime(hoyEs);
        tomorrowIs.add(Calendar.DATE, 1);
        String endDate = dateFormat.format(tomorrowIs.getTime());
        FeatureCollection featureCollection = consultaPorFecha(startDate, endDate);
        List<Feature> featureList = actividadService.saveFeatures(featureCollection);
        return featureList;
    }

}



