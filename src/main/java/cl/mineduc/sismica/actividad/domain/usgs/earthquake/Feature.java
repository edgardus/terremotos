package cl.mineduc.sismica.actividad.domain.usgs.earthquake;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Feature {
    private String type;
    private FeatureProperties featureProperties;
    private String geometryObject;
    private String id;


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
     * Getter for property 'featureProperties'.
     *
     * @return Value for property 'featureProperties'.
     */
    public FeatureProperties getFeatureProperties() {
        return featureProperties;
    }

    /**
     * Setter for property 'featureProperties'.
     *
     * @param featureProperties Value to set for property 'featureProperties'.
     */
    public void setFeatureProperties(FeatureProperties featureProperties) {
        this.featureProperties = featureProperties;
    }

    /**
     * Getter for property 'geometryObject'.
     *
     * @return Value for property 'geometryObject'.
     */
    public String getGeometryObject() {
        return geometryObject;
    }

    /**
     * Setter for property 'geometryObject'.
     *
     * @param geometryObject Value to set for property 'geometryObject'.
     */
    public void setGeometryObject(String geometryObject) {
        this.geometryObject = geometryObject;
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

    @Override
    public String toString() {
        return "Feature{" +
                "type='" + type + '\'' +
                ", featureProperties=" + featureProperties +
                ", geometryObject='" + geometryObject + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
