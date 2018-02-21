package eci.cosw.climapp.models;


import java.awt.*;
import java.util.Date;

public class Report {

    private Long id;
    private Date dateTimeReport;
    private Coordenate latLng;
    private Image img;
    private String coment;
    private String weather;
    private Long ratio;
    private User reportedUser;

    /**
     * @param id
     * @param dateTimeReport
     * @param latLng
     * @param img
     * @param coment
     * @param clima
     */
    public Report(Long id,Date dateTimeReport, Coordenate latLng, Image img, String coment, String clima, User u,Long ratio) {
        this.dateTimeReport = dateTimeReport;
        this.latLng = latLng;
        this.img = img;
        this.coment = coment;
        this.weather = clima;
        this.id=id;
        this.reportedUser=u;
        this.ratio=ratio;
    }

    public Report() {
    }

    /**
     * @return the dateTimeReport
     */
    public Date getDateTimeReport() {
        return dateTimeReport;
    }

    /**
     * @return the ratio
     */
    public Long getRatio() {
        return ratio;
    }

    /**
     * @param ratio the ratio to set
     */
    public void setRatio(Long ratio) {
        this.ratio = ratio;
    }

    /**
     *
     * @return the reportedUser
     */
    public User getReportedUser() {
        return reportedUser;
    }

    /**
     * @param reportedUser the reportedUser to set
     */
    public void setReportedUser(User reportedUser) {
        this.reportedUser = reportedUser;
    }

    /**
     * @param dateTimeReport the dateTimeReport to set
     */
    public void setDateTimeReport(Date dateTimeReport) {
        this.dateTimeReport = dateTimeReport;
    }

    /**
     * @return the Coordenate
     */
    public Coordenate getLatLng() {
        return latLng;
    }

    /**
     * @param latLng the Coordenate to set
     */
    public void setLatLng(Coordenate latLng) {
        this.latLng = latLng;
    }

    /**
     * @return the image
     */
    public Image getImg() {
        return img;
    }

    /**
     * @param img the image to set
     */
    public void setImg(Image img) {
        this.img = img;
    }

    /**
     * @return the coment
     */
    public String getComent() {
        return coment;
    }

    /**
     * @param coment the coment to set
     */
    public void setComent(String coment) {
        this.coment = coment;
    }

    /**
     * @return the clima
     */
    public String getWeather() {
        return weather;
    }

    /**
     * @param clima the clima to set
     */
    public void setWeather(String clima) {
        this.weather = clima;
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
        return "Report{" +
                "id=" + id +
                ", dateTimeReport=" + dateTimeReport +
                ", latLng=" + latLng +
                ", img=" + img +
                ", coment='" + coment + '\'' +
                ", weather='" + weather + '\'' +
                ", ratio=" + ratio +
                ", reportedUser=" + reportedUser +
                '}';
    }
}
