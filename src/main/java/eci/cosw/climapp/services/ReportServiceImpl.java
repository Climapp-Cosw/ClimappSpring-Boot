package eci.cosw.climapp.services;

import eci.cosw.climapp.models.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by laura on 11/02/2018.
 */
@Service
public class ReportServiceImpl implements ReportService{

    private List<Report>reports=new ArrayList<>();

    @Autowired
    public ReportServiceImpl() throws ServicesException{
        reports.add(new Report());
        reports.add(new Report());
    }

    @Override
    public Report createReport(Report rep) throws ServicesException{
        for(int i=0; i<reports.size();i++){
            Report p=reports.get(i);
            if (rep.getReportedUser().getId()==p.getReportedUser().getId() && p.getCoordenate().distCoordenate(rep.getCoordenate())<=0.7) {
                if(p.getWeather().equals(rep.getWeather())){
                    throw new ServicesException("Ya has publicado un reporte en la misma zona y con el mismo clima.");
                }else if(!p.getWeather().equals(rep.getWeather()) && p.getDateTimeReport().compareTo(rep.getDateTimeReport())<8 ){
                    throw new ServicesException("Ya has publicado un reporte recientemente en la misma zona y con diferente clima.");
                }
            }
            else{
                reports.add(rep);
                rep.getReportedUser().getReports().add(rep);
                rep.setId(reports.size());
            }
        }
        return rep;
    }

    @Override
    public void deleteReport(int id) {
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
