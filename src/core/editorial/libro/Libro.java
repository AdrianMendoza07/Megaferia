/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.editorial.libro;

import core.editorial.Editorial;
import core.editorial.persona.Autor;
import java.util.ArrayList;

/**
 *
 * @author adria
 */
public class Libro {
    
    protected String titulo;
    protected String isbn;
    protected String genero;
    protected String formato;
    protected float precio;
    protected ArrayList<Autor> autores;
    protected Editorial editorial;

    public Libro(String titulo, String isbn, String genero, String formato, float precio, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.genero = genero;
        this.formato = formato;
        this.precio = precio;
        this.autores = new ArrayList<>();
        this.editorial = editorial;
    }
    
    
    
}
