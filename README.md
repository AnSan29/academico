# Proyecto Académico

Este proyecto es una aplicación de escritorio desarrollada en **Java** utilizando **Swing** para la interfaz gráfica de usuario (GUI) y **Maven** como herramienta de gestión de dependencias y construcción de proyectos. Su propósito es la gestión básica de notas de estudiantes, permitiendo registrar nuevos alumnos, guardar sus calificaciones y realizar cálculos, como el promedio de notas.

---

## Estructura del Proyecto

El proyecto sigue una estructura de directorios estándar de Maven. A continuación se detallan los directorios y archivos principales para una mejor comprensión de la arquitectura del software:

-   `pom.xml`: Es el corazón del proyecto Maven. Define las dependencias, la configuración de compilación y los metadatos del proyecto.
-   `src/`: Contiene todo el código fuente del proyecto.
    -   `main/`: Contiene el código fuente principal de la aplicación.
        -   `java/`: Directorio raíz para todos los paquetes Java.
            -   `com/mycompany/academico/`: Paquete principal del proyecto.
                -   `Academico.java`: **Clase principal** y punto de entrada de la aplicación. Se encarga de iniciar la interfaz de login.
                -   `domain/`: Contiene las clases que representan los objetos de negocio o **modelo de datos**.
                    -   `Estudiante.java`: Clase que modela a un estudiante, incluyendo sus datos personales (nombre, edad) y una lista de notas.
                    -   `Nota.java`: Clase que representa una calificación, asegurando que su valor se mantenga en un rango válido.
                -   `service/`: Contiene la lógica de negocio, separada de la interfaz de usuario y del modelo.
                    -   `ArchivoService.java`: Maneja la lectura y escritura de datos.
                    -   `CalculoService.java`: Provee métodos para realizar cálculos, como el promedio de notas.
                -   `ui/`: Contiene las clases y archivos de la **interfaz de usuario (GUI)**.
                    -   `LoginFrame.form`: Archivo de diseño del formulario de inicio de sesión, generado por el editor de GUI.
                    -   `LoginFrame.java`: Lógica de la ventana de inicio de sesión. Maneja la validación de credenciales.
                    -   `RegistroEstudianteFrame.form`: Archivo de diseño para la ventana de registro de estudiantes.
                    -   `RegistroEstudianteFrame.java`: Lógica de la ventana para registrar, visualizar y gestionar los datos de los estudiantes.

---

## Dependencias

El proyecto utiliza **Maven** para gestionar sus dependencias. La principal dependencia es el **Java Development Kit (JDK)**, versión 8 o superior, que incluye la biblioteca **Swing** utilizada para la GUI.

---

## Instalación y Ejecución

Sigue estos pasos para poner en marcha el proyecto:

### Prerrequisitos
-   **Java JDK** (versión 8+ instalada y configurada).
-   **Apache Maven** (versión 3.x+ instalada y configurada).
-   Un IDE como **Apache NetBeans** o **IntelliJ IDEA**.

### Pasos de Instalación
1.  **Clona el repositorio** o descarga el código fuente.
2.  Abre el proyecto en tu IDE preferido.
3.  El IDE, al ser un proyecto Maven, debería descargar automáticamente las dependencias. Si no, puedes usar la línea de comandos para compilarlo:
    ```bash
    mvn clean install
    ```

### Ejecución
-   **Desde el IDE**: Ejecuta la clase `Academico.java`.
-   **Desde la terminal**: Navega al directorio raíz del proyecto y ejecuta el archivo JAR generado en el directorio `target/`.
    ```bash
    java -jar target/academico-1.0-SNAPSHOT.jar
    ```

---

## Funcionamiento de la Aplicación

1.  **Inicio**: Al ejecutar la aplicación, se mostrará una ventana de **Login**. Las credenciales de acceso son:
    -   **Usuario**: `admin`
    -   **Contraseña**: `1234`
2.  **Registro de estudiantes**: Tras un inicio de sesión exitoso, se abre la ventana de **Registro de Estudiantes**. Aquí puedes introducir los datos de un estudiante, incluyendo sus tres notas.
3.  **Procesamiento de datos**: Una vez registrados, los datos del estudiante se procesan y se pueden realizar operaciones como el cálculo del promedio, la visualización de la lista de estudiantes, y más.