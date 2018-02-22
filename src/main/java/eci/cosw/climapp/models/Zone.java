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
    private Coordenate coordenate1;
    private Coordenate coordenate2;
    private Coordenate coordenate3;
    private Coordenate coordenate4;
    
    
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
    public Zone(int id, int number, String name, Coordenate coordenate1, Coordenate coordenate2, Coordenate coordenate3, Coordenate coordenate4){
        this.id = id;
        this.number = number;
        this.name = name;
        this.coordenate1 = coordenate1;
        this.coordenate2 = coordenate2;
        this.coordenate3 = coordenate3;
        this.coordenate4 = coordenate4;
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
    public Coordenate getCoordenate1() {
        return coordenate1;
    }

    /**
     * @param coordenate1 the coordenate1 to set
     */
    public void setCoordenate1(Coordenate coordenate1) {
        this.coordenate1 = coordenate1;
    }

    /**
     * @return the coordenate2
     */
    public Coordenate getCoordenate2() {
        return coordenate2;
    }

    /**
     * @param coordenate2 the coordenate2 to set
     */
    public void setCoordenate2(Coordenate coordenate2) {
        this.coordenate2 = coordenate2;
    }

    /**
     * @return the coordenate3
     */
    public Coordenate getCoordenate3() {
        return coordenate3;
    }

    /**
     * @param coordenate3 the coordenate3 to set
     */
    public void setCoordenate3(Coordenate coordenate3) {
        this.coordenate3 = coordenate3;
    }

    /**
     * @return the coordenate4
     */
    public Coordenate getCoordenate4() {
        return coordenate4;
    }

    /**
     * @param coordenate4 the coordenate4 to set
     */
    public void setCoordenate4(Coordenate coordenate4) {
        this.coordenate4 = coordenate4;
    }
    
    
}
