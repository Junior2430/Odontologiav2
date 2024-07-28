<%@ page import="main.java.model.Paciente" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Detalle del Paciente</title>
</head>
<body>
<h1>Detalle del Paciente</h1>
<%
    Paciente paciente = (Paciente) request.getAttribute("paciente");
    if (paciente != null) {
%>
<p>ID: <%= paciente.getId() %></p>
<p>Nombre: <%= paciente.getNombre() %></p>
<p>Email: <%= paciente.getEmail() %></p>
<p>Teléfono: <%= paciente.getTelefono() %></p>
<p>Fecha de Nacimiento: <%= paciente.getFechanacimiento() %></p>
<p>Dirección: <%= paciente.getDireccion() %></p>
<a href="paciente">Volver</a>
<% } else { %>
<p>Paciente no encontrado</p>
<% } %>
</body>
</html>
