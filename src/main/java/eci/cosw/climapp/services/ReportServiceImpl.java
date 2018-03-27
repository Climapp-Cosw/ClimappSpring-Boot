package eci.cosw.climapp.services;

import eci.cosw.climapp.models.Coordinate;
import eci.cosw.climapp.models.Report;
import eci.cosw.climapp.models.User;
import eci.cosw.climapp.models.Zone;
import eci.cosw.climapp.repositories.ReportsRepository;
import eci.cosw.climapp.repositories.ZonesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by laura on 11/02/2018.
 */
@Service
public class ReportServiceImpl implements ReportService{

    @Autowired
    private ReportsRepository reportsRepository;

    @Autowired
    private ZonesRepository zonesRepository;



    @Override
    public Report createReport(Report rep) throws ServicesException{
        List<Zone> zones= zonesRepository.findAll();
        int sizezone= (int) zonesRepository.count();
        for(int i=0;i<sizezone;i++){
            if(this.containsZone(rep.getCoordinate().getLongitude(),rep.getCoordinate().getLatitude(),
                    zones.get(i).getCoordinates().size(),zones.get(i).getCoordinates())){
                rep.setZone(zones.get(i));
            }
        }
        List<Report> reports= reportsRepository.findAll();
        int sizereport= (int) reportsRepository.count();
        for(int i=0; i<sizereport;i++){
            Report p=reports.get(i);
            if (rep.getReportedUser().getId()==p.getReportedUser().getId() && p.getCoordinate().distCoordenate(rep.getCoordinate())<=0.7) {
                if(p.getWeather().equals(rep.getWeather())){
                    throw new ServicesException("You have already published a report in the same zone with the same weather");
                }else if(!p.getWeather().equals(rep.getWeather()) && p.getDateTimeReport().compareTo(rep.getDateTimeReport())<8 ){
                    throw new ServicesException("You have recently published a report in the same zone with different weather conditions");
                }
            }
        }

        reportsRepository.saveAndFlush(rep);
        return rep;
    }

    private boolean containsZone(Double x,Double y, int size, List<Coordinate> coord){
        boolean resp=false;
        int j,i;
        for(i=0,j=size-1;i<size;j=i++){
            if(((coord.get(i).getLatitude()) > y != (coord.get(j).getLatitude()>y)) &&
                    (x<(coord.get(j).getLongitude()-coord.get(i).getLongitude())*(y-coord.get(i).getLatitude())/
                            (coord.get(j).getLatitude()-coord.get(i).getLatitude())+coord.get(i).getLongitude())){
                resp =!resp;
            }
        }
        return resp;

    }
    @Override
    public void deleteReport(int id) {
        reportsRepository.deleteById(id);
    }

    @Override
    public void updateReport() {

    }

    @Override
    public List<Report> getReports() {
        return reportsRepository.findAll();
    }



}
