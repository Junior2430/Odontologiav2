<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Listado de Administradores</title>
</head>
<body>
<h1>Listado de Administradores</h1>
<a href="administrador?action=add">Agregar Administrador</a>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Nombre</th>
        <th>Email</th>
        <th>Rol</th>
        <th>Acciones</th>
    </tr>
    <c:forEach var="administrador" items="${administradores}">
        <tr>
            <td>${administrador.id}</td>
            <td>${administrador.nombre}</td>
            <td>${administrador.email}</td>
            <td>${administrador.rol}</td>
            <td>
                <a href="administrador?action=view&id=${administrador.id}">Ver</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
