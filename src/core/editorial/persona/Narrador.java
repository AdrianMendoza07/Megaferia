/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.editorial.persona;

import core.editorial.libro.Audiolibro;
import java.util.ArrayList;

/**
 *
 * @author adria
 */
public class Narrador extends Persona{
    
    private ArrayList<Audiolibro> libros;

    public Narrador(String nombre, int cedula) {
        super(nombre, cedula);
        this.libros = new ArrayList<>();
    }
    
    public void addLibro(Audiolibro libro){
        this.libros.add(libro);
    }
    
}
