package eci.cosw.climapp.models;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "Publication")
public class Publication implements java.io.Serializable {

    @Id
    @GeneratedValue
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="Report_id")
    @Fetch(FetchMode.JOIN)
    private List<Report> reports=new ArrayList<Report>();

    private Zone zones;

    public Publication(int id, List<Report> reports,Zone z) {
        this.id = id;
        this.reports = reports;
        this.zones=z;
    }

    public Publication(List<Report> reports,Zone z) {
        this.id = id;
        this.reports = reports;
        this.zones=z;
    }

    public Publication() {
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Report> getReports() {
        return reports;
    }

    public void setReports(List<Report> reports) {
        this.reports = reports;
    }

    public Zone getZones() {
        return zones;
    }

    public void setZones(Zone zones) {
        this.zones = zones;
    }
}
