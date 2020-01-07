# RetoCompra
 Contiene la solucion para una precompra de un producto en la pagina plazavea.com validando que este quede en el carrito de compras

Un proyecto donde se ejemplifica el uso del patrón screenplay en una aplicación web screenplay  con cucumber y gradle.


Pre-requisitos
-El ejecutable de Chrome driver en la última versión y crear la variable de entorno. -Java v.1.8.0_231 y JDK (variables de entorno configuradas) -Instalar Intellij IDEA 2019.3.1 -Instalar Gradle v6.0.1 o superior (variables de entorno configuradas).
Detalles generales de la implementación
Los tests usan tareas (tasks), interacciones (interactions), preguntas (questions), elementos de paginas (user_interface),excepciones(exceptions).

La estructura completa del proyecto es la siguiente:

+ exceptions
    Clases que controlan las posibles excepciones técnicas y de negocios que se presentan durante la ejecución de pruebas

+ tasks
    Clases que representan tareas que realiza el actor a nivel de proceso de negocio

+ interacion
    Clases que representan las interacciones directas con la interfaz de usuario

+ userinterface
    Page Objects y Page Elements. Mapean los objetos de la interfaz de usuario

+ questions
    Objetos usados para consultar acerca del estado de la aplicación

+ runners
    Clases que permiten correr los tests

+ step definitions
    Clases que mapean las líneas Gherkin a código java

+ features
    La representación de las historias en archivos cucumber
Requerimientos
Para correr el proyecto se necesita Java JDK 1.8.0_231 y Gradle preferiblemente con la versión 6.0.1

Para correr el proyecto
clean test aggregate es el comando que correrá los tests y generará el reporte en la carpeta /target/site/serenity/