# Método-Gauss-Java

## Descripción
Este proyecto contiene una implementación del Método de Gauss para la resolución de un sistema de ecuaciones lineales mediante el lenguaje de programación Java.
El programa utiliza una estructura modular, separando la lógica del método numérico, la definición de los datos de entrada y la clase principal encargada de ejecutar el programa.

## Lenguaje de programación
- Java

## Estructura del proyecto
El proyecto está compuesto por las siguientes clases:

- **Gauss.java:** contiene los métodos correspondientes a la eliminación gaussiana y la sustitución regresiva.
- **DefinicionMatriz.java:** contiene la matriz aumentada utilizada como entrada para el sistema de ecuaciones.
- **LanzadorGaus.java:** contiene el método principal `main` y coordina la ejecución del programa.

## Compilación
Para compilar el programa desde la terminal, ubicarse en la carpeta donde se encuentran los archivos `.java` y ejecutar:
```
javac Gauss.java DefinicionMatriz.java LanzadorGaus.java
```

## Ejecución
Después de compilar los archivos, ejecutar la clase principal mediante:
```
java LanzadorGaus
```

## Ejemplo de prueba
Para realizar la prueba se utiliza la siguiente matriz aumentada:
```
 3.0   -0.1   -0.2    7.85
 0.1    7.0   -0.3  -19.3
 0.3   -0.2   10.0   71.4
```
El programa aplica la eliminación gaussiana y posteriormente la sustitución regresiva para obtener las soluciones del sistema.

### Salida por consola
```
Soluciones del sistema:
x1 = 3.0
x2 = -2.5
x3 = 7.000000000000002
```

## Resultado
El programa obtiene las soluciones correspondientes al sistema de ecuaciones utilizado como prueba:
- x1 = 3.0
- x2 = -2.5
- x3 = 7.000000000000002
