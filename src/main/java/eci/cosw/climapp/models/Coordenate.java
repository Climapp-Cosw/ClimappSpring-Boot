package eci.cosw.climapp.models;

public class Coordenate {
    private Long id;
    private Long latitude;
    private Long longitude;

    /**
     * @param latitude
     * @param longitude
     */
    public Coordenate(Long id,Long latitude, Long longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.id=id;
    }

    public Coordenate(){

    }

    /**
     * @return the latitude
     */
    public Long getLatitude() {
        return latitude;
    }

    /**
     * @param latitude the latitude to set
     */
    public void setLatitude(Long latitude) {
        this.latitude = latitude;
    }

    /**
     * @return the longitude
     */
    public Long getLongitude() {
        return longitude;
    }

    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(Long longitude) {
        this.longitude = longitude;
    }

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Coordenate{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
