package cl.mineduc.sismica.actividad.domain.usgs.earthquake;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Feature {
    @Id
    private String id;

    private String type;

    @OneToOne(fetch = FetchType.LAZY)
    private FeatureProperties properties;

    @OneToOne(fetch = FetchType.LAZY)
    private Geometry geometry;


    /**
     * Getter for property 'type'.
     *
     * @return Value for property 'type'.
     */
    public String getType() {
        return type;
    }

    /**
     * Setter for property 'type'.
     *
     * @param type Value to set for property 'type'.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Getter for property 'properties'.
     *
     * @return Value for property 'properties'.
     */
    public FeatureProperties getProperties() {
        return properties;
    }

    /**
     * Setter for property 'properties'.
     *
     * @param properties Value to set for property 'properties'.
     */
    public void setProperties(FeatureProperties properties) { this.properties = properties;
    }


    /**
     * Getter for property 'id'.
     *
     * @return Value for property 'id'.
     */
    public String getId() {
        return id;
    }

    /**
     * Setter for property 'id'.
     *
     * @param id Value to set for property 'id'.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for property 'geometry'.
     *
     * @return Value for property 'geometry'.
     */
    public Geometry getGeometry() { return geometry; }

    /**
     * Setter for property 'geometry'.
     *
     * @param geometry Value to set for property 'geometry'.
     */
    public void setGeometry(Geometry geometry) { this.geometry = geometry; }


    @Override
    public String toString() {
        return "Feature{" +
                "type='" + type + '\'' +
                ", properties=" + properties +
                ", id='" + id + '\'' +
                ", geometry=" + geometry +
                '}';
    }
}
