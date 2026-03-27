/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.editorial.persona;

import core.editorial.libro.Libro;
import java.util.ArrayList;

/**
 *
 * @author adria
 */
public class Autor extends Persona{
    
    private ArrayList<Libro> libros;

    public Autor(ArrayList<Libro> libros, String nombre, int cedula) {
        super(nombre, cedula);
        this.libros = new ArrayList<>();
    }
    
    
}
