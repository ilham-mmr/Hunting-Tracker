/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilham.view;

import java.util.EventObject;

/**
 *
 * @author Ilham MMR <ilham.mmr@gmail.com>
 */
public class UpdateInfo extends EventObject{
     private String animal;
    private String typeOfAnimal;
    private String place;
    private String weapon;
    private String date;

    public UpdateInfo(String animal, String typeOfAnimal, String place, String weapon, String date, Object source) {
        super(source);
        this.animal = animal;
        this.typeOfAnimal = typeOfAnimal;
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

}
