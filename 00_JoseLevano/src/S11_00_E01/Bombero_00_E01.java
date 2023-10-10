/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package S11_00_E01;

/**
 *
 * @author developer
 */
public class Bombero_00_E01 extends Persona_00_E01 {

    public Bombero_00_E01(int horasServicio, int escuadron, int edad, String Nombre) {
        super(edad, Nombre);
        this.horasServicio = horasServicio;
        this.escuadron = escuadron;
    }

    //ATRIBUTOS
    int horasServicio;
    int escuadron;

    public void Rescatar() {
    }

    public void ApagarIncendio() {
    }

}
