package eci.cosw.climapp.models;

public class Coordenate {
    private Long id;
    private double latitude;
    private double longitude;

    /**
     * @param latitude
     * @param longitude
     */
    public Coordenate(Long id,double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.id=id;
    }
    
        /**
     * @param latitude
     * @param longitude
     */
    public Coordenate(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Coordenate(){

    }

    /**
     * @return the latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * @param latitude the latitude to set
     */
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    /**
     * @return the longitude
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(double longitude) {
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
