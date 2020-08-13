package cl.mineduc.sismica.actividad.domain.usgs.earthquake;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FeatureCollection {
    private String type;
    private Metadata metadata;
    private ArrayList<Feature> features = new ArrayList<>();
    private ArrayList<Object> bbox = new ArrayList<Object>();

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
     * Getter for property 'metadata'.
     *
     * @return Value for property 'metadata'.
     */
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * Setter for property 'metadata'.
     *
     * @param metadata Value to set for property 'metadata'.
     */
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     * Getter for property 'features'.
     *
     * @return Value for property 'features'.
     */
    public ArrayList<Feature> getFeatures() {
        return features;
    }

    /**
     * Setter for property 'features'.
     *
     * @param features Value to set for property 'features'.
     */
    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }

    /**
     * Getter for property 'bbox'.
     *
     * @return Value for property 'bbox'.
     */
    public ArrayList<Object> getBbox() {
        return bbox;
    }

    /**
     * Setter for property 'bbox'.
     *
     * @param bbox Value to set for property 'bbox'.
     */
    public void setBbox(ArrayList<Object> bbox) {
        this.bbox = bbox;
    }


    @Override
    public String toString() {
        return "FeatureCollection{" +
                "type='" + type + '\'' +
                ", metadata=" + metadata +
                ", features=" + features +
                '}';
    }
}
