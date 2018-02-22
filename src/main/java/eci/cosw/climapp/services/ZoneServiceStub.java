/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eci.cosw.climapp.services;

import eci.cosw.climapp.models.Coordenate;
import eci.cosw.climapp.models.Zone;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author JuanArevaloMerchan
 */
@Service
public class ZoneServiceStub implements ZoneService{
    private List<Zone> zones = new ArrayList<>();
    
    
    public ZoneServiceStub(){
        Zone usaquen = new Zone(1, 1, "Usaquén", new Coordenate(4.825441, -74.034615), new Coordenate(4.820387, -73.999563), new Coordenate(4.687183, -74.057352), new Coordenate(4.664781, -74.005831));
        Zone chapinero = new Zone(2, 2, "Chapinero", new Coordenate(4.687329, -74.057877), new Coordenate(4.668703, -74.008068), new Coordenate(4.624892, -74.068806), new Coordenate(4.606264, -73.994837));
        Zone santafe = new Zone(3, 3, "Santa fé", new Coordenate(4.628073, -74.068676), new Coordenate(4.616590, -73.989504), new Coordenate(4.591974, -74.089303), new Coordenate(4.554477, -74.006155));
        Zone sanCristobal = new Zone(4, 4, "San Cristobal", new Coordenate(4.590559, -74.084904), new Coordenate(4.565920, -74.023098), new Coordenate(4.563354, -74.106869), new Coordenate(4.507054, -74.043526));
        Zone usme = new Zone(5, 5, "Usme", new Coordenate(4.545445, -74.121013), new Coordenate(4.542654, -74.068146), new Coordenate(4.468726, -74.134922), new Coordenate(4.469068, -74.072094));
        Zone tunjuelito = new Zone(6, 6, "Tunjuelito", new Coordenate(4.598327, -74.128563), new Coordenate(4.552580, -74.118281), new Coordenate(4.595872, -74.154159), new Coordenate(4.562045, -74.123946));                  
        Zone bosa = new Zone(7, 7, "Bosa", new Coordenate(4.655754, -74.194826), new Coordenate(4.600830, -74.151567), new Coordenate(4.628036, -74.224009), new Coordenate(4.599462, -74.203924));                  
        Zone kenedy = new Zone(8, 8, "Kennedy", new Coordenate(4.666901, -74.153595), new Coordenate(4.637473, -74.117203), new Coordenate(4.645344, -74.193249), new Coordenate(4.593670, -74.146729));                  
        Zone fontibon = new Zone(9, 9, "Fontibón", new Coordenate(4.719440, -74.156195), new Coordenate(4.688816, -74.117883), new Coordenate(4.677011, -74.176934), new Coordenate(4.637660, -74.118398));        
        Zone engativa = new Zone(10, 10, "Engativa", new Coordenate(4.740607, -74.124155), new Coordenate(4.686717, -74.075918), new Coordenate(4.722131, -74.161062), new Coordenate(4.654038, -74.103384));        
        Zone suba = new Zone(11, 11, "Suba", new Coordenate(4.836357, -74.084712), new Coordenate(4.828147, -74.033557), new Coordenate(4.741931, -74.134494), new Coordenate(4.686501, -74.057247));         
        Zone barriosUnidos = new Zone(12, 12, "Barrios Unidos", new Coordenate(4.689006, -74.073498), new Coordenate(4.686782, -74.057018), new Coordenate(4.666251, -74.093926), new Coordenate(4.649751, -74.064686));             
        Zone teusaquillo = new Zone(13, 13, "Teusaquillo", new Coordenate(4.666207, -74.093985), new Coordenate(4.649699, -74.064634), new Coordenate(4.644992, -74.110666), new Coordenate(4.615477, -74.072815));             
        Zone martires = new Zone(14, 14, "Los Mártires", new Coordenate(4.625038, -74.082900), new Coordenate(4.615692, -74.072969), new Coordenate(4.598667, -74.107473), new Coordenate(4.592079, -74.089191));               
        Zone antonio = new Zone(15, 15, "Antonio Nariño", new Coordenate(4.598858, -74.107042), new Coordenate(4.589447, -74.084812), new Coordenate(4.593553, -74.131246), new Coordenate(4.576014, -74.094425));                
        Zone puente = new Zone(16, 16, "Puente Aranda", new Coordenate(4.645393, -74.110712), new Coordenate(4.624604, -74.082988), new Coordenate(4.596279, -74.139269), new Coordenate(4.594409, -74.112284));               
        Zone candelaria = new Zone(17, 17, "La candelaria", new Coordenate(4.602323, -74.076746), new Coordenate(4.602131, -74.059790), new Coordenate(4.593533, -74.082364), new Coordenate(4.589469, -74.070605));              
        Zone rafaelUribe = new Zone(18, 18, "Rafael Uribe", new Coordenate(4.594636, -74.115737), new Coordenate(4.575985, -74.093936), new Coordenate(4.585568, -74.137538), new Coordenate(4.541590, -74.117625));              
        Zone ciudadBolivar = new Zone(19, 19, "Ciudad Bolivar", new Coordenate(4.599752, -74.152629), new Coordenate(4.490671, -74.119273), new Coordenate(4.587184, -74.198924), new Coordenate(4.469108, -74.179355));            

        zones.add(usaquen);
        zones.add(chapinero);
        zones.add(candelaria);
        zones.add(santafe);
        zones.add(sanCristobal);
        zones.add(usme);
        zones.add(tunjuelito);
        zones.add(bosa);
        zones.add(kenedy);
        zones.add(fontibon);
        zones.add(engativa);
        zones.add(suba);
        zones.add(barriosUnidos);
        zones.add(teusaquillo);
        zones.add(martires);
        zones.add(antonio);
        zones.add(puente);
        zones.add(rafaelUribe);
        zones.add(ciudadBolivar);
    }

    @Override
    public List<Zone> getZones() {
        return zones;
    }
    
}
