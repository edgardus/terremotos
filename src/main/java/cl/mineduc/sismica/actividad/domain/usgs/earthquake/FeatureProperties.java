package cl.mineduc.sismica.actividad.domain.usgs.earthquake;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FeatureProperties {

    private Float mag;
    private String place;
    private Float time;
    private Float updated;
    private Float tz;
    private String url;
    private String detail;
    private String felt = null;
    private String cdi = null;
    private String mmi = null;
    private String alert = null;
    private String status;
    private Float tsunami;
    private Float sig;
    private String net;
    private String code;
    private String ids;
    private String sources;
    private String types;
    private Float nst;
    private Float dmin;
    private Float rms;
    private Float gap;
    private String magType;
    private String type;
    private String title;

    /**
     * Getter for property 'mag'.
     *
     * @return Value for property 'mag'.
     */
    public Float getMag() {
        return mag;
    }

    /**
     * Setter for property 'mag'.
     *
     * @param mag Value to set for property 'mag'.
     */
    public void setMag(Float mag) {
        this.mag = mag;
    }

    /**
     * Getter for property 'place'.
     *
     * @return Value for property 'place'.
     */
    public String getPlace() {
        return place;
    }

    /**
     * Setter for property 'place'.
     *
     * @param place Value to set for property 'place'.
     */
    public void setPlace(String place) {
        this.place = place;
    }

    /**
     * Getter for property 'time'.
     *
     * @return Value for property 'time'.
     */
    public Float getTime() {
        return time;
    }

    /**
     * Setter for property 'time'.
     *
     * @param time Value to set for property 'time'.
     */
    public void setTime(Float time) {
        this.time = time;
    }

    /**
     * Getter for property 'updated'.
     *
     * @return Value for property 'updated'.
     */
    public Float getUpdated() {
        return updated;
    }

    /**
     * Setter for property 'updated'.
     *
     * @param updated Value to set for property 'updated'.
     */
    public void setUpdated(Float updated) {
        this.updated = updated;
    }

    /**
     * Getter for property 'tz'.
     *
     * @return Value for property 'tz'.
     */
    public Float getTz() {
        return tz;
    }

    /**
     * Setter for property 'tz'.
     *
     * @param tz Value to set for property 'tz'.
     */
    public void setTz(Float tz) {
        this.tz = tz;
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
     * Getter for property 'detail'.
     *
     * @return Value for property 'detail'.
     */
    public String getDetail() {
        return detail;
    }

    /**
     * Setter for property 'detail'.
     *
     * @param detail Value to set for property 'detail'.
     */
    public void setDetail(String detail) {
        this.detail = detail;
    }

    /**
     * Getter for property 'felt'.
     *
     * @return Value for property 'felt'.
     */
    public String getFelt() {
        return felt;
    }

    /**
     * Setter for property 'felt'.
     *
     * @param felt Value to set for property 'felt'.
     */
    public void setFelt(String felt) {
        this.felt = felt;
    }

    /**
     * Getter for property 'cdi'.
     *
     * @return Value for property 'cdi'.
     */
    public String getCdi() {
        return cdi;
    }

    /**
     * Setter for property 'cdi'.
     *
     * @param cdi Value to set for property 'cdi'.
     */
    public void setCdi(String cdi) {
        this.cdi = cdi;
    }

    /**
     * Getter for property 'mmi'.
     *
     * @return Value for property 'mmi'.
     */
    public String getMmi() {
        return mmi;
    }

    /**
     * Setter for property 'mmi'.
     *
     * @param mmi Value to set for property 'mmi'.
     */
    public void setMmi(String mmi) {
        this.mmi = mmi;
    }

    /**
     * Getter for property 'alert'.
     *
     * @return Value for property 'alert'.
     */
    public String getAlert() {
        return alert;
    }

    /**
     * Setter for property 'alert'.
     *
     * @param alert Value to set for property 'alert'.
     */
    public void setAlert(String alert) {
        this.alert = alert;
    }

    /**
     * Getter for property 'status'.
     *
     * @return Value for property 'status'.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Setter for property 'status'.
     *
     * @param status Value to set for property 'status'.
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * Getter for property 'tsunami'.
     *
     * @return Value for property 'tsunami'.
     */
    public Float getTsunami() {
        return tsunami;
    }

    /**
     * Setter for property 'tsunami'.
     *
     * @param tsunami Value to set for property 'tsunami'.
     */
    public void setTsunami(Float tsunami) {
        this.tsunami = tsunami;
    }

    /**
     * Getter for property 'sig'.
     *
     * @return Value for property 'sig'.
     */
    public Float getSig() {
        return sig;
    }

    /**
     * Setter for property 'sig'.
     *
     * @param sig Value to set for property 'sig'.
     */
    public void setSig(Float sig) {
        this.sig = sig;
    }

    /**
     * Getter for property 'net'.
     *
     * @return Value for property 'net'.
     */
    public String getNet() {
        return net;
    }

    /**
     * Setter for property 'net'.
     *
     * @param net Value to set for property 'net'.
     */
    public void setNet(String net) {
        this.net = net;
    }

    /**
     * Getter for property 'code'.
     *
     * @return Value for property 'code'.
     */
    public String getCode() {
        return code;
    }

    /**
     * Setter for property 'code'.
     *
     * @param code Value to set for property 'code'.
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Getter for property 'ids'.
     *
     * @return Value for property 'ids'.
     */
    public String getIds() {
        return ids;
    }

    /**
     * Setter for property 'ids'.
     *
     * @param ids Value to set for property 'ids'.
     */
    public void setIds(String ids) {
        this.ids = ids;
    }

    /**
     * Getter for property 'sources'.
     *
     * @return Value for property 'sources'.
     */
    public String getSources() {
        return sources;
    }

    /**
     * Setter for property 'sources'.
     *
     * @param sources Value to set for property 'sources'.
     */
    public void setSources(String sources) {
        this.sources = sources;
    }

    /**
     * Getter for property 'types'.
     *
     * @return Value for property 'types'.
     */
    public String getTypes() {
        return types;
    }

    /**
     * Setter for property 'types'.
     *
     * @param types Value to set for property 'types'.
     */
    public void setTypes(String types) {
        this.types = types;
    }

    /**
     * Getter for property 'nst'.
     *
     * @return Value for property 'nst'.
     */
    public Float getNst() {
        return nst;
    }

    /**
     * Setter for property 'nst'.
     *
     * @param nst Value to set for property 'nst'.
     */
    public void setNst(Float nst) {
        this.nst = nst;
    }

    /**
     * Getter for property 'dmin'.
     *
     * @return Value for property 'dmin'.
     */
    public Float getDmin() {
        return dmin;
    }

    /**
     * Setter for property 'dmin'.
     *
     * @param dmin Value to set for property 'dmin'.
     */
    public void setDmin(Float dmin) {
        this.dmin = dmin;
    }

    /**
     * Getter for property 'rms'.
     *
     * @return Value for property 'rms'.
     */
    public Float getRms() {
        return rms;
    }

    /**
     * Setter for property 'rms'.
     *
     * @param rms Value to set for property 'rms'.
     */
    public void setRms(Float rms) {
        this.rms = rms;
    }

    /**
     * Getter for property 'gap'.
     *
     * @return Value for property 'gap'.
     */
    public Float getGap() {
        return gap;
    }

    /**
     * Setter for property 'gap'.
     *
     * @param gap Value to set for property 'gap'.
     */
    public void setGap(Float gap) {
        this.gap = gap;
    }

    /**
     * Getter for property 'magType'.
     *
     * @return Value for property 'magType'.
     */
    public String getMagType() {
        return magType;
    }

    /**
     * Setter for property 'magType'.
     *
     * @param magType Value to set for property 'magType'.
     */
    public void setMagType(String magType) {
        this.magType = magType;
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

    @Override
    public String toString() {
        return "FeatureProperties{" +
                "mag=" + mag +
                ", place='" + place + '\'' +
                ", time=" + time +
                ", updated=" + updated +
                ", tz=" + tz +
                ", url='" + url + '\'' +
                ", detail='" + detail + '\'' +
                ", felt='" + felt + '\'' +
                ", cdi='" + cdi + '\'' +
                ", mmi='" + mmi + '\'' +
                ", alert='" + alert + '\'' +
                ", status='" + status + '\'' +
                ", tsunami=" + tsunami +
                ", sig=" + sig +
                ", net='" + net + '\'' +
                ", code='" + code + '\'' +
                ", ids='" + ids + '\'' +
                ", sources='" + sources + '\'' +
                ", types='" + types + '\'' +
                ", nst=" + nst +
                ", dmin=" + dmin +
                ", rms=" + rms +
                ", gap=" + gap +
                ", magType='" + magType + '\'' +
                ", type='" + type + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
