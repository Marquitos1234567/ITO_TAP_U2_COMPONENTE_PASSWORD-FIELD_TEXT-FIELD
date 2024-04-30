/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectito;

/**
 *
 * @author yo
 */
public class Usuario {
private String usuario;   
private String nombre;
private String apeM;
private String apeP;
private String contraseña; 
private boolean asistencia;
private String sexo;

    public Usuario(String usuario, String nombre, String apeM, String apeP, String contraseña,String s) {
        this.usuario = usuario;
        this.nombre = nombre;
        this.apeM = apeM;
        this.apeP = apeP;
        this.contraseña = contraseña;
        asistencia = false;
        sexo=s;
    }

    public String getSexo() {
        return sexo;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApeM() {
        return apeM;
    }

    public String getApeP() {
        return apeP;
    }

    public String getContraseña() {
        return contraseña;
    }

    public boolean getAsistencia() {
        return asistencia;
    }

    @Override
    public String toString() {
        return usuario + " " + nombre + " " + apeM + " " + apeP + " " + contraseña + " " + asistencia + " " + sexo;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
