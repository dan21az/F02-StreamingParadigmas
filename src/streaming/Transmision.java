package streaming;

import java.util.ArrayList;
import java.util.List;

public class Transmision {

    private String titulo;
    private Usuario profesor;
    private boolean activa;
    private List<Usuario> asistentes;
    private List<Mensaje> mensajes;
    private List<TransmisionListener> listeners;

    public Transmision(String titulo, Usuario profesor) {
        this.titulo = titulo;
        this.profesor = profesor;
        this.activa = false;
        this.asistentes = new ArrayList<>();
        this.mensajes = new ArrayList<>();
        this.listeners = new ArrayList<>();
    }

    public void agregarListener(TransmisionListener listener) {
        listeners.add(listener);
    }

    public void iniciar() {
        activa = true;

        for (TransmisionListener listener : listeners) {
            listener.onTransmisionIniciada(this);
        }
    }

    public void unirUsuario(Usuario usuario) {
        asistentes.add(usuario);

        for (TransmisionListener listener : listeners) {
            listener.onUsuarioUnido(this, usuario);
        }
    }

    public void enviarMensaje(Usuario usuario, String texto) {
        Mensaje mensaje = new Mensaje(usuario, texto);
        mensajes.add(mensaje);

        for (TransmisionListener listener : listeners) {
            listener.onMensajeEnviado(this, mensaje);
        }
    }

    public String getTitulo() {
        return titulo;
    }
    
    public Usuario getProfesor() {
        return profesor;
    }
    
    public boolean isActiva() {
        return activa;
    }

    public List<Usuario> getAsistentes() {
        return asistentes;
    }

    public List<Mensaje> getMensajes() {
        return mensajes;
    }
    
    public void finalizarTransmision() {
        activa = false;
        for (TransmisionListener listener : listeners) {
            System.out.println("[EVENTO] Transmisión finalizada");
        }
    }
}