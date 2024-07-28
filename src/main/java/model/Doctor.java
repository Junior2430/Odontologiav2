package main.java.model;

import java.util.Date;

public class Doctor {
    private int id;
    private String nombre;
    private int pacienteid;
    private int historialmedicoid;
    private String especialidad;
    private String email;
    private String contraseña;
    private int telefono;
    private String horarios;
    private Date fechacreacion;

    public Doctor(int id, String nombre, String especialidad, String contraseña, String email, Date fechacreacion) {
        this.id = this.id;
        this.nombre = nombre;
        this.pacienteid = pacienteid;
        this.historialmedicoid = historialmedicoid;
        this.especialidad = especialidad;
        this.contraseña = contraseña;
        this.email = email;
        this.telefono = telefono;
        this.horarios = horarios;
        this.fechacreacion = fechacreacion;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public String getEmail() {
        return email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getHorarios() {
        return horarios;
    }

    public Date getFechacreacion() {
        return fechacreacion;
    }

    public int getPacienteid() {
        return pacienteid;
    }

    public int getHistorialmedicoid() {
        return historialmedicoid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    public void setHistorialmedicoid(int historialmedicoid) {
        this.historialmedicoid = historialmedicoid;
    }

    public void setPacienteid(int pacienteid) {
        this.pacienteid = pacienteid;
    }

    //verificaion de contraseña
    public boolean verificarContraseña(String contraseña){
        return this.contraseña.equals(contraseña);
    }

    //@Overrride
    public String toString(){
        return "main.java.model.Doctor{"+
                "id=" + id +
                ", nombre =" + nombre + '/'+
                ", especialidad=" + especialidad + '/'+
                ", id paciente=" + pacienteid + '/' +
                ", id historial=" + historialmedicoid +
                ", email=" + email +
                ", contraseña=" + contraseña +
                ", telefono=" + telefono +
                ", fecha creacion=" + fechacreacion +
                '}';
    }
}

