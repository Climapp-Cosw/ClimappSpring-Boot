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

    public double distCoordenate(Coordenate otherCoordenate){
        double ratio = 6371;//Km
        double dLat = Math.toRadians(otherCoordenate.getLatitude() - this.getLatitude());
        double dLng = Math.toRadians(otherCoordenate.getLongitude() - this.getLongitude());
        double sindLat = Math.sin(dLat / 2);
        double sindLng = Math.sin(dLng / 2);
        double va1 = Math.pow(sindLat, 2) + Math.pow(sindLng, 2) * Math.cos(Math.toRadians(this.getLongitude())) * Math.cos(Math.toRadians(this.getLatitude()));
        double va2 = 2 * Math.atan2(Math.sqrt(va1), Math.sqrt(1 - va1));
        double dist = ratio * va2;
        System.out.println("Distance"+dist);
        return dist;
    };
    @Override
    public String toString() {
        return "Coordenate{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
