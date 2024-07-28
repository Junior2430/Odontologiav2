package main.java.service;


import main.java.model.Administrador;

import java.util.ArrayList;
import java.util.List;

public class AdministradorService {

    private List<Administrador> administradores = new ArrayList<>();

    public List<Administrador> getAllAdministradores() {
        // Aquí iría la lógica para obtener todos los administradores de la base de datos
        return administradores;
    }

    public Administrador getAdministradorById(int id) {
        // Aquí iría la lógica para obtener un administrador por su ID de la base de datos
        return administradores.stream().filter(a -> a.getId() == id).findFirst().orElse(null);
    }

    public void addAdministrador(Administrador administrador) {
        // Aquí iría la lógica para agregar un nuevo administrador a la base de datos
        administradores.add(administrador);
    }

    public void updateAdministrador(Administrador administrador) {
        // Aquí iría la lógica para actualizar un administrador existente en la base de datos
        Administrador a = getAdministradorById(administrador.getId());
        if (a != null) {
            a.setNombre(administrador.getNombre());
            a.setEmail(administrador.getEmail());
            a.setContraseña(administrador.getContraseña());
            a.setRol(administrador.getRol());
        }
    }
}

