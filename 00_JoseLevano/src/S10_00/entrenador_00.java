package S10_00;

/**
 *
 * @author joseLevanoArbizu
 */
public class entrenador_00 extends seleccionFutbol_00{

    public entrenador_00(String idFederacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }
    
    

//atributos
    private String idFederacion;

//metodos
    public void dirigirPartido() {
    }

    public void dirigirEntrenamiento() {
        System.out.println(nombre + " es el entrenador");
    }

}
