<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Detalle de Historial Médico</title>
</head>
<body>
<h1>Detalle de Historial Médico</h1>
<p>ID: ${historial.id}</p>
<p>Paciente ID: ${historial.pacienteid}</p>
<p>Diagnóstico: ${historial.diagnostico}</p>
<p>Fecha: ${historial.fecha}</p>
<p>Tratamiento: ${historial.tratamiento}</p>
<a href="historialMedico">Volver al Listado</a>
</body>
</html>
