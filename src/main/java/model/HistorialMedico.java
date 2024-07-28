package main.java.model;

import java.util.Date;

public class HistorialMedico {
    private int id;
    private int pacienteid;
    private int doctorid;
    private int citasid;
    private String diagnostico;
    private String tratamiento;
    private String notas;
    private Date fechacreacion;

    public HistorialMedico(int id, int pacienteid, int doctorid, int citasid, String diagnostico, String tratamiento, String notas, Date fechacreacion) {
        this.id = id;
        this.pacienteid = pacienteid;
        this.doctorid = doctorid;
        this.citasid = citasid;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.notas = notas;
        this.fechacreacion = fechacreacion;
    }

    public HistorialMedico(int pacienteid, int i, String diagnostico, java.sql.Date fecha, String tratamiento) {
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

    public int getCitasid() {
        return citasid;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public String getNotas() {
        return notas;
    }

    public Date getFechacreacion() {
        return fechacreacion;
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

    public void setCitasid(int citasid) {
        this.citasid = citasid;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }

    //@Overrride
    public String toString(){
        return "main.java.model.HistorialMedico{"+
                "id=" + id +
                ", paciente id =" + pacienteid + '/'+
                ", doctor id=" + doctorid + '/'+
                ", citas id=" + citasid + '/' +
                ", diagnostico=" + diagnostico +
                ", tratamiento=" + tratamiento +
                ", notas=" + notas +
                ", fecha creacion=" + fechacreacion +
                '}';
    }
}
