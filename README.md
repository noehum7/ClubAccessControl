# Control de Acceso a Club

## Descripción
Este proyecto simula un sistema de control de acceso para un club con múltiples puertas de entrada y salida, implementado en Java utilizando programación concurrente.

## Características
- Aforo máximo controlado (10 personas)
- Múltiples puertas de entrada y salida funcionando simultáneamente
- Control de concurrencia mediante sincronización de hilos
- Simulación de tiempos de entrada y salida

## Estructura del Proyecto
- [`ControlAcceso.java`](src/ControlAcceso.java): Clase principal que gestiona el aforo
- [`Puerta.java`](src/Puerta.java): Implementación de las puertas como hilos
- [`Main.java`](src/Main.java): Clase principal que inicia la simulación

## Requisitos
- Java JDK 17
- IDE compatible con Java (IntelliJ IDEA recomendado)

## Funcionamiento
El sistema simula:
- 2 puertas de entrada
- 2 puertas de salida
- Control de aforo máximo de 10 personas
- Tiempo de espera de 1 segundo entre entradas
- Tiempo de espera de 3 segundos entre salidas

## Cómo Ejecutar
1. Clone el repositorio
2. Abra el proyecto en su IDE
3. Ejecute la clase `Main.java`

## Tecnologías Utilizadas
- Java 17
- Programación concurrente
- Sincronización de hilos
