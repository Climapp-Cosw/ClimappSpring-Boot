package eci.cosw.climapp.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Date;

@Entity(name="Report")
@Table(name="Report")
public class Report  implements java.io.Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="datereport",nullable = false, length = 255)
    private Date dateTimeReport;

    @OneToOne
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name = "Coordinate_id")
    private Coordinate coordinate;

    @Column(name="img",nullable = false, length = 255)
    private String img;

    @Column(name="comment", length = 255)
    private String comment;

    @Column(name="weather",nullable = false, length = 255)
    private String weather;


    @ManyToOne
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name="User_id")
    private User reportedUser;

    @ManyToOne
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name="Zone_id")
    private Zone zone;


    @ManyToOne
    @Fetch(FetchMode.JOIN)
    @JoinColumn(name="Publication_id")
    private Publication publication;

    /**
     *
     * @param id
     * @param dateTimeReport
     * @param latLng
     * @param img
     * @param comment
     * @param clima
     * @param u
     * @param z
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
     *
     * @param dateTimeReport
     * @param latLng
     * @param img
     * @param comment
     * @param clima
     * @param u
     * @param z
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
    public Coordinate getCoordinate() {
        return coordinate;
    }

    /**
     * @param latLng the Coordenate to set
     */
    public void setCoordinate(Coordinate latLng) {
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


    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
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
