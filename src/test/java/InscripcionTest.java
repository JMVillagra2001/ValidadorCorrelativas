import models.Alumno;
import models.Inscripcion;
import models.Materia;
import org.junit.Test;
import static org.junit.Assert.*;

public class InscripcionTest {
    @Test
    public void testAprobada_AlumnoPuedeCursarTodasLasMateriasInscriptas() {
        Alumno alumno = new Alumno();
        Materia AMI = new Materia("AMI", new Materia[0]);
        Materia AGA = new Materia("AGA", new Materia[0]);

        Materia[] materiasInscriptas = { AMI, AGA };
        alumno.setMateriasAprobadas(new Materia[] { });

        Inscripcion inscripcion = new Inscripcion(alumno, materiasInscriptas);

        assertTrue(inscripcion.aprobada());
    }

    @Test
    public void testAprobada_AlumnoNoPuedeCursarTodasLasMateriasInscriptas() {
        Alumno alumno = new Alumno();
        Materia AMI = new Materia("AMI", new Materia[0]);
        Materia AGA = new Materia("AGA", new Materia[0]);

        Materia[] materiasCorrelativasAMII = { AMI, AGA };
        Materia AMII = new Materia("AMII", materiasCorrelativasAMII);

        Materia[] materiasInscriptas = { AMII };
        alumno.setMateriasAprobadas(new Materia[] { AMI });

        Inscripcion inscripcion = new Inscripcion(alumno, materiasInscriptas);

        assertFalse(inscripcion.aprobada());
    }

    @Test
    public void testAprobada_AlumnoNoTieneMateriasInscriptas() {
        Alumno alumno = new Alumno();
        Materia[] materiasInscriptas = { };

        Inscripcion inscripcion = new Inscripcion(alumno, materiasInscriptas);

        assertFalse(inscripcion.aprobada());
    }
}
