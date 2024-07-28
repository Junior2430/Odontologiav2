package main.java.service;

import main.java.model.CitaMedica;

import java.util.ArrayList;
import java.util.List;

public class CitaMedicaService {

    private List<CitaMedica> citas = new ArrayList<>();

    public List<CitaMedica> getAllCitas() {
        // Aquí iría la lógica para obtener todas las citas de la base de datos
        return citas;
    }

    public CitaMedica getCitaById(int id) {
        // Aquí iría la lógica para obtener una cita por su ID de la base de datos
        return citas.stream().filter(c -> c.getId() == id).findFirst().orElse(null);
    }

    public void addCita(CitaMedica cita) {
        // Aquí iría la lógica para agregar una nueva cita a la base de datos
        citas.add(cita);
    }

    public void updateCita(CitaMedica cita) {
        // Aquí iría la lógica para actualizar una cita existente en la base de datos
        CitaMedica c = getCitaById(cita.getId());
        if (c != null) {
            c.setPacienteid(cita.getPacienteid());
            c.setDoctorid(cita.getDoctorid());
            c.setDiagnostico(cita.getDiagnostico());
            c.setFecha(cita.getFecha());
            c.setTratamiento(cita.getTratamiento());
            c.setEstado(cita.isEstado());
        }
    }
}
