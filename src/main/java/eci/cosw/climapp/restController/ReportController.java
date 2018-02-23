package eci.cosw.climapp.restController;


import eci.cosw.climapp.models.Report;
import eci.cosw.climapp.services.ReportService;
import eci.cosw.climapp.services.ServicesException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( "reports" )
public class ReportController {

    @Autowired
    private ReportService reportService;

    @RequestMapping( value = "/newreport", method = RequestMethod.POST )
    public Report createReport(@RequestBody Report report) throws ServicesException {
        return reportService.createReport(report);
    }

    @RequestMapping( value = "/", method = RequestMethod.GET )
    public List<Report> getReports() {
        return reportService.getReports();
    }

}
