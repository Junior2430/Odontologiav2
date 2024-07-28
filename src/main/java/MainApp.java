package main.java;


import main.java.model.Paciente;
import main.java.service.PacienteService;

import java.sql.Date;
import java.sql.SQLException;
import java.util.Scanner;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;


public class MainApp {
    public static void main(String[] args) throws SQLException {

        /*Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su documento");
        int cedula = entrada.nextInt();
        System.out.println("Ingrese su contraseña");
        String contraseña = entrada.nextLine();

        Administrador miadmin = new Administrador(cedula,contraseña);
        miadmin.MostrarAdministrador();*/

        // Crear una instancia de PacienteService
        PacienteService pacienteService = new PacienteService();

        // Crear un paciente de prueba
        Paciente paciente = new Paciente(1, "Juan Pérez", "juan@example.com", "password", Date.valueOf("1980-01-01"), 123456789, "Calle Falsa 123");

        // Agregar el paciente al servicio
        pacienteService.addPaciente(paciente);

        // Obtener todos los pacientes
        pacienteService.getAllPacientes().forEach(System.out::println);

        SimpleMySQLConnetion.connect();

//        Scanner entrada = new Scanner(System.in);
//
//        System.out.println("Ingrese su documento");
//        int cedula = entrada.nextInt();
//        System.out.println("Ingrese su contraseña");
//        String contraseña = entrada.nextLine();
    }
}

