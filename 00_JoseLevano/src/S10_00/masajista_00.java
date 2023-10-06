package S10_00;

/**
 *
 * @author joseLevanoArbizu
 */
public class masajista_00 extends seleccionFutbol_00{

    public masajista_00(String titulacion, int aniosExperiencia, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.aniosExperiencia = aniosExperiencia;
    }

//atributos
    private String titulacion;
    private int aniosExperiencia;

   
//metodos

    public void darMasaje() {
        System.out.println(nombre + " da masajes");
    }

}
