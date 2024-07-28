package main.java.model;

import java.util.Date;


public class Administrador {
    private int id;
    private String nombre;
    private String email;
    private String contraseña;
    private String rol;
    private Date FechaCreacion;

    public Administrador(String email, String nombre, String contraseña, String rol, Date fechaCreacion) {
        this.id = id;
        this.email = email;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.rol = rol;
        FechaCreacion = fechaCreacion;
    }

    public Administrador(int id, String contraseña) {
        this.id = id;
        this.contraseña = contraseña;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getRol() {
        return rol;
    }

    public Date getFechaCreacion() {
        return FechaCreacion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    //verificaion de contraseña
    public boolean verificarContraseña(String contraseña){
        return this.contraseña.equals(contraseña);
    }

    //@Overrride
    public String MostrarAdministrador(){
        return "administrador{"+
                "id=" + id +
                ", nombre=" + nombre + '/'+
                ", email=" + email + '/'+
                ", rol=" + rol + '/' +
                ", fechaCreacion=" + FechaCreacion +
                '}';
    }
}
