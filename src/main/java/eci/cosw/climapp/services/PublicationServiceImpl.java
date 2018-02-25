package eci.cosw.climapp.services;

import eci.cosw.climapp.models.Publication;
import eci.cosw.climapp.models.Report;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PublicationServiceImpl implements PublicationService {

    private List<Publication> publications= new ArrayList<>();

    @Autowired
    private ReportService reportsService;

    public PublicationServiceImpl(){

    }

    @Override
    public List<Publication> getPublications() {
        return publications;
    }

    @Override
    public Publication createPublication(Publication p) {
        publications.add(p);
        p.setId(publications.size());
        return p;
    }

    @Override
    public List<Report> findNewPublication(Report rep) throws ServicesException{
        List<Report> reportPublications=new ArrayList<Report>();
        reportPublications.add(rep);
        for (int i=0;i<reportsService.getReports().size();i++){
            Report repPublication= reportsService.getReports().get(i);
            System.out.println(rep.toString());
            if(rep.getCoordinate().distCoordenate(repPublication.getCoordinate())<=0.7 && rep.getWeather().equals(repPublication.getWeather())){
                reportPublications.add(repPublication);
            };
        }


        return reportPublications;
    }
    @Override
    public Publication findPublication(Report rep) throws ServicesException{
        for (int i=0;i<publications.size();i++){
            List<Report> reportPublications=publications.get(i).getReports();
            for (int j=0;j<reportPublications.size();j++){
                Report repPublication= reportPublications.get(j);
                if(rep.getCoordinate().distCoordenate(repPublication.getCoordinate())<=0.7 && rep.getWeather().equals(repPublication.getWeather())){
                    reportPublications.add(rep);
                    return publications.get(i);

                };
            }
        }

        return null;
    }
}
