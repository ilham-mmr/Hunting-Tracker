/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ilham.view;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Ilham MMR <ilham.mmr@gmail.com>
 */
public class Controller {
    private List<Hunting> huntingList;

    public Controller() {
        huntingList = new ArrayList<>();
    }
    
    
    
    public void saveToFile(File file) throws IOException {
        FileOutputStream fos = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Hunting[] myAnimal = huntingList.toArray(new Hunting[huntingList.size()]);
         for(Hunting h : huntingList){
             System.out.println(h.toString());
         }
         
        oos.writeObject(myAnimal);

        oos.close();

    }

    public void loadFromFile(File file) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);

        try {
            Hunting[] hunting = (Hunting[]) ois.readObject();
            huntingList.clear();
            huntingList.addAll(Arrays.asList(hunting));
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        ois.close();

    }

    public List<Hunting> getHuntingList() {
        return huntingList;
    }

    public void setHuntingList(List<Hunting> huntingList) {
        this.huntingList = huntingList;
    }
}
