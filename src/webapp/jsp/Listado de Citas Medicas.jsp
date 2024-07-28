<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Listado de Citas Médicas</title>
</head>
<body>
<h1>Listado de Citas Médicas</h1>
<a href="citaMedica?action=add">Agregar Cita Médica</a>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Paciente ID</th>
        <th>Doctor ID</th>
        <th>Diagnóstico</th>
        <th>Fecha</th>
        <th>Acciones</th>
    </tr>
    <c:forEach var="cita" items="${citas}">
        <tr>
            <td>${cita.id}</td>
            <td>${cita.pacienteid}</td>
            <td>${cita.doctorid}</td>
            <td>${cita.diagnostico}</td>
            <td>${cita.fecha}</td>
            <td>
                <a href="citaMedica?action=view&id=${cita.id}">Ver</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
