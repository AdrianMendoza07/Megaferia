/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import core.editorial.Editorial;
import core.stand.Stand;
import java.util.ArrayList;

/**
 *
 * @author adria
 */
public class Megaferia {
    
    private ArrayList<Stand> stands;
    private ArrayList<Editorial> editoriales;

    public Megaferia() {
        this.stands = new ArrayList<>();
        this.editoriales = new ArrayList<>();
    }
    
    public void createStand(int id, float precio){
        this.stands.add(new Stand(id, precio));
    }
    
    public void addStand(Stand stand){
        this.stands.add(stand);
    }
    
    public void addEditorial(Editorial editorial){
        this.editoriales.add(editorial);
    }
    
    
}
