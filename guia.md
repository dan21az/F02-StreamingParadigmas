# Guía para el trabajo en grupo - StreamingParadigmas

## Consigna general

El equipo debe analizar el código entregado y determinar qué partes del proyecto corresponden a cada paradigma de programación.

Posteriormente deben proponer y aplicar cambios para que el proyecto sea lo más cercano posible a **OOP puro**. Si hay elementos que no pueden transformarse totalmente en OOP puro, deben justificar por qué y explicar cómo cambiaron el código.

Cada integrante debe crear su propia rama para cambiar el paradigma que le tocó.

---

## Tareas que deben hacer

1. Crear un archivo `README.md` en el repositorio principal.
2. Identificar los paradigmas utilizados en el proyecto actual.
3. Refactorizar el código para que sea OOP puro, usando únicamente:
   - clases
   - atributos
   - métodos
4. Si existen partes que no se pueden convertir en OOP puro, justificar el motivo.
5. Cada integrante debe crear una rama propia para trabajar en el cambio del paradigma que le fue asignado.
6. Al final, escribir una reflexión grupal sobre:
   - ¿Qué se gana cuando obligamos un sistema multiparadigma a convertirse en OOP puro?
   - ¿Qué se pierde?

---

## Contenido que debe tener el `README.md`

El archivo `README.md` debe incluir como mínimo:

1. **Tabla de identificación de paradigmas**
   - Indicar qué partes del proyecto corresponden a cada paradigma. Estructurado, Funcional, Orientado a Eventos o .
   - Ejemplo: estructura de clases, uso de funciones libres, listeners, manejo de datos, etc.

2. **Justificación breve**
   - Explicar por qué cada parte del código pertenece a ese paradigma.
   - Si aplicaron cambios, describir brevemente qué se modificó.

3. **Diagrama de clases OOP puro**
   - Incluir un diagrama de clases que muestre las clases principales y sus relaciones.
   - Puede ser un dibujo simple en ASCII, una imagen / diagrama externo, o una descripción textual clara de las clases, atributos y métodos.

4. **Refactorización de una parte del código**
   - Seleccionar una parte concreta del código original.
   - Mostrar cómo se refactorizó para que sea OOP puro.
   - Explicar el cambio y por qué mejora la orientación a objetos.

---

## Instrucciones para el trabajo en rama

Cada integrante debe:

1. Crear una rama nueva a partir de la rama principal (`main` o `master`).
2. Nombrar la rama con el formato: `paradigma-<nombre>` o `oop-<nombre>`.
3. Realizar el cambio en su rama.
4. Documentar en el `README.md` y en un comentario breve del commit qué parte del paradigma trabajó.
5. Subir la rama al repositorio remoto.
6. Unificar todas las ramas y que funcione correctamente el proyecto.
