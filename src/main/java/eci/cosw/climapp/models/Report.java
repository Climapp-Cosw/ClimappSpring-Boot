package eci.cosw.climapp.models;


import java.util.Date;

public class Report {

    private int id;
    private Date dateTimeReport;
    private Coordinate coordinate;
    private String img;
    private String comment;
    private String weather;
    private User reportedUser;
    private Zone zone;

    /**
     * @param id
     * @param dateTimeReport
     * @param latLng
     * @param img
     * @param comment
     * @param clima
     */
    public Report(int id,Date dateTimeReport, Coordinate latLng, String img, String comment, String clima, User u,Zone z) {
        this.dateTimeReport = dateTimeReport;
        this.coordinate = latLng;
        this.img = img;
        this.comment = comment;
        this.weather = clima;
        this.id=id;
        this.reportedUser=u;
        this.zone=z;
    }

    /**
     * @param dateTimeReport
     * @param latLng
     * @param img
     * @param comment
     * @param clima
     */
    public Report(Date dateTimeReport, Coordinate latLng, String img, String comment, String clima, User u,Zone z) {
        this.dateTimeReport = dateTimeReport;
        this.coordinate = latLng;
        this.img = img;
        this.comment = comment;
        this.weather = clima;
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
    public Coordinate getCoordenate() {
        return coordinate;
    }

    /**
     * @param latLng the Coordenate to set
     */
    public void setCoordenate(Coordinate latLng) {
        this.coordinate = latLng;
    }

    /**
     * @return the image
     */
    public String getImg() {
        return img;
    }

    /**
     * @param img the image to set
     */
    public void setImg(String img) {
        this.img = img;
    }

    /**
     * @return the coment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param coment the coment to set
     */
    public void setComment(String coment) {
        this.comment = coment;
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
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", dateTimeReport=" + dateTimeReport +
                ", latLng=" + coordinate +
                ", img=" + img +
                ", coment='" + comment + '\'' +
                ", weather='" + weather + '\'' +
                ", reportedUser=" + reportedUser +
                '}';
    }
}
