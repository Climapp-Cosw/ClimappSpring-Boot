package eci.cosw.climapp.models;

import java.util.ArrayList;
import java.util.List;

public class Publication {
    private Long id;
    private List<Report> reports=new ArrayList<Report>();
    private Zone zones;

    public Publication(Long id, List<Report> reports,Zone z) {
        this.id = id;
        this.reports = reports;
        this.zones=z;
    }
    public Publication() {
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
