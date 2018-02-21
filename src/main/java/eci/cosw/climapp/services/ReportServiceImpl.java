package eci.cosw.climapp.services;

import eci.cosw.climapp.models.Report;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReportServiceImpl implements ReportService{

    private List<Report>reports=new ArrayList<>();

    @Override
    public void createReport(Report rep) {
        reports.add(rep);
        rep.setId(new Long(reports.size()));
    }

    @Override
    public void deleteReport(Long id) {
        boolean flag=true;
        for (int i=0;i<reports.size() && flag;i++){
            Report rp=reports.get(i);
            if (id==rp.getId()){
                reports.remove(i);
            }
        }
    }

    @Override
    public void updateReport() {

    }

    @Override
    public List<Report> getReports() {
        return reports;
    }

}
