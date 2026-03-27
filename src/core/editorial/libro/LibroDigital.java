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
public class LibroDigital extends Libro{
    private boolean hasHipervinculo;
    private ArrayList<String> hiperVinculos;

    public LibroDigital(boolean hasHipervinculo, ArrayList<String> hiperVinculos, String titulo, String isbn, String genero, String formato, float precio, Editorial editorial) {
        super(titulo, isbn, genero, formato, precio, editorial);
        this.hasHipervinculo = hasHipervinculo;
        this.hiperVinculos = hiperVinculos;
    }

    

    
    
}
