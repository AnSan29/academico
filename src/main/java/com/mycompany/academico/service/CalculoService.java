/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.academico.service;
import com.mycompany.academico.domain.Nota;
import java.util.List;


/**
 *
 * @author Coder
 */
public class CalculoService {
    
     // Calcula el promedio de notas
    public double promedio(List<Nota> notas) {
        double suma = 0.0;
        for (Nota nota : notas) {
            suma += nota.getValor();
        }
        return notas.isEmpty() ? 0.0 : suma / notas.size();
    }
    
    
    // Encuentra la nota máxima
    public Nota notaMaxima(List<Nota> notas){
        if(notas.isEmpty()){
            // si esta vacio retorna null
            return null;
        }
        Nota maxNota = notas.get(0); // asumimos que la primera es la mayor
        for (Nota nota : notas) {
            if (nota.getValor() > maxNota.getValor()) {
                maxNota = nota;
            }
        }
        return maxNota;
    }
    
    // Verifica si está aprobado (>= 3.0)
    public boolean aprobado(double promedio) {
        return promedio >= 3.0;
    }
}
