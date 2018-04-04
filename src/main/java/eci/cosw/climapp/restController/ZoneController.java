/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eci.cosw.climapp.restController;

import eci.cosw.climapp.models.Zone;
import eci.cosw.climapp.services.ZoneService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author JuanArevaloMerchan
 */
@RestController
@RequestMapping( "zones" )
public class ZoneController {
    @Autowired
    private ZoneService zoneServices;
    
    @RequestMapping( value = "/", method = RequestMethod.GET )
    public List<Zone> getZones(){
        return zoneServices.getZones();
    }

    @RequestMapping( value = "/favorites/{email}", method = RequestMethod.GET )
    public List<Zone> getFavoriteZones(@PathVariable("email") String email){
        return zoneServices.getFavoriteZones(email);
    }
}
