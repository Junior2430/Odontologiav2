package main.java.servlet;


import main.java.model.Administrador;
import main.java.service.AdministradorService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

@WebServlet("/administrador")
public class AdministradorServlet extends HttpServlet {

    private AdministradorService administradorService = new AdministradorService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            List<Administrador> administradores = administradorService.getAllAdministradores();
            request.setAttribute("administradores", administradores);
            request.getRequestDispatcher("/jsp/listadoAdministradores.jsp").forward(request, response);
        } else if (action.equals("view")) {
            int id = Integer.parseInt(request.getParameter("id"));
            Administrador administrador = administradorService.getAdministradorById(id);
            request.setAttribute("administrador", administrador);
            request.getRequestDispatcher("/jsp/detalleAdministrador.jsp").forward(request, response);
        } else if (action.equals("add")) {
            request.getRequestDispatcher("/jsp/formularioAdministrador.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action.equals("add")) {
            String nombre = request.getParameter("nombre");
            String email = request.getParameter("email");
            String contraseña = request.getParameter("contraseña");
            String rol = request.getParameter("rol");
            Date fechaCreacion = Date.valueOf(request.getParameter("fechaCreacion"));

            Administrador nuevoAdministrador = new Administrador(nombre, email, contraseña, rol, fechaCreacion);
            administradorService.addAdministrador(nuevoAdministrador);
            response.sendRedirect("administrador");
        } else if (action.equals("update")) {
            int id = Integer.parseInt(request.getParameter("id"));
            String nombre = request.getParameter("nombre");
            String email = request.getParameter("email");
            String contraseña = request.getParameter("contraseña");
            String rol = request.getParameter("rol");
            Date fechaCreacion = Date.valueOf(request.getParameter("fechaCreacion"));

            Administrador administradorActualizado = new Administrador(nombre, email, contraseña, rol, fechaCreacion);
            administradorService.updateAdministrador(administradorActualizado);
            response.sendRedirect("administrador");
        }
    }
}
