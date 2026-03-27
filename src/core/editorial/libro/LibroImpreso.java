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
public class LibroImpreso extends Libro{
    
    private int paginas;
    private int numEjemplares;

    public LibroImpreso(int paginas, int numEjemplares, String titulo, String isbn, String genero, String formato, float precio, Editorial editorial) {
        super(titulo, isbn, genero, formato, precio, editorial);
        this.paginas = paginas;
        this.numEjemplares = numEjemplares;
    }

    
  
    
    
}
