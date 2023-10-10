/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_00;


public class Estudiante_00 extends Persona_00{

    public Estudiante_00(String carrera, int numeroDeOrden, int ciclo, String nombre, int edad) {
        super(nombre, edad);
        this.carrera = carrera;
        this.numeroDeOrden = numeroDeOrden;
        this.ciclo = ciclo;
    }
    
    //atributos
    String carrera;
    int numeroDeOrden;
    int ciclo;
    
    
    
    
    
}
