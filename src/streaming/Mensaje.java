package streaming;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author djurado
 */
class Mensaje {
    private Usuario usuario;
    private String texto;

    public Mensaje(Usuario usuario, String texto) {
        this.usuario = usuario;
        this.texto = texto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getTexto() {
       return texto;
    }

}
