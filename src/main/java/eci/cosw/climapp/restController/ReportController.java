package eci.cosw.climapp.restController;


import eci.cosw.climapp.models.Report;
import eci.cosw.climapp.services.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping( "reports" )
public class ReportController {

    @Autowired
    private ReportService reportService;

    @RequestMapping( value = "/newreport", method = RequestMethod.POST )
    public void createReport(@RequestBody Report report) {

        reportService.createReport(report);
    }

    @RequestMapping( value = "/reports", method = RequestMethod.GET )
    public List<Report> getReports() {

        return reportService.getReports();
    }
}
