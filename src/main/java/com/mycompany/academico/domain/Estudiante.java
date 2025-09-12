/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.academico.domain;

import java.util.ArrayList; 
import java.util.List;  
import java.util.UUID; // Para generar IDs únicos
 

/**
 *
 * @author Coder
 */
public class Estudiante {
    
    private final String id; 
    private String nombre;
    private int edad;
    private List<Nota> notas = new ArrayList<>();
    
    
    public Estudiante(String nombre, int edad, double nota1, double nota2, double nota3) {
        this.id = UUID.randomUUID().toString();
        this.nombre = nombre;
        this.edad = edad;
        this.notas = new ArrayList<>();
        this.notas.add(new Nota(nota1));
        this.notas.add(new Nota(nota2));
        this.notas.add(new Nota(nota3));
}
    
    // getters
    public String getId(){return id;}
    public String getNombre() { return nombre; }
    public int getEdad() { return edad; }
    public List<Nota> getNotas() { return new ArrayList<>(notas); } 
    
    
    // Métodos para acceder a notas individuales (simplificado para la tabla)
    public double getNota1() { return notas.get(0).getValor(); }
    public double getNota2() { return notas.get(1).getValor(); }
    public double getNota3() { return notas.get(2).getValor(); }
    
    // Calcula el promedio de las tres notas
    public double calcularPromedio() {
        return (getNota1() + getNota2() + getNota3()) / 3.0;
    }
    
    // Devuelve la nota más alta
    public Nota notaMaxima() {
        Nota maxNota = notas.get(0);
        if (notas.get(1).getValor() > maxNota.getValor()) {
            maxNota = notas.get(1);
        }
        if (notas.get(2).getValor() > maxNota.getValor()) {
            maxNota = notas.get(2);
        }
        return maxNota;
    }
    
    // Indica si el estudiante está aprobado (promedio >= 3.0)
    public boolean estaAprobado() {
        return calcularPromedio() >= 3.0;
    }
    
}
