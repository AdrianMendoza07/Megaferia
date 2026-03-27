/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.editorial.libro;

import core.editorial.Editorial;
import core.editorial.persona.Autor;
import core.editorial.persona.Narrador;
import java.util.ArrayList;

/**
 *
 * @author adria
 */
public class Audiolibro extends Libro{
    
    private int duracion;
    private Narrador narrador;

    public Audiolibro(int duracion, Narrador narrador, String titulo, String isbn, String genero, String formato, float precio, Editorial editorial) {
        super(titulo, isbn, genero, formato, precio, editorial);
        this.duracion = duracion;
        this.narrador = narrador;
    }

    
    
    
}
