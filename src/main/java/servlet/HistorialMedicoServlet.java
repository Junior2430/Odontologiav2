package main.java.servlet;

import main.java.model.HistorialMedico;
import main.java.service.HistorialMedicoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

@WebServlet("/historialMedico")
public class HistorialMedicoServlet extends HttpServlet {

    private HistorialMedicoService historialMedicoService = new HistorialMedicoService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            List<HistorialMedico> historiales = historialMedicoService.getAllHistoriales();
            request.setAttribute("historiales", historiales);
            request.getRequestDispatcher("/jsp/listadoHistorialesMedicos.jsp").forward(request, response);
        } else if (action.equals("view")) {
            int id = Integer.parseInt(request.getParameter("id"));
            HistorialMedico historial = historialMedicoService.getHistorialById(id);
            request.setAttribute("historial", historial);
            request.getRequestDispatcher("/jsp/detalleHistorialMedico.jsp").forward(request, response);
        } else if (action.equals("add")) {
            request.getRequestDispatcher("/jsp/formularioHistorialMedico.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action.equals("add")) {
            int pacienteid = Integer.parseInt(request.getParameter("pacienteid"));
            String diagnostico = request.getParameter("diagnostico");
            Date fecha = Date.valueOf(request.getParameter("fecha"));
            String tratamiento = request.getParameter("tratamiento");

            HistorialMedico nuevoHistorial = new HistorialMedico(pacienteid, pacienteid, diagnostico, fecha, tratamiento);
            historialMedicoService.addHistorial(nuevoHistorial);
            response.sendRedirect("historialMedico");
        } else if (action.equals("update")) {
            int id = Integer.parseInt(request.getParameter("id"));
            int pacienteid = Integer.parseInt(request.getParameter("pacienteid"));
            String diagnostico = request.getParameter("diagnostico");
            Date fecha = Date.valueOf(request.getParameter("fecha"));
            String tratamiento = request.getParameter("tratamiento");

            HistorialMedico historialActualizado = new HistorialMedico(id, pacienteid, diagnostico, fecha, tratamiento);
            historialMedicoService.updateHistorial(historialActualizado);
            response.sendRedirect("historialMedico");
        }
    }
}

