package main.java.service;



import main.java.model.Doctor;

import java.util.ArrayList;
import java.util.List;

public class DoctorService {

    private List<Doctor> doctores = new ArrayList<>();

    public List<Doctor> getAllDoctores() {
        // Aquí iría la lógica para obtener todos los doctores de la base de datos
        return doctores;
    }

    public Doctor getDoctorById(int id) {
        // Aquí iría la lógica para obtener un doctor por su ID de la base de datos
        return doctores.stream().filter(d -> d.getId() == id).findFirst().orElse(null);
    }

    public void addDoctor(Doctor doctor) {
        // Aquí iría la lógica para agregar un nuevo doctor a la base de datos
        doctores.add(doctor);
    }

    public void updateDoctor(Doctor doctor) {
        // Aquí iría la lógica para actualizar un doctor existente en la base de datos
        Doctor d = getDoctorById(doctor.getId());
        if (d != null) {
            d.setNombre(doctor.getNombre());
            d.setEmail(doctor.getEmail());
            d.setContraseña(doctor.getContraseña());
            d.setEspecialidad(doctor.getEspecialidad());
        }
    }
}
