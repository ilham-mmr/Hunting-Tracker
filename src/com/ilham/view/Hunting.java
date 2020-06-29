/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilham.view;

import java.io.Serializable;

/**
 *
 * @author Ilham MMR <ilham.mmr@gmail.com>
 */
public class Hunting implements Serializable {
    private String animal;
    private String typeOfAnimal;
    private String place;
    private String weapon;
    private String date;

    public Hunting(String animal, String reproduce, String place, String weapon, String date) {
        this.animal = animal;
        this.typeOfAnimal = reproduce;
        this.place = place;
        this.weapon = weapon;
        this.date = date;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getTypeOfAnimal() {
        return typeOfAnimal;
    }

    public void setTypeOfAnimal(String typeOfAnimal) {
        this.typeOfAnimal = typeOfAnimal;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
