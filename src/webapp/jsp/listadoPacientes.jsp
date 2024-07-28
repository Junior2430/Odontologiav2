<%@ page import="main.java.model.Paciente" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Listado de Pacientes</title>
</head>
<body>
<h1>Listado de Pacientes</h1>
<a href="paciente?action=add">Agregar Paciente</a>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Nombre</th>
        <th>Email</th>
        <th>Teléfono</th>
        <th>Acciones</th>
    </tr>
    <%
        List<Paciente> pacientes = (List<Paciente>) request.getAttribute("pacientes");
        if (pacientes != null) {
            for (Paciente paciente : pacientes) {
    %>
    <tr>
        <td><%= paciente.getId() %></td>
        <td><%= paciente.getNombre() %></td>
        <td><%= paciente.getEmail() %></td>
        <td><%= paciente.getTelefono() %></td>
        <td>
            <a href="paciente?action=view&id=<%= paciente.getId() %>">Ver</a>
            <a href="paciente?action=update&id=<%= paciente.getId() %>">Editar</a>
        </td>
    </tr>
    <%
            }
        }
    %>
</table>
</body>
</html>
