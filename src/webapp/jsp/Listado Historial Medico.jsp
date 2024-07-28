<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Listado de Historiales Médicos</title>
</head>
<body>
<h1>Listado de Historiales Médicos</h1>
<a href="historialMedico?action=add">Agregar Historial Médico</a>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Paciente ID</th>
        <th>Diagnóstico</th>
        <th>Fecha</th>
        <th>Acciones</th>
    </tr>
    <c:forEach var="historial" items="${historiales}">
        <tr>
            <td>${historial.id}</td>
            <td>${historial.pacienteid}</td>
            <td>${historial.diagnostico}</td>
            <td>${historial.fecha}</td>
            <td>
                <a href="historialMedico?action=view&id=${historial.id}">Ver</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
