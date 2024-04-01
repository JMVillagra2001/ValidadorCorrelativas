package models;

public class Alumno {

    // region Atributtes
    private Materia[] materiasAprobadas;



    // endregion Getters & Setters

    // region Getters & Setters
    public Materia[] getMateriasAprobadas() {
        return materiasAprobadas;
    }
    public void setMateriasAprobadas(Materia[] materiasAprobadas) {
        this.materiasAprobadas = materiasAprobadas;
    }

    // endregion

    // region Methods
    public boolean PuedeCursar(Materia materia) {
        Materia[] materiasCorrelativas = materia.getMateriasCorrelativas();

        if (materiasCorrelativas == null || materiasCorrelativas.length == 0) {
            return true;
        }

        for (Materia materiaCorrelativa : materiasCorrelativas) {
            boolean tieneCorrelativa = false;
            for (Materia materiaAprobada : materiasAprobadas) {
                if (materiaAprobada.getNombre().equals(materiaCorrelativa.getNombre())) {
                    tieneCorrelativa = true;
                    break;
                }
            }

            if (!tieneCorrelativa) {
                return false;
            }
        }
        return true;
    }
    // endregion

}
