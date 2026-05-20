package streaming;

public class ChatComponent implements TransmisionListener {

    @Override
    public void onTransmisionIniciada(Transmision transmision) {
        System.out.println("[CHAT] Chat habilitado para: " + transmision.getTitulo());
    }

    @Override
    public void onUsuarioUnido(Transmision transmision, Usuario usuario) {
        System.out.println("[CHAT] " + usuario.getNombre() + " entró al chat.");
    }

    @Override
    public void onMensajeEnviado(Transmision transmision, Mensaje mensaje) {
        System.out.println("[CHAT] " 
                + mensaje.getUsuario().getNombre() 
                + ": " 
                + mensaje.getTexto());
    }
}