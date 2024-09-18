/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author Alumno-PB203
 */
public class Moto extends Vehiculo {
    
        public Moto(String caballoFuerza,int ruedas,String modelo,String color,String marca,int capacidad,int añoFabrica){
        
        super(caballoFuerza,ruedas,modelo,color, marca,capacidad,añoFabrica);
            
        }

         public void frenar(){
         System.out.println("La Moto frena");}
         
         public void prender_luces (){
         System.out.println(" La moto prende sus luces");
         }
         public void alarmar_seguridad (){
         System.out.println(" Activa alarma de seguridad ");
         }
         
         public void bocina (){
         System.out.println(" La moto toca vocina");
         }
        
}
      
