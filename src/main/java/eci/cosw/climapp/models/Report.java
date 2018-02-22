package eci.cosw.climapp.models;


import java.awt.*;
import java.util.Date;

public class Report {

    private Long id;
    private Date dateTimeReport;
    private Coordenate coordenate;
    private Image img;
    private String coment;
    private String weather;
    private User reportedUser;
    private Zone zone;

    /**
     * @param id
     * @param dateTimeReport
     * @param latLng
     * @param img
     * @param coment
     * @param clima
     */
    public Report(Long id,Date dateTimeReport, Coordenate latLng, Image img, String coment, String clima, User u,Zone z) {
        this.dateTimeReport = dateTimeReport;
        this.coordenate = latLng;
        this.img = img;
        this.coment = coment;
        this.weather = clima;
        this.id=id;
        this.reportedUser=u;
        this.zone=z;
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
    public Coordenate getCoordenate() {
        return coordenate;
    }

    /**
     * @param latLng the Coordenate to set
     */
    public void setCoordenate(Coordenate latLng) {
        this.coordenate = latLng;
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
                ", latLng=" + coordenate +
                ", img=" + img +
                ", coment='" + coment + '\'' +
                ", weather='" + weather + '\'' +
                ", reportedUser=" + reportedUser +
                '}';
    }
}
