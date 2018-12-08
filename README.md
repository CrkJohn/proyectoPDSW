
# Escuela Colombiana de Ingeniería
# Procesos de desarrollo de Software, PDSW 2018-2
# BANCO DE INICIATIVAS DE PROYECTOS
#
[![CircleCI](https://circleci.com/gh/Santiago-Rocha/proyectoPDSW.svg?style=svg)](https://circleci.com/gh/Santiago-Rocha/proyectoPDSW)
#
##### INTEGRANTES: Santiago Rocha, Diego Carvajal, Ana Rincón, Karen Durán 
##### PROFESOR: Francisco Cháves 
#
#
La Plataforma banco de iniciativas de proyectos, es una herramienta donde la comunidad universitaria de la Escuela Colombiana de Ingeniería Julio Garavito pueden registrar sus iniciativas e ideas de proyectos para ser desarrollados o gestionados por la PMO de la Escuela. El sistema, más allá de facilitar el registro de las iniciativas e ideas de proyectos, es una valiosa base de conocimiento donde los diferentes actores pueden revisar si hay iniciativas, ideas o intereses similares y aunar esfuerzos para la materialización. Adicional a lo anterior, el personal académico puede integrar a los estudiantes de diferentes asignaturas o proyectos de grado para su realización, materializando las iniciativas para el beneficio de toda la comunidad universitaria. La PMO puede priorizar las iniciativas viables, asignar responsables, gestionar la asignación de recursos, llevar métricas e identificar grupos de interés -a través del tiempo- que se van presentando para cada iniciativa. Con esto se espera lograr no solo la realización de los proyectos sino una aplicación práctica de los conocimientos adquiridos por los estudiantes dentro de las asignaturas de la Escuela generando un ambiente de aprendizaje colaborativo.


# Detalles provistos por el Stakeholder.


El objetivo del sistema es permitir el registro y seguimiento de las iniciativas e ideas de proyectos que han sido propuestas por la comunidad universitaria de la Escuela. El banco de iniciativas debe contar con una interfaz de usuario bonita y amigable con los usuarios.
 
Tipos de usuario:
Administrador
Personal PMO - ODI
Proponente de iniciativa o idea de proyecto
Usuarios de consulta
 
Administrador:
Modificar el Estado de las ideas o iniciativas.
Agrupamiento de las ideas o iniciativas equivalentes o relacionadas

Personal PMO - ODI:
Consultar las iniciativas o ideas de proyectos que los proponentes han publicado.
Cambiar el estado de las iniciativas
	
	
Estado de la Iniciativa
1 En espera de revisión
2 En revisión
3 Proyecto
4 Solucionado

Proponente:
Registrar de una iniciativa o idea: Importante guardar la referencia a los datos del usuario para poder ser contactados, incluyendo su área o dependencia.
Consultar las ideas o iniciativas que el proponente ha realizado
Modificar una iniciativa o idea siempre y cuando se encuentre en el estado “propuesta”.
 
Público:
Consultar la información de las diferentes ideas o iniciativas 
Poder mostrar su interés o afinidad con el desarrollo de una idea o iniciativa de proyecto que se encuentre en el banco y dejar comentarios u observaciones al mismo. 
Votar (dar like) sobre una idea o iniciativa.
Indicar la intención de trabajar o apoyar el desarrollo de la iniciativa o idea de proyecto, es decir, que le interesa
Consultar las ideas o iniciativas de acuerdo a palabras clave
Entregar estadísticas con base en la información registrada.
 
Administrador:
Consulta de toda la información relacionada con las ideas o iniciativas. Permitir hacer la consulta de las ideas o iniciativas por áreas, dependencia, palabras clave.
Incorporar al informe diferentes estadísticas.
* Porcentaje de ideas de las diferentes áreas o dependencias.
* Cantidad de proyectos relacionados por cada uno de los estados.
Ideal que todas estas consultas puedan ser descargadas en excel o pdf. Posiblemente se tengan gráficos estadísticos que permitan visualizar la información anterior.

Todas las consultas deben tener al menos la siguiente información: Id, nombre de la iniciativa, el estado, el número de votos, el nombre, el usuario y el email del proponente, el área o dependencia, la fecha de creación de la iniciativa.

# Arquitectura y diseño detallado.
### Modelo E-R: 
![alt text](https://github.com/Santiago-Rocha/proyectoPDSW/blob/master/img/ModeloE-R.png "Modelo E-R")
### Diagrama de Clases:
![alt text](https://github.com/Santiago-Rocha/proyectoPDSW/blob/master/img/DiagramaDeClases.png "Diagrama de clases")
### Heroku:
[Aquí se encuentra la aplicación desplegada en heroku](https://proyectodask.herokuapp.com/)

# Descripción del proceso

La metodología utilizada fue SCRUM, el framework de desarrollo ágil más extendido. Se trata de un método iterativo e incremental en el que se divide el desarrollo de un producto en ciclos. En cada uno de estos ciclos, llamados sprints, el equipo trabaja sobre una lista de requisitos priorizada. Al final de dicho ciclo, el resultado debe ser un producto terminado y entregable. 
Scrum se basa en los siguientes principios:
* Colaboración estrecha con el cliente.
* Predisposición y respuesta al cambio.
* Prefiere el conocimiento tácito de las personas al explícito de los procesos.
* Desarrollo incremental con entregas funcionales frecuentes.
* Comunicación verbal directa entre los implicados en el proyecto.
* Motivación y responsabilidad de los equipos por la auto-gestión, auto-organización y compromiso.
* Simplicidad. Supresión de artefactos innecesarios en la gestión del proyecto.
#
Consta de 3 participantes: El scrum master, el product owner y el equipo. En esta actividad, el profesor hizo el papel del Product Owner, Santiago Rocha hizo el papel del Scrum Master y los 4 fuimos el equipo de trabajo.
#
[Enlace de Trello](https://trello.com/b/NoLw4yps/banco-de-iniciativas-e-ideas-de-proyectos)

#
### Sprint 1
##### Sprint-Backlog
![alt text](https://github.com/Santiago-Rocha/proyectoPDSW/blob/master/img/Sprint1.png "Sprint-Backlog1")
##### Sprint-Burndown Chart
![alt text](https://github.com/Santiago-Rocha/proyectoPDSW/blob/master/img/chart1.png "SprintBurndown1")

### Sprint 2
##### Sprint-Backlog
![alt text](https://github.com/Santiago-Rocha/proyectoPDSW/blob/master/img/Sprint2.png "SprintBacklog2")
##### Sprint-Burndown Chart
![alt text](https://github.com/Santiago-Rocha/proyectoPDSW/blob/master/img/chart2.png "SprintBurndown2")

### Sprint 3
##### Sprint-Backlog
![alt text](https://github.com/Santiago-Rocha/proyectoPDSW/blob/master/img/Sprint3.png "SprintBacklog3")
##### Sprint-Burndown Chart
![alt text](https://github.com/Santiago-Rocha/proyectoPDSW/blob/master/img/chart3.png "SprintBurndown3")




