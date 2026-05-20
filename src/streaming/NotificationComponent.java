package streaming;

public class NotificationComponent implements TransmisionListener {

    @Override
    public void onTransmisionIniciada(Transmision transmision) {
        System.out.println("[NOTIFICACIÓN] Inició la clase: " + transmision.getTitulo());
    }

    @Override
    public void onUsuarioUnido(Transmision transmision, Usuario usuario) {
        System.out.println("[NOTIFICACIÓN] " + usuario.getNombre() + " se conectó.");
    }

    @Override
    public void onMensajeEnviado(Transmision transmision, Mensaje mensaje) {
        System.out.println("[NOTIFICACIÓN] Nuevo mensaje en la transmisión.");
    }
}