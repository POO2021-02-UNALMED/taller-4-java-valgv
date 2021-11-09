package classroom;

public class Persona {

	long cedula; // se cambió el final por static, luego se quitó el static
    String nombre;
    static int totalPersonas;
    
    static {
        totalPersonas = 0;
        //cedula = 3; 
    }
    Persona(){ //se creo el constructor Persona()
    	this.nombre = "";
    	this.cedula = 0;
    }
    Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    Persona(String nombre) {
        this.nombre = nombre; //se cambió "" por nombre
        this.cedula = 1; //se creo el this.cedula=1
        totalPersonas++;
    }
    long getCedula() {
        return cedula;
    }

    String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
