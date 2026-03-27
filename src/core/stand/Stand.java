/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.stand;

import core.editorial.Editorial;
import java.util.ArrayList;

/**
 *
 * @author adria
 */
public class Stand {
    
    private int id;
    private float precio;
    private ArrayList<Editorial> editoriales;

    public Stand(int id, float precio) {
        this.id = id;
        this.precio = precio;
        this.editoriales = new ArrayList<>();
    }
    
    public void addEditorial(Editorial editorial){
        this.editoriales.add(editorial);
    } 
    
    
}
