package streaming;

import java.util.List;
import java.util.stream.Collectors;

public class StatsService {
    
    public static void mostrarEstadisticas(Transmision transmision) {
        System.out.println("\n=== ESTADÍSTICAS DE LA TRANSMISIÓN ===");
        System.out.println("Título: " + transmision.getTitulo());
        System.out.println("Profesor: " + transmision.getProfesor().getNombre());
        System.out.println("Total de asistentes: " + transmision.getAsistentes().size());
        System.out.println("Total de mensajes: " + transmision.getMensajes().size());
        
        long estudiantes = transmision.getAsistentes().stream()
                .filter(u -> "estudiante".equals(u.getRol()))
                .count();
        System.out.println("Estudiantes conectados: " + estudiantes);
        
        System.out.println("\n=== MENSAJES ===");
        transmision.getMensajes().forEach(m -> 
            System.out.println(m.getUsuario().getNombre() + ": " + m.getTexto())
        );
    }
    
    public static void mostrarAsistentes(Transmision transmision) {
        System.out.println("\n=== ASISTENTES ===");
        transmision.getAsistentes().forEach(u -> 
            System.out.println("- " + u.getNombre() + " (" + u.getRol() + ")")
        );
    }
}
