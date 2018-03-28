package eci.cosw.climapp.services;

import eci.cosw.climapp.models.*;
import eci.cosw.climapp.repositories.PublicationRepository;
import eci.cosw.climapp.repositories.ReportsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class PublicationServiceImpl implements PublicationService {


    @Autowired
    private ReportsRepository reportsRepository;

    @Autowired
    private PublicationRepository publicationsRepository;

    public PublicationServiceImpl(){
    }


    @Override
    public List<Publication> getPublications() {
        return publicationsRepository.findAll();
    }

    @Override
    public Publication createPublication(Publication p) {
        publicationsRepository.save(p);
        int idp=publicationsRepository.PublicationIdLast();
        p.setId(idp);
        List<Report> reportsUpdate=p.getReports();
        for (int i=0;i<reportsUpdate.size();i++){
            reportsUpdate.get(i).setPublication(p);
        }
        reportsRepository.saveAll(reportsUpdate);
        return p;
    }

    @Override
    public List<Report> findNewPublication(Report rep) throws ServicesException{
        List<Report> reportPublications=new ArrayList<Report>();
        List<Report> reports=reportsRepository.findPublicationNull();
        for (int i=0;i<reports.size();i++){
            Report repPublication= reports.get(i);
            if(rep.getCoordinate().distCoordenate(repPublication.getCoordinate())<=0.7 && rep.getWeather().equals(repPublication.getWeather())){
                reportPublications.add(repPublication);
            };
        }

        return reportPublications;
    }
    @Override
    public Publication findPublication(Report rep) throws ServicesException{
        List<Publication>  pub= publicationsRepository.findAll();
        for (int i=0;i<pub.size();i++){
            List<Report> reportPublications=pub.get(i).getReports();
            for (int j=0;j<reportPublications.size();j++){
                Report repPublication= reportPublications.get(j);
                if(rep.getCoordinate().distCoordenate(repPublication.getCoordinate())<=0.7 && rep.getWeather().equals(repPublication.getWeather())){
                    reportPublications.add(rep);
                    return pub.get(i);

                };
            }
        }

        return null;
    }
}