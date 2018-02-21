package eci.cosw.climapp.services;

import eci.cosw.climapp.models.Report;

import java.util.List;

public interface ReportService {
    /**
     * @param rep
     */
    public void createReport(Report rep);

    /**
     * @param id
     */
    public void deleteReport(Long id);

    /**
     */
    public void updateReport();

    /**
     * @return
     */
    public List<Report> getReports();



}
