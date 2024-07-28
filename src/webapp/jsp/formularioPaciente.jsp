<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Agregar Paciente</title>
</head>
<body>
<h1>Agregar Paciente</h1>
<form action="paciente" method="post">
    <input type="hidden" name="action" value="add">
    Nombre: <input type="text" name="nombre"><br>
    Email: <input type="email" name="email"><br>
    Contraseña: <input type="password" name="contraseña"><br>
    Fecha de Nacimiento: <input type="date" name="fechanacimiento"><br>
    Teléfono: <input type="text" name="telefono"><br>
    Dirección: <input type="text" name="direccion"><br>
    <input type="submit" value="Agregar">
</form>
</body>
</html>
