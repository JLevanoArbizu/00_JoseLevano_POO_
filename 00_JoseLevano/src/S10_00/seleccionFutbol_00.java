package S10_00;

/**
 *
 * @author joseLevanoArbizu
 */
public class seleccionFutbol_00 {

//CLASE PADRE
//Metodo constructor

    public seleccionFutbol_00(int id, String nombre, String apellidos, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    
    
//atributos
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;
    
//metodos
    public void concentrarse() {
        System.out.println(getNombre() + " se esta concentrando ");
    }

    public void viajar() {
        System.out.println("El viaje comenzo " + getNombre());
    }
//GET and SET
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
