package models;

public class Inscripcion {

    // region Atributtes
    private Alumno alumno;
    private Materia[] materiasInscriptas;
    // endregion

    // region Getters & Setters
    public Materia[] getMateriasInscriptas() {
        return materiasInscriptas;
    }

    public void setMateriasInscriptas(Materia[] materiasInscriptas) {
        this.materiasInscriptas = materiasInscriptas;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
    // endregion

    // region Methods
    public boolean aprobada() {
        for(int i = 0; i < materiasInscriptas.length; i++) {
            if(!alumno.PuedeCursar(materiasInscriptas[i])) {
                return false;
            }
        }
        return true;
    }
    // endregion

}
