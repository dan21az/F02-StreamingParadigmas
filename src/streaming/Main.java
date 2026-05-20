package streaming;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE TRANSMISIÓN DE CLASES ===");
        System.out.println();
        
        // Crear usuarios
        Usuario profesora = new Usuario("Ana", "profesor");
        Usuario ayudante = new Usuario("Luis", "ayudante");
        Usuario estudiante1 = new Usuario("Marta", "estudiante");
        Usuario estudiante2 = new Usuario("Carlos", "estudiante");
        Usuario estudiante3 = new Usuario("Juan", "estudiante");

        // Crear transmisión
        Transmision transmision = new Transmision("Clase de Paradigmas de Programación", profesora);
        
        // Registrar listeners (componentes)
        transmision.agregarListener(new ChatComponent());
        transmision.agregarListener(new AttendanceComponent());
        transmision.agregarListener(new NotificationComponent());
        
        // Iniciar transmisión
        System.out.println("[SISTEMA] Iniciando transmisión...\n");
        transmision.iniciar();
        
        // Agregar asistentes
        System.out.println();
        transmision.unirUsuario(ayudante);
        transmision.unirUsuario(estudiante1);
        transmision.unirUsuario(estudiante2);
        transmision.unirUsuario(estudiante3);
        
        // Enviar mensajes
        System.out.println();
        transmision.enviarMensaje(estudiante1, "Buenas tardes profesora");
        transmision.enviarMensaje(estudiante2, "¿La clase queda grabada?");
        transmision.enviarMensaje(ayudante, "Sí, se grabará la sesión");
        transmision.enviarMensaje(estudiante3, "Gracias por la aclaración");
        
        // Mostrar estadísticas usando Stream API
        System.out.println();
        StatsService.mostrarEstadisticas(transmision);
        
        // Filtrar y mostrar solo estudiantes
        System.out.println();
        List<Usuario> estudiantes = transmision.getAsistentes()
                .stream()
                .filter(u -> "estudiante".equals(u.getRol()))
                .collect(Collectors.toList());
        
        System.out.println("\n=== ESTUDIANTES ASISTENTES ===");
        estudiantes.forEach(e -> System.out.println("- " + e.getNombre()));
        
        // Obtener nombres de todos los asistentes
        List<String> nombres = transmision.getAsistentes()
                .stream()
                .map(Usuario::getNombre)
                .collect(Collectors.toList());
        
        System.out.println("\n=== RESUMEN ===");
        System.out.println("Total de estudiantes: " + estudiantes.size());
        System.out.println("Total de mensajes: " + transmision.getMensajes().size());
        System.out.println("Todos los asistentes: " + nombres);
        
        // Finalizar transmisión
        System.out.println();
        transmision.finalizarTransmision();
        System.out.println("[SISTEMA] Transmisión finalizada.");
    }
}