# ORT-Programacion2.Obl2
Obligatorio2

Gestión de Personal
Una consultora necesita un sistema para la gestión de postulantes en diversos llamados a puestos de trabajo.
En esta primera versión, en el sistema debe ser posible:
a) Registro de temática: Incluye nombre del tema (único) y descripción.

b) Alta de postulante: Se ingresa nombre, cédula (única), dirección, teléfono, mail y link a linkedin. También se indica si busca
trabajo remoto, presencial o mixto. Para agregar el nivel de los temas que conoce, se abre una nueva ventana. En esa ventana,
se elige cada tema que conoce e indica el nivel (de 1- básico a 10-experto). Puede elegir uno o varios temas y también borrar
alguno que haya indicado.

c) Baja de postulante. Se elige el postulante de una lista y se elimina, junto con toda la información asociada (ej. entrevistas que
realizó).

d) Registro de evaluador: Se indica nombre, cédula (única), dirección y año de ingreso a la empresa.

e) Ingreso de entrevista: Se elige el evaluador y el postulante de listas, se ingresa el puntaje (0-100) y comentarios de la entrevista.
Se asigna automáticamente un número correlativo de entrevista que debe ser informado al registrar. Cada postulante puede ser
entrevistado por el mismo o diferente evaluador varias veces.

f) Registro de puesto: Se indica el nombre del puesto (único), tipo (remoto, presencial, mixto) y los temas requeridos. No se
indica el nivel requerido en cada tema al registrar el puesto.

g) Consulta para puesto: Se elige un puesto de una lista, se indica el nivel (1 a 10) y en una lista se muestran los postulantes que
hayan tenido al menos una entrevista, que coincidan con la forma de trabajo y que tengan ese nivel o más en todos los temas
del puesto (no es relevante si el postulante tiene otros conocimientos). La lista de postulantes se ordena decrecientemente por
el puntaje de su última entrevista. Debe haber un botón para exportar esa lista de postulantes al archivo "Consulta.txt" en la
misma carpeta del proyecto. La primera línea del archivo contiene el nombre del puesto. Luego viene en cada línea el postulante
(nombre, cédula y mail), en el mismo orden que en pantalla.

h) Historia de postulante: Se elige un postulante de una lista (se muestran ordenados crecientemente por cédula) y se muestran
todos sus datos (al hacer clic en el link de linkedin debe abrirse en un browser). Incluir los temas que conoce y su nivel. También
se debe mostrar en una tabla todas las entrevistas que tuvo, ordenadas crecientemente por número. Es posible buscar un texto
entre los comentarios de sus entrevistas. Para ello ingresar el texto y destacarlo con color en las filas de la tabla de aquellas
entrevistas que lo contengan.

i) Consulta por temática: Mostrar en pantalla la lista de temáticas (se ve nombre) y al seleccionar una, se muestra las siguientes
estadísticas:
▪ Cantidad de postulantes que tiene un nivel mayor a 5 en esta temática.
▪ Cantidad de puestos que buscan que requieran conocimiento en esta temática

j) Fin
A los efectos de la prueba del sistema se debe consultar al ingreso:
▪ si se toman los datos guardados anteriormente
▪ si se parte de un sistema vacío

Se pide:
Implementar en Java un sistema para brindar todas las funcionalidades presentadas. La interfaz debe ser estilo Windows, en ventanas
independientes. El sistema debe ser persistente (en forma automática) y realizar todas las validaciones necesarias. Se valorará que
toda la información esté permanentemente actualizada en pantalla. Entregar además un archivo .jar que contenga toda la aplicación
para funcionar correctamente.
Para la entrega: subir un archivo zip/rar de hasta 40 MB con tres carpetas:
a) carpeta del código. Dentro debe estar el proyecto completo en NetBeans, incluyendo los fuentes java. Los fuentes deben incluir
el nombre de los autores.
b) carpeta del ejecutable. Contiene exclusivamente el archivo .jar, sin datos precargados.
