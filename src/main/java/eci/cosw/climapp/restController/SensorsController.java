/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eci.cosw.climapp.restController;

import eci.cosw.climapp.services.ServicesException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.ServletException;

/**
 *
 * @author LauraRamosB
 */
@RestController
@RequestMapping( "sensors" )
public class SensorsController {

    @RequestMapping( value = "/DHT/{h}&{t}", method = RequestMethod.POST )
    public void SensorDHT(@PathVariable("h") float h, @PathVariable("t") float t) throws ServletException, ServicesException {
        System.out.println("hum: "+ h+" temp: "+t);
		
    }
	
	@RequestMapping( value = "/water/{water}", method = RequestMethod.POST )
    public void SensorRain(@PathVariable("water") boolean water) throws ServletException, ServicesException {
        System.out.println("Rain: "+ water);
		
    }
	
	@RequestMapping( value = "/temperature/{tempReached}", method = RequestMethod.POST )
    public void SensorTemp(@PathVariable("tempReached") String temp) throws ServletException, ServicesException {
        System.out.println("Temperature reached: "+ temp);	
		/**no implementado**/
    }
}
