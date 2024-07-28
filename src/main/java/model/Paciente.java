package main.java.model;

import java.util.Date;

public class Paciente {
    private int id;
    private String nombre;
    private String email;
    private String contraseña;
    private Date Fechanacimiento;
    private int telefono;
    private String direccion;
    private Date Fechacita;
    private String Historialmedico;

    public Paciente(int id, String nombre, String email, String contraseña, Date fechanacimiento, int telefono, String historialmedico) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        Fechanacimiento = fechanacimiento;
        this.telefono = telefono;
        this.Historialmedico = historialmedico;
        /*this.Fechacita = fechacita;*/
        this.direccion = direccion;
    }

  /*  public Paciente(int id, String contraseña) {
        this.id = id;
        this.contraseña = contraseña;
    };*/

    public Paciente(String nombre, String email, String contraseña, java.sql.Date fechaNacimiento, int telefono, String direccion) {
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

    public Date getFechanacimiento() {
        return Fechanacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public Date getFechacita() {
        return Fechacita;
    }

    public String getHistorialmedico() {
        return Historialmedico;
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

    public void setFechanacimiento(Date fechanacimiento) {
        Fechanacimiento = fechanacimiento;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFechacita(Date fechacita) {
        Fechacita = fechacita;
    }

    public void setHistorialmedico(String historialmedico) {
        Historialmedico = historialmedico;
    }

    //@Overrride
    public String mostrarpaciente(){
        return "Paciente{"+
                "id=" + id +
                ", nombre=" + nombre + '/'+
                ", email=" + email + '/'+
                ", rol=" + Fechanacimiento + '/' +
                ", telefono=" + telefono +
                ", direccion=" + direccion +
                ", fechacita=" + Fechacita +
                ", historial medico=" + Historialmedico +
                '}';
    }
}
