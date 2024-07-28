<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Listado de Doctores</title>
</head>
<body>
<h1>Listado de Doctores</h1>
<a href="doctor?action=add">Agregar Doctor</a>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Nombre</th>
        <th>Email</th>
        <th>Especialidad</th>
        <th>Acciones</th>
    </tr>
    <c:forEach var="doctor" items="${doctores}">
        <tr>
            <td>${doctor.id}</td>
            <td>${doctor.nombre}</td>
            <td>${doctor.email}</td>
            <td>${doctor.especialidad}</td>
            <td>
                <a href="doctor?action=view&id=${doctor.id}">Ver</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
