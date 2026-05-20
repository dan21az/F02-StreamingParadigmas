/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package streaming;

/**
 *
 * @author djurado
 */
class Usuario {

    private String nombre;
    private String rol;

    public Usuario(String nombre, String rol) {
        this.nombre = nombre;
        this.rol = rol;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRol() {
        return rol;
    }

    public boolean esEstudiante() {
        if(this.rol == "estudiante"){
            return true;
        }
        return false;
    }

}
