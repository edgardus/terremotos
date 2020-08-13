package cl.mineduc.sismica.actividad.controller;

import cl.mineduc.sismica.actividad.domain.usgs.earthquake.FeatureCollection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class ConsultaActividadController {


    RestTemplate restTemplate = new RestTemplate();
    private static final Logger log = LoggerFactory.getLogger(ConsultaActividadController.class);


    @GetMapping("/fecha")
    public FeatureCollection consultaPorFecha(
            @RequestParam(value = "starttime", defaultValue = "") String starttime,
            @RequestParam(value = "endtime", defaultValue = "2020-12-31") String endtime) {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        FeatureCollection featureCollection = new FeatureCollection();
        try {
            if (starttime == null || starttime.isEmpty()) {
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
    public Boolean persiste(){



        return true;
    }

}



