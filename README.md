# logica-programacion-5# Traductor Español-Inglés en Java

## Descripción

Este programa es un pequeño juego de traducción que utiliza un diccionario básico de 20 palabras en español con su traducción al inglés.  
El usuario debe traducir al inglés cinco palabras españolas seleccionadas aleatoriamente.  
El programa verifica las respuestas, cuenta cuántas son correctas e incorrectas, y muestra un resumen final.

---

## Características

- Diccionario implementado con `HashMap` para almacenar pares clave-valor (español → inglés).  
- Selección aleatoria de palabras para que el usuario traduzca.  
- Comparación de respuestas sin distinguir mayúsculas o minúsculas (`equalsIgnoreCase`).  
- Conteo y reporte de respuestas correctas e incorrectas.

---

## Uso

1. Compila el programa:
   ```bash
   javac Traductor.java

## Ejemplo de ejecución

```bash
Traduce las siguientes palabras a español
Traduce 'Consulta' al inglés: query
Correcto!
Traduce 'Filtro' al inglés: filter
Correcto!
Traduce 'Tabla' al inglés: table
Correcto!
Traduce 'Clave' al inglés: key
Correcto!
Traduce 'Campo' al inglés: field
Correcto!

Resultados:
Respuestas correctas: 5
Respuestas incorrectas: 0
