package cl.mineduc.sismica.actividad.domain.usgs.earthquake;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Metadata {
    private Float generated;
    private String url;
    private String title;
    private Float status;
    private String api;
    private Float count;

    /**
     * Getter for property 'generated'.
     *
     * @return Value for property 'generated'.
     */
    public Float getGenerated() {
        return generated;
    }

    /**
     * Setter for property 'generated'.
     *
     * @param generated Value to set for property 'generated'.
     */
    public void setGenerated(Float generated) {
        this.generated = generated;
    }

    /**
     * Getter for property 'url'.
     *
     * @return Value for property 'url'.
     */
    public String getUrl() {
        return url;
    }

    /**
     * Setter for property 'url'.
     *
     * @param url Value to set for property 'url'.
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Getter for property 'title'.
     *
     * @return Value for property 'title'.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter for property 'title'.
     *
     * @param title Value to set for property 'title'.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter for property 'status'.
     *
     * @return Value for property 'status'.
     */
    public Float getStatus() {
        return status;
    }

    /**
     * Setter for property 'status'.
     *
     * @param status Value to set for property 'status'.
     */
    public void setStatus(Float status) {
        this.status = status;
    }

    /**
     * Getter for property 'api'.
     *
     * @return Value for property 'api'.
     */
    public String getApi() {
        return api;
    }

    /**
     * Setter for property 'api'.
     *
     * @param api Value to set for property 'api'.
     */
    public void setApi(String api) {
        this.api = api;
    }

    /**
     * Getter for property 'count'.
     *
     * @return Value for property 'count'.
     */
    public Float getCount() {
        return count;
    }

    /**
     * Setter for property 'count'.
     *
     * @param count Value to set for property 'count'.
     */
    public void setCount(Float count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Metadata{" +
                "generated=" + generated +
                ", url='" + url + '\'' +
                ", title='" + title + '\'' +
                ", status=" + status +
                ", api='" + api + '\'' +
                ", count=" + count +
                '}';
    }
}
