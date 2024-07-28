package main.java.servlet;



import main.java.model.Doctor;
import main.java.service.DoctorService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

@WebServlet("/doctor")
public class DoctorServlet extends HttpServlet {

    private DoctorService doctorService = new DoctorService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            List<Doctor> doctores = doctorService.getAllDoctores();
            request.setAttribute("doctores", doctores);
            request.getRequestDispatcher("/jsp/listadoDoctores.jsp").forward(request, response);
        } else if (action.equals("view")) {
            int id = Integer.parseInt(request.getParameter("id"));
            Doctor doctor = doctorService.getDoctorById(id);
            request.setAttribute("doctor", doctor);
            request.getRequestDispatcher("/jsp/detalleDoctor.jsp").forward(request, response);
        } else if (action.equals("add")) {
            request.getRequestDispatcher("/jsp/formularioDoctor.jsp").forward(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action.equals("add")) {
            int Doctorid = Integer.parseInt(request.getParameter("doctorid"));
            String nombre = request.getParameter("nombre");
            String email = request.getParameter("email");
            String contraseña = request.getParameter("contraseña");
            String especialidad = request.getParameter("especialidad");
            Date fechaIngreso = Date.valueOf(request.getParameter("fechaIngreso"));

            Doctor nuevoDoctor = new Doctor(Doctorid, nombre, email, contraseña, especialidad, fechaIngreso);
            doctorService.addDoctor(nuevoDoctor);
            response.sendRedirect("doctor");
        } else if (action.equals("update")) {
            int id = Integer.parseInt(request.getParameter("id"));
            String nombre = request.getParameter("nombre");
            String email = request.getParameter("email");
            String contraseña = request.getParameter("contraseña");
            String especialidad = request.getParameter("especialidad");
            Date fechaIngreso = Date.valueOf(request.getParameter("fechaIngreso"));

            Doctor doctorActualizado = new Doctor(id, nombre, email, contraseña, especialidad, fechaIngreso);
            doctorService.updateDoctor(doctorActualizado);
            response.sendRedirect("doctor");
        }
    }
}
