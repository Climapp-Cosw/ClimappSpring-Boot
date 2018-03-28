package eci.cosw.climapp.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name= "Publication")
public class Publication implements java.io.Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @JsonIgnore
    @OneToMany(mappedBy = "publication")
    @Fetch(FetchMode.JOIN)
    private List<Report> reports=new ArrayList<Report>();

    public Publication(int id, List<Report> reports) {
        this.id = id;
        this.reports = reports;
    }

    public Publication(List<Report> reports) {
        this.id = id;
        this.reports = reports;
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

    @Override
    public String toString() {
        return "Report{" +
                "id=" + id +
                ", reports=" + reports +
                '}';
    }
}
