/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eci.cosw.climapp.models;

/**
 *
 * @author JuanArevaloMerchan
 */
public class Zone {
    
    private int id;
    private int number;
    private String name;
    private Coordinate coordinate1;
    private Coordinate coordinate2;
    private Coordinate coordinate3;
    private Coordinate coordinate4;
    
    
    /**
     * Constructor
     */
    public Zone(){
        
    }
    
    /**
     * Constructor
     * @param id
     * @param number
     * @param name 
     * @param coordenate1 
     * @param coordenate2 
     * @param coordenate3 
     * @param coordenate4 
     */
    public Zone(int id, int number, String name, Coordinate coordenate1, Coordinate coordenate2, Coordinate coordenate3, Coordinate coordenate4){
        this.id = id;
        this.number = number;
        this.name = name;
        this.coordinate1 = coordenate1;
        this.coordinate2 = coordenate2;
        this.coordinate3 = coordenate3;
        this.coordinate4 = coordenate4;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the coordenate1
     */
    public Coordinate getCoordenate1() {
        return coordinate1;
    }

    /**
     * @param coordenate1 the coordenate1 to set
     */
    public void setCoordenate1(Coordinate coordenate1) {
        this.coordinate1 = coordenate1;
    }

    /**
     * @return the coordenate2
     */
    public Coordinate getCoordenate2() {
        return coordinate2;
    }

    /**
     * @param coordenate2 the coordenate2 to set
     */
    public void setCoordenate2(Coordinate coordenate2) {
        this.coordinate2 = coordenate2;
    }

    /**
     * @return the coordenate3
     */
    public Coordinate getCoordenate3() {
        return coordinate3;
    }

    /**
     * @param coordenate3 the coordenate3 to set
     */
    public void setCoordenate3(Coordinate coordenate3) {
        this.coordinate3 = coordenate3;
    }

    /**
     * @return the coordenate4
     */
    public Coordinate getCoordenate4() {
        return coordinate4;
    }

    /**
     * @param coordenate4 the coordenate4 to set
     */
    public void setCoordenate4(Coordinate coordenate4) {
        this.coordinate4 = coordenate4;
    }
    
    
}
