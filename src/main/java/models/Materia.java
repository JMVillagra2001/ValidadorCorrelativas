package models;

public class Materia {

    // region Attributes
    private String nombre;
    private Materia[] materiasCorrelativas;

    //endregion

    // region Constructors
    public Materia(String nombre, Materia[] materiasCorrelativas) {
        this.nombre = nombre;
        this.materiasCorrelativas = materiasCorrelativas;
    }
    // endregion

    // region Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Materia[] getMateriasCorrelativas() {
        return materiasCorrelativas;
    }

    public void setMateriasCorrelativas(Materia[] materiasCorrelativas) {
        this.materiasCorrelativas = materiasCorrelativas;
    }
    // endregion

}
