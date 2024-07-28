package main.java.service;



import main.java.model.Paciente;

import java.util.ArrayList;
import java.util.List;

public class PacienteService {

    private List<Paciente> pacientes = new ArrayList<>();

    public List<Paciente> getAllPacientes() {
        // Aquí iría la lógica para obtener todos los pacientes de la base de datos
        return pacientes;
    }

    public Paciente getPacienteById(int id) {
        // Aquí iría la lógica para obtener un paciente por su ID de la base de datos
        return pacientes.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public void addPaciente(Paciente paciente) {
        // Aquí iría la lógica para agregar un nuevo paciente a la base de datos
        pacientes.add(paciente);
    }

    public void updatePaciente(Paciente paciente) {
        // Aquí iría la lógica para actualizar un paciente existente en la base de datos
        Paciente p = getPacienteById(paciente.getId());
        if (p != null) {
            p.setNombre(paciente.getNombre());
            p.setEmail(paciente.getEmail());
            p.setContraseña(paciente.getContraseña());
            p.setFechanacimiento(paciente.getFechanacimiento());
            p.setTelefono(paciente.getTelefono());
            p.setDireccion(paciente.getDireccion());
        }
    }
}
