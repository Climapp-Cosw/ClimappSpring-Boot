package eci.cosw.climapp.restController;

import eci.cosw.climapp.models.Publication;
import eci.cosw.climapp.models.Report;
import eci.cosw.climapp.services.PublicationService;
import eci.cosw.climapp.services.ReportService;
import eci.cosw.climapp.services.ServicesException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "publications" )
public class PublicationController {

    @Autowired
    private PublicationService publicationService;

    @Autowired
    private ReportService reportService;


    @RequestMapping( value = "/findpublication/{lat}&{lon}", method = RequestMethod.POST )
    public void findPublication(@RequestBody Report report ,@PathVariable("lat")String lat,@PathVariable("lon")String lon) throws ServicesException {
        report.getCoordinate().setLongitude(Double.valueOf(lon));
        report.getCoordinate().setLatitude(Double.valueOf(lat));
        List<Report> reports = publicationService.findNewPublication(report);
        if(reports.size()>=3){
            Publication p=new Publication();
            p.setReports(reports);
            publicationService.createPublication(p);
            for (int i=0;i<reportService.getReports().size();i++){
                reportService.deleteReport(reports.get(i).getId());
            }
            System.out.println("publicacion realizadaaaa");


            //publica a la zona configurada del stomp//

            //publica a la zona configurada del stomp//
        }else{
            System.out.print("sflbsgdfgbvdfgb vdfbdfdfdfdfdfdfdfdfdfdfdfdfubfbfbfbf "+reports.size());
            if(publicationService.findPublication(report)!=null){
                reportService.deleteReport(report.getId());
                System.out.println("publicacion ya encontrada");
                //publica a la zona configurada del stomp//

                //publica a la zona configurada del stomp//
            };

        }
    }

    @RequestMapping( value = "/", method = RequestMethod.GET )
    public List<Publication> getPublications(){
        return publicationService.getPublications();
    }

}
