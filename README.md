# Arquitectura hexagonal - Aplicación de de jugadores

Esta aplicación es un ejemplo de un sistema de gestión de tareas que sigue la arquitectura hexagonal. La aplicación permite crear, leer, actualizar y eliminar tareas, así como obtener información adicional de una tarea a través de una API externa.

## Arquitectura hexagonal

La arquitectura hexagonal, también conocida como Ports and Adapters, es un patrón de diseño que busca mantener una separación clara de las responsabilidades en una aplicación, facilitando la adaptabilidad, escalabilidad y mantenibilidad del software. La arquitectura se organiza en tres capas principales:

Dominio: Esta capa contiene las entidades del dominio, que representan los conceptos clave del negocio y sus relaciones, así como la lógica de negocio asociada. Estas entidades son independientes de la infraestructura y la implementación, lo que permite centrarse en las reglas y restricciones del negocio.

Aplicación: Esta capa contiene los casos de uso, que representan las acciones o funcionalidades que la aplicación puede realizar. Los casos de uso coordinan la comunicación entre los puertos de entrada (interfaces que representan las acciones que se pueden realizar desde el exterior) y los puertos de salida (interfaces que representan las acciones que la aplicación puede realizar hacia el exterior, como interactuar con bases de datos o servicios externos).

Infraestructura: Esta capa contiene los adaptadores y la implementación de los puertos de salida, así como la configuración y la interacción con servicios externos. Los adaptadores son responsables de convertir las solicitudes externas en llamadas a los casos de uso y de convertir las respuestas de los casos de uso en respuestas comprensibles para los sistemas externos.

La arquitectura hexagonal se adhiere a los principios SOLID:

**Single Responsibility Principle (SRP):** Cada capa tiene una responsabilidad única y bien definida, lo que evita la mezcla de responsabilidades y facilita el mantenimiento del código.

**Open/Closed Principle (OCP):** Las entidades y los casos de uso están abiertos a la extensión pero cerrados a la modificación. Si se necesita agregar una nueva funcionalidad, se puede hacer extendiendo los casos de uso o creando nuevos adaptadores sin modificar el código existente.

**Liskov Substitution Principle (LSP):** Los adaptadores y las implementaciones de los puertos deben ser sustituibles sin afectar el comportamiento del sistema, lo que permite cambiar fácilmente entre diferentes implementaciones de infraestructura o servicios externos.

**Interface Segregation Principle (ISP):** Los puertos de entrada y salida definen interfaces pequeñas y específicas para cada funcionalidad, lo que facilita la implementación de adaptadores y evita depender de interfaces innecesariamente grandes.

**Dependency Inversion Principle (DIP):** Las dependencias entre las capas se invierten mediante la inyección de dependencias, lo que permite a las capas de dominio y aplicación depender de abstracciones en lugar de implementaciones concretas.

## Rutas de la API

A continuación se enumeran las rutas de la API con sus métodos HTTP correspondientes y ejemplos de entrada:

1. Crear una tarea
   Método: POST
   Ruta: /api/tasks
   Input: JSON con la información de la tarea (nombre y email)

```
{
   "name": "Ejemplo de nombre",
   "email": "Ejemplo de email"
}
```


### Two branches
- Main --> By the book 
- Simplified ports option
