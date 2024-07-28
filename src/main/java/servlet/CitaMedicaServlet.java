package main.java.servlet;


import main.java.model.CitaMedica;
import main.java.service.CitaMedicaService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

@WebServlet("/citaMedica")
public class CitaMedicaServlet extends HttpServlet {

    private CitaMedicaService citaMedicaService = new CitaMedicaService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            List<CitaMedica> citas = citaMedicaService.getAllCitas();
            request.setAttribute("citas", citas);
            request.getRequestDispatcher("/jsp/listadoCitasMedicas.jsp").forward(request, response);
        } else if (action.equals("view")) {
            int id = Integer.parseInt(request.getParameter("id"));
            CitaMedica cita = citaMedicaService.getCitaById(id);
            request.setAttribute("cita", cita);
            request.getRequestDispatcher("/jsp/detalleCitaMedica.jsp").forward(request, response);
        } else if (action.equals("add")) {
            request.getRequestDispatcher("/jsp/formularioCitaMedica.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action.equals("add")) {
            int pacienteid = Integer.parseInt(request.getParameter("pacienteid"));
            int doctorid = Integer.parseInt(request.getParameter("doctorid"));
            String diagnostico = request.getParameter("diagnostico");
            Date fecha = Date.valueOf(request.getParameter("fecha"));
            String tratamiento = request.getParameter("tratamiento");
            boolean estado = Boolean.parseBoolean(request.getParameter("estado"));
            Date fechaCreacion = Date.valueOf(request.getParameter("fechaCreacion"));

            CitaMedica nuevaCita = new CitaMedica(pacienteid, doctorid, diagnostico, fecha, tratamiento, estado, fechaCreacion);
            citaMedicaService.addCita(nuevaCita);
            response.sendRedirect("citaMedica");
        } else if (action.equals("update")) {
            int id = Integer.parseInt(request.getParameter("id"));
            int pacienteid = Integer.parseInt(request.getParameter("pacienteid"));
            int doctorid = Integer.parseInt(request.getParameter("doctorid"));
            String diagnostico = request.getParameter("diagnostico");
            Date fecha = Date.valueOf(request.getParameter("fecha"));
            String tratamiento = request.getParameter("tratamiento");
            boolean estado = Boolean.parseBoolean(request.getParameter("estado"));
            Date fechaCreacion = Date.valueOf(request.getParameter("fechaCreacion"));

            CitaMedica citaActualizada = new CitaMedica(id, pacienteid, diagnostico, fecha, tratamiento, estado, fechaCreacion);
            citaMedicaService.updateCita(citaActualizada);
            response.sendRedirect("citaMedica");
        }
    }
}
