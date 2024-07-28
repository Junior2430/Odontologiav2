<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Detalle de Cita Médica</title>
</head>
<body>
<h1>Detalle de Cita Médica</h1>
<p>ID: ${cita.id}</p>
<p>Paciente ID: ${cita.pacienteid}</p>
<p>Doctor ID: ${cita.doctorid}</p>
<p>Diagnóstico: ${cita.diagnostico}</p>
<p>Fecha: ${cita.fecha}</p>
<p>Tratamiento: ${cita.tratamiento}</p>
<p>Estado: ${cita.estado}</p>
<a href="citaMedica">Volver al Listado</a>
</body>
</html>
