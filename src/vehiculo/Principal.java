/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculo;

/**
 *
 * @author Alumno-PB203
 */
public class Principal {
         public static void main (String[] args){
         //instanciar = invocar = llamar un objeto
        Moto moto = new Moto("1700",2,"Honda","negro"," r-200",2,2024);
        //moto.encender();
        //moto.transportar();
        //moto.frenar();
        
        //moto.prender_luces();
        //moto.alarmar_seguridad();
        //moto.bocina();
        
        moto.informacion();
        
        
        Moto moto1 = new Moto("1700",2,"pulsar","rojo"," kn2",2,2025);
        //moto1.encender();
        //moto1.transportar();
        //moto1.frenar();
        
        //moto1.prender_luces();
        //moto1.alarmar_seguridad();
        //moto1.bocina();
        
        moto1.informacion();
        
        Auto auto = new Auto ("2000",4,"Toyota","negro","Yaris ",6,2024,4 );
        auto.informacion();
     }
        
}
