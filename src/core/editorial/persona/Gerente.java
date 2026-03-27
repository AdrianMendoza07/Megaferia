/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.editorial.persona;

import core.editorial.Editorial;

/**
 *
 * @author adria
 */
public class Gerente extends Persona{
    
    private Editorial editorial;

    public Gerente(String nombre, int cedula) {
        super(nombre, cedula);
    }
    
    public void setEditorial(Editorial editorial){
        this.editorial = editorial;
    }

    
    
}
