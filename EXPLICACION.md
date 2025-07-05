# Práctica de Arboles

## 📌 Información General

- *Título: Práctica de Arboles
- *Asignatura: Estructura de Datos
- *Carrera: Computación
- *Estudiante: Ariel Badillo
- *Fecha: 05/07/2025
- *Profesor:* Ing. Pablo Torres

---

## 🛠️ Descripción

-  Este proyecto implementa diversas operaciones y algoritmos sobre estructuras de datos tipo árbol binario en Java, incluyendo:

-  Inserción en Árbol Binario de Búsqueda BST

-  Invertir un Árbol Binario

-  Listar los nodos por niveles con recorrido por niveles

-  Calcular la profundidad máxima del árbol


## 🚀 Ejecución

- *Para ejecutar el proyecto:

1. Compila el código:
    bash
    javac App.java
    
2. Ejecuta la aplicación:
    bash
    java App
    

---

## 🧑‍💻 Salida

- EJERCICIO 1  
- Input: [5, 3, 7, 2, 4, 6, 8]
- Output:
- 5 
- 3 7 
- 2 4 6 8 

- EJERCICIO 2
- Input: 
- 4 
- 2 7 
- 1 3 6 9 
- Output:
- 4 
- 7 2 
- 9 6 3 1 

- EJERCICIO 3
- Input: 
- 4 
- 2 7 
- 1 3 6 9 
- Output:
- 4 
- 2 7
- 1 3 6 9

- EJERCICIO 4
- Input:
- 4
- 2 7
- 1 3
- 8
- Output: 4

##  Explicacion Metodo Ejercicio 1 

- El metodo insert inserta un valor en un arbol binario de búsqueda recursivamente primero verifica si el nodo actual root es nulo si es asi, crea y retorna un nuevo nodo con el valor dado, si el valor a insertar es menor que el valor del nodo actual, el metodo se llama recursivamente para insertar en el subarbol izquierdo y si es mayor, se inserta en el subárbol derecho. Finalmente, devuelve el nodo raiz actualizado.

##  Explicacion Metodo Ejercicio 2 

- El metodo invertTree invierte un arbol binario recursivamente primero, verifica si el nodo actual root es nulo si es asi, retorna null, terminando la rama luego, llama recursivamente a si mismo para invertir el subarbol izquierdo y el derecho, almacenando los resultados en left y right y despues, intercambia los hijos del nodo actual, asignando el subarbol derecho invertido a la izquierda y el izquierdo invertido a la derecha. Finalmente, retorna el nodo raiz actualizado. 

##  Explicacion Metodo Ejercicio 3

- El metodo listLevels realiza un recorrido por niveles en un arbol binario, retornando una lista de listas con los nodos de cada nivel primero, verifica si la raiz es nula si es asi, devuelve una lista vacia ya que usa una cola para almacenar nodos por procesar empezando con la raiz mientras la cola no este vacia, procesa todos los nodos del nivel actual según el tamaño de la cola, añadiendolos a una lista temporal y encolando sus hijos izquierdo y derecho. Finalmente, agrega cada lista de nivel al resultado y lo retorna completo.

##  Explicacion Metodo Ejercicio 4 

- El metodo maxDepth calcula la altura maxima de un arbol binario de forma recursiva si el nodo es null, retorna 0, para cada nodo, obtiene la profundidad maxima de sus subarboles izquierdo y derecho, luego devuelve el mayor valor sumando 1 para incluir el nivel actual asi determina la altura total del arbol desde la raiz hasta el ultimo nivel donde hay un nodo hijo.

##  Explicacion Del Main

- El metodo maxDepth calcula la altura maxima de un arbol binario de forma recursiva si el nodo es null, retorna 0, para cada nodo, obtiene la profundidad maxima de sus subarboles izquierdo y derecho, luego devuelve el mayor valor sumando 1 para incluir el nivel actual asi determina la altura total del arbol desde la raiz hasta el ultimo nivel donde hay un nodo hijo.