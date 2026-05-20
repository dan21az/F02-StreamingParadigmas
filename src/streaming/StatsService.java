package streaming;

import java.util.List;
import java.util.stream.Collectors;
// Cambiado de Paradigma Funcional a Orientado a Objetos

public class StatsService {

    /* Se crean atributos para la clase StatsService, 
    el nombre se podria cambiar a estadisticasTransmision */
    private String tituloTransmision;  
    private String profesorTransmision;
    private List<Usuario> asistentesTransmision;   
    private List<Mensaje> totalMensajesTransmision;

    /* Constructor del obejto de estadistica donde se obtiene la informacion
    de la transmision */
    public StatsService(Transmision transmision) {
        this.tituloTransmision = transmision.getTitulo();
        this.profesorTransmision = transmision.getProfesor().getNombre();
        this.asistentesTransmision = transmision.getAsistentes();
        this.totalMensajesTransmision = transmision.getMensajes();
    }
    
    /* mostrarEstadisticas y mostrarAsistentes ahoran son metodos de la clase
    y usan los atributos de la misma clae */
    public void mostrarEstadisticas() {
        System.out.println("\n=== ESTADÍSTICAS DE LA TRANSMISIÓN ===");
        System.out.println("Título: " + tituloTransmision);
        System.out.println("Profesor: " + profesorTransmision);
        System.out.println("Total de asistentes: " + asistentesTransmision);
        System.out.println("Total de mensajes: " + totalMensajesTransmision);
        
        long estudiantes = asistentesTransmision.stream()
                .filter(u -> "estudiante".equals(u.getRol()))
                .count();
        System.out.println("Estudiantes conectados: " + estudiantes);
        
        System.out.println("\n=== MENSAJES ===");
        totalMensajesTransmision.forEach(m -> 
            System.out.println(m.getUsuario().getNombre() + ": " + m.getTexto())
        );
    }
    
    public void mostrarAsistentes() {
        System.out.println("\n=== ASISTENTES ===");
        asistentesTransmision.forEach(u -> 
            System.out.println("- " + u.getNombre() + " (" + u.getRol() + ")")
        );
    }

    // Getters
    public List<Usuario> getAsistentesTransmision() {
        return asistentesTransmision;
    }

    public String getProfesorTransmision() {
        return profesorTransmision;
    }

    public String getTituloTransmision() {
        return tituloTransmision;
    }

    public List<Mensaje> getTotalMensajesTransmision() {
        return totalMensajesTransmision;
    }
}
