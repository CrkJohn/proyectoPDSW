
# Escuela Colombiana de Ingenier�a
# Procesos de desarrollo de Software, PDSW 2018-2
# BANCO DE INICIATIVAS DE PROYECTOS
#
##### INTEGRANTES: Santiago Rocha, Diego Carvajal, Ana Rinc�n, Karen Dur�n 
##### PROFESOR: Francisco Ch�ves 
#
#
La Plataforma banco de iniciativas de proyectos, es una herramienta donde la comunidad universitaria de la Escuela Colombiana de Ingenier�a Julio Garavito pueden registrar sus iniciativas e ideas de proyectos para ser desarrollados o gestionados por la PMO de la Escuela. El sistema, m�s all� de facilitar el registro de las iniciativas e ideas de proyectos, es una valiosa base de conocimiento donde los diferentes actores pueden revisar si hay iniciativas, ideas o intereses similares y aunar esfuerzos para la materializaci�n. Adicional a lo anterior, el personal acad�mico puede integrar a los estudiantes de diferentes asignaturas o proyectos de grado para su realizaci�n, materializando las iniciativas para el beneficio de toda la comunidad universitaria. La PMO puede priorizar las iniciativas viables, asignar responsables, gestionar la asignaci�n de recursos, llevar m�tricas e identificar grupos de inter�s -a trav�s del tiempo- que se van presentando para cada iniciativa. Con esto se espera lograr no solo la realizaci�n de los proyectos sino una aplicaci�n pr�ctica de los conocimientos adquiridos por los estudiantes dentro de las asignaturas de la Escuela generando un ambiente de aprendizaje colaborativo.


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
1 En espera de revisi�n
2 En revisi�n
3 Proyecto
4 Solucionado

Proponente:
Registrar de una iniciativa o idea: Importante guardar la referencia a los datos del usuario para poder ser contactados, incluyendo su �rea o dependencia.
Consultar las ideas o iniciativas que el proponente ha realizado
Modificar una iniciativa o idea siempre y cuando se encuentre en el estado �propuesta�.
 
P�blico:
Consultar la informaci�n de las diferentes ideas o iniciativas 
Poder mostrar su inter�s o afinidad con el desarrollo de una idea o iniciativa de proyecto que se encuentre en el banco y dejar comentarios u observaciones al mismo. 
Votar (dar like) sobre una idea o iniciativa.
Indicar la intenci�n de trabajar o apoyar el desarrollo de la iniciativa o idea de proyecto, es decir, que le interesa
Consultar las ideas o iniciativas de acuerdo a palabras clave
Entregar estad�sticas con base en la informaci�n registrada.
 
Administrador:
Consulta de toda la informaci�n relacionada con las ideas o iniciativas. Permitir hacer la consulta de las ideas o iniciativas por �reas, dependencia, palabras clave.
Incorporar al informe diferentes estad�sticas.
* Porcentaje de ideas de las diferentes �reas o dependencias.
* Cantidad de proyectos relacionados por cada uno de los estados.
Ideal que todas estas consultas puedan ser descargadas en excel o pdf. Posiblemente se tengan gr�ficos estad�sticos que permitan visualizar la informaci�n anterior.

Todas las consultas deben tener al menos la siguiente informaci�n: Id, nombre de la iniciativa, el estado, el n�mero de votos, el nombre, el usuario y el email del proponente, el �rea o dependencia, la fecha de creaci�n de la iniciativa.

# Arquitectura y dise�o detallado.
### Modelo E-R: 
![alt text](https://github.com/Santiago-Rocha/proyectopdsw/img/ModeloE-R.png "Logo Title Text 1")
### Diagrama de Clases:
![alt text](https://github.com/Santiago-Rocha/proyectopdsw/img/DiagramaDeClases.png "Logo Title Text 1")
### Heroku:
[Aqu� se encuentra la aplicaci�n desplegada en heroku](https://proyectodask.herokuapp.com/)

# Descripci�n del proceso

La metodolog�a utilizada fue SCRUM, una de las metodolog�a agiles que existen hoy en d�a. Consta de 3 participantes: El scrum master, el product owner y el equipo. En esta actividad, el profesor de la clase hizo el papel del product ownner, Santiago Rocha hizo el papel del Scrum Master y los 4 fuimos el equipo de trabajo.
[Enlace de Trello](https://trello.com/b/NoLw4yps/banco-de-iniciativas-e-ideas-de-proyectos)



