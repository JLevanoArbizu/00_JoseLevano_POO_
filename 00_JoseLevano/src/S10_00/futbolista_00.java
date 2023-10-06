package S10_00;

/**
 *
 * @author joseLevanoArbizu
 */
public class futbolista_00 extends seleccionFutbol_00 {

//Metodo Constructor
    public futbolista_00(int dorsal, String demarcacion, int id, String nombre, String apellidos, int edad) {
        super(id, nombre, apellidos, edad);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

//atributos
    private int dorsal;
    private String demarcacion;

//metodos
    public void jugarPartido() {
        System.out.println(getNombre()+" esta jugando Partido");
    }

    public void entrenar() {
        System.out.println(getNombre()+" esta entrenando");
    }
    
// GET and SET

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    
    

}
