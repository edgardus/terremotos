package cl.mineduc.sismica.actividad.domain.usgs.earthquake;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
public class Geometry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private ArrayList<Float> coordinates  = new ArrayList<>();

    /**
     * Getter for property 'id'.
     *
     * @return Value for property 'id'.
     */
    public Long getId() {
        return id;
    }

    /**
     * Setter for property 'id'.
     *
     * @param id Value to set for property 'id'.
     */
    public void setId(Long id) {
        this.id = id;
    }

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
     * Getter for property 'coordinates'.
     *
     * @return Value for property 'coordinates'.
     */
    public ArrayList<Float> getCoordinates() {
        return coordinates;
    }

    /**
     * Setter for property 'coordinates'.
     *
     * @param coordinates Value to set for property 'coordinates'.
     */
    public void setCoordinates(ArrayList<Float> coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "Geometry{" +
                "id=" + id.toString() +
                ", type='" + type + '\'' +
                ", coordinates=" + coordinates +
                '}';
    }
}
