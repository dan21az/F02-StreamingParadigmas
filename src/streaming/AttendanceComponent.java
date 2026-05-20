package streaming;

public class AttendanceComponent implements TransmisionListener {

    @Override
    public void onTransmisionIniciada(Transmision transmision) {
        System.out.println("[ASISTENCIA] Iniciando registro de asistencia para: " + transmision.getTitulo());
    }

    @Override
    public void onUsuarioUnido(Transmision transmision, Usuario usuario) {
        System.out.println("[ASISTENCIA] " + usuario.getNombre() + " ("+usuario.getRol()+") presente en la transmisión.");
    }

    @Override
    public void onMensajeEnviado(Transmision transmision, Mensaje mensaje) {
        // No necesitamos registrar mensajes en asistencia
    }
}
