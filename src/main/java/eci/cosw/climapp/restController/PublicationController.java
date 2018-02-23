package eci.cosw.climapp.restController;

import eci.cosw.climapp.models.Publication;
import eci.cosw.climapp.models.Report;
import eci.cosw.climapp.services.PublicationService;
import eci.cosw.climapp.services.ServicesException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "publications" )
public class PublicationController {

    @Autowired
    private PublicationService publicationService;


    @RequestMapping( value = "/findpublication", method = RequestMethod.POST )
    public void findPublication(@RequestBody Report report) throws ServicesException {
        List<Report> reports = publicationService.findNewPublication(report);
        if(reports.size()>=3){
            Publication p=new Publication();
            p.setReports(reports);
            publicationService.createPublication(p);
            //publica a la zona configurada del stomp//

            //publica a la zona configurada del stomp//
        }else{
            if(publicationService.findPublication(report)!=null){
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
