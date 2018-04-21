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
@RequestMapping( "sensores" )
public class SensoresController {

    @RequestMapping( value = "/DHT/{h}&{t}", method = RequestMethod.POST )
    public void deleteFavoriteZone(@PathVariable("h") float h, @PathVariable("t") float t) throws ServletException, ServicesException {
        System.out.println("hiosfbsiodfbidobf"+ h+"sdhiofidhf"+t);
		
    }
}
