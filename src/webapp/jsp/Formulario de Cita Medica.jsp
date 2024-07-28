<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Agregar Cita Médica</title>
</head>
<body>
<h1>Agregar Cita Médica</h1>
<form action="citaMedica" method="post">
    <input type="hidden" name="action" value="add">
    <p>Paciente ID: <input type="text" name="pacienteid"></p>
    <p>Doctor ID: <input type="text" name="doctorid"></p>
    <p>Diagnóstico: <input type="text" name="diagnostico"></p>
    <p>Fecha: <input type="date" name="fecha"></p>
    <p>Tratamiento: <input type="text" name="tratamiento"></p>
    <p>Estado: <input type="checkbox" name="estado"></p>
    <p>Fecha de Creación: <input type="date" name="fechaCreacion"></p>
    <input type="submit" value="Agregar">
</form>
<a href="citaMedica">Volver al Listado</a>
</body>
</html>
