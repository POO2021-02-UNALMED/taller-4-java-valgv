package classroom;

public class Grupo {

	Persona[] estudiantes;
    Persona profesor;
    Asignatura asignatura;
    final int codigo; //se quito el =0
    String horario;
    int cantidadEstudiantes; //se creo el int cantidadEstudiantes

    Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo = codigo;
        this.horario = horario;
    }
    Grupo(int cantidadEstudiantes, Persona profesor, Asignatura asignatura, int codigo, String horario) {
        Persona[] personas = new Persona[cantidadEstudiantes];
        this.estudiantes = personas;
        this.profesor = profesor;
        this.asignatura=asignatura;
        this.codigo=codigo;
        //this(personas, profesor, asignatura, codigo, horario);
    	
    }
    Grupo(Persona[] estudiantes, Persona profesor, Asignatura asignatura) {
        this.estudiantes = estudiantes;
        this.profesor = profesor;
        this.asignatura = asignatura;
        this.codigo =0; //se creo el this.codigo=0
        this.horario=""; //se creo el this.horario=""
    }

    void cambiarEstudiante(Persona estudianteViejo, Persona estudianteNuevo) {
        for (int i = 0; i < estudiantes.length; i++) {
            if (estudiantes[i].getCedula() == estudianteViejo.getCedula()) {
                estudiantes[i] = estudianteNuevo;
                break;
            }
        }
    }
   
    void cambiarEstudiante(int indice, Persona estudiante) {
        estudiantes[indice] = estudiante;
    }
}
