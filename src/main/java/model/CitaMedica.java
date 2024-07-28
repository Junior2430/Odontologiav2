package main.java.model;

import java.util.Date;

public class CitaMedica {
    private int id;
    private int pacienteid;
    private int doctorid;
    private String diagnostico;
    private Date fecha;
    private String tratamiento;
    private boolean estado;
    private Date FechaCreacion;

    public CitaMedica(int id, int pacienteid, String diagnostico, Date fecha, String tratamiento, boolean estado, Date fechaCreacion) {
        this.id = id;
        this.pacienteid = pacienteid;
        this.doctorid = doctorid;
        this.diagnostico = diagnostico;
        this.fecha = fecha;
        this.tratamiento = tratamiento;
        this.estado = estado;
        FechaCreacion = fechaCreacion;
    }

    public int getId() {
        return id;
    }

    public int getPacienteid() {
        return pacienteid;
    }

    public int getDoctorid() {
        return doctorid;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public Date getFechaCreacion() {
        return FechaCreacion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPacienteid(int pacienteid) {
        this.pacienteid = pacienteid;
    }

    public void setDoctorid(int doctorid) {
        this.doctorid = doctorid;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        FechaCreacion = fechaCreacion;
    }

    //@Overrride
    public String toString(){
        return "Paciente{"+
                "id=" + id +
                ", paciente =" + pacienteid + '/'+
                ", doctor=" + doctorid + '/'+
                ", diagnostico=" + diagnostico + '/' +
                ", fecha=" + fecha +
                ", tratamiento=" + tratamiento +
                ", estado=" + estado +
                ", fecha creacion=" + FechaCreacion +
                '}';
    }
}
