package main.java.service;


import main.java.model.HistorialMedico;

import java.util.ArrayList;
import java.util.List;

public class HistorialMedicoService {

    private List<HistorialMedico> historiales = new ArrayList<>();

    public List<HistorialMedico> getAllHistoriales() {
        // Aquí iría la lógica para obtener todos los historiales médicos de la base de datos
        return historiales;
    }

    public HistorialMedico getHistorialById(int id) {
        // Aquí iría la lógica para obtener un historial médico por su ID de la base de datos
        return historiales.stream().filter(h -> h.getId() == id).findFirst().orElse(null);
    }

    public void addHistorial(HistorialMedico historial) {
        // Aquí iría la lógica para agregar un nuevo historial médico a la base de datos
        historiales.add(historial);
    }

    public void updateHistorial(HistorialMedico historial) {
        // Aquí iría la lógica para actualizar un historial médico existente en la base de datos
        HistorialMedico h = getHistorialById(historial.getId());
        if (h != null) {
            h.setPacienteid(historial.getPacienteid());
            h.setDiagnostico(historial.getDiagnostico());
            h.setTratamiento(historial.getTratamiento());
            h.setFechacreacion(historial.getFechacreacion());
        }
    }
}

