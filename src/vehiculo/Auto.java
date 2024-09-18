/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author Alumno-PB203
 */
public class Auto extends Vehiculo {
    
    //agregar un atributo 
    private int numero_puertas;
    
    
    public Auto(String caballoFuerza, int ruedas, String modelo, String color, String marca, int capacidad, int añoFabrica, int numero_puertas) {
        super(caballoFuerza, ruedas, modelo, color, marca, capacidad, añoFabrica );
        this.numero_puertas = numero_puertas;
    }
    
    @Override  
    public void informacion(){
       super.informacion();
        System.out.println("numero de puertas "+numero_puertas);
    
    }
    
}
