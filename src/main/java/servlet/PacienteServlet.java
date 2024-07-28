package main.java.servlet;


import main.java.model.Paciente;
import main.java.service.PacienteService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

@WebServlet("/paciente")
public class PacienteServlet extends HttpServlet {

    // Aquí deberías tener algún tipo de servicio o DAO para manejar las operaciones de base de datos
    private PacienteService pacienteService = new PacienteService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            // Mostrar la lista de pacientes
            List<Paciente> pacientes = pacienteService.getAllPacientes();
            request.setAttribute("pacientes", pacientes);
            request.getRequestDispatcher("/jsp/listadoPacientes.jsp").forward(request, response);
        } else if (action.equals("view")) {
            // Ver detalles de un paciente
            int id = Integer.parseInt(request.getParameter("id"));
            Paciente paciente = pacienteService.getPacienteById(id);
            request.setAttribute("paciente", paciente);
            request.getRequestDispatcher("/jsp/detallePaciente.jsp").forward(request, response);
        } else if (action.equals("add")) {
            // Mostrar formulario para agregar un nuevo paciente
            request.getRequestDispatcher("/jsp/formularioPaciente.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action.equals("add")) {
            // Agregar un nuevo paciente
            String nombre = request.getParameter("nombre");
            String email = request.getParameter("email");
            String contraseña = request.getParameter("contraseña");
            Date fechaNacimiento = Date.valueOf(request.getParameter("fechanacimiento"));
            int telefono = Integer.parseInt(request.getParameter("telefono"));
            String direccion = request.getParameter("direccion");

            Paciente nuevoPaciente = new Paciente(nombre, email, contraseña, fechaNacimiento, telefono, direccion);
            pacienteService.addPaciente(nuevoPaciente);
            response.sendRedirect("paciente");
        } else if (action.equals("update")) {
            // Actualizar un paciente existente
            int id = Integer.parseInt(request.getParameter("id"));
            String nombre = request.getParameter("nombre");
            String email = request.getParameter("email");
            String contraseña = request.getParameter("contraseña");
            Date fechaNacimiento = Date.valueOf(request.getParameter("fechanacimiento"));
            int telefono = Integer.parseInt(request.getParameter("telefono"));
            String direccion = request.getParameter("direccion");

            Paciente pacienteActualizado = new Paciente(id, nombre, email, contraseña, fechaNacimiento, telefono, direccion);
            pacienteService.updatePaciente(pacienteActualizado);
            response.sendRedirect("paciente");
        }
    }
}
