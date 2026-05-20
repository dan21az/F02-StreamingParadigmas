package streaming;

public interface TransmisionListener {
    void onTransmisionIniciada(Transmision transmision);
    void onUsuarioUnido(Transmision transmision, Usuario usuario);
    void onMensajeEnviado(Transmision transmision, Mensaje mensaje);
}