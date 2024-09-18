/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

import java.util.Date;

/**
 *
 * @author Alumno-PB203
 */
public class Vehiculo {
    
    //caracteristicas = atributos
    private String hp ;
    private int ruedas ;
    private String modelo ;
    private String color ;
    private String marca ;
    private int capacidad;
    private int añoFabrica; 
    private boolean encendido; 
    
    //constructor - Inicializar
    public Vehiculo(){
    
    
        this.hp = "100";
        this.ruedas = 4;
        this.modelo = "Huaracna";
        this.color = "Rojo";
        this.marca = "Honda";
        this.capacidad =2;
        this.añoFabrica = 2024;
    }
    
    public void transportar(){ 
        System.out.println("El vehiculo esta en transporte");
    
    }
    
    public void encender(){
        System.out.println("El vehiculo encendido");
        this.encendido = true;
    
    }
}
