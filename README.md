# Conversor de Monedas By-Jhase

<p align="center">
<img src="[/imagen.jpg](https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.colombia.com%2Fcambio-moneda%2F&psig=AOvVaw22GmWIZ7hw46sHWJuqUBAZ&ust=1720240047949000&source=images&cd=vfe&opi=89978449&ved=0CBEQjRxqFwoTCJCO9uaHj4cDFQAAAAAdAAAAABAE)" alt="Logo" width="200"/>
</p>

## Descripción

El Conversor de Monedas By-Jhase es una aplicación Java que permite convertir entre diferentes tipos de monedas utilizando tasas de cambio actualizadas. 
La aplicación interactúa con el usuario a través de una interfaz de consola y realiza consultas a una API de tasas de cambio para obtener las tasas de 
conversión más recientes.

## Funcionalidades

- Conversión entre diversas monedas con tasas de cambio actualizadas.
- Interfaz de usuario en consola para seleccionar las monedas y la cantidad a convertir.
- Opción para convertir otras monedas no predefinidas utilizando códigos de moneda estándar.

## Requisitos

- Java 8 o superior
- Biblioteca Gson para manejo de JSON
- Conexión a internet para realizar consultas a la API de tasas de cambio

## Instalación

1. **Clona este repositorio:**

   ```sh
   git clone https://github.com/tu-usuario/conversor-monedas.git

2. **Navega al directorio del proyecto:**

   ```sh
   cd conversor-monedas
   
3. **Abre el proyecto en IntelliJ IDEA o en tu IDE favorito.**

4. **Asegúrate de tener la biblioteca Gson en tu classpath. Puedes agregarla utilizando Maven o descargándola manualmente.**
   *Si usas Maven, añade la siguiente dependencia en tu 'pom.xml:'*

   ```xml
    <dependency>
      <groupId>com.google.code.gson</groupId>
      <artifactId>gson</artifactId>
      <version>2.8.8</version>
    </dependency>

## Uso
<p align="justify">
Ejecuta la clase principal <code>Principal</code>:
Esta clase presenta un menú interactivo en consola para seleccionar las conversiones deseadas.

- Sigue las instrucciones en pantalla:
- Selecciona la conversión que deseas realizar ingresando el número correspondiente a la opción del menú.
- Ingresa la cantidad de la moneda principal que deseas convertir.
</p>

## Opciones del menú

**1-Dólar => Peso Argentino**

**2-Peso Argentino => Dólar**

**3-Dólar => Real Brasileño**

**4-Real Brasileño => Dólar**

**5-Dólar => Peso Colombiano**

**6-Peso Colombiano => Dólar**

**7-Convertir otro tipo de moneda**

**8-Salir**

## Estructura del Proyecto

- Principal.java: Clase principal que contiene el menú y la lógica de selección de opciones.
- ConsultarMoneda.java: Clase que maneja la consulta a la API de tasas de cambio utilizando HttpClient y Gson para el manejo de JSON.
- ConvertirMoneda.java: Clase que contiene los métodos para realizar las conversiones de moneda.
- Monedas.java: Clase record que representa la estructura de los datos de la moneda obtenidos de la API.

## API Utilizada

Este proyecto utiliza la API de ExchangeRate-API para obtener las tasas de cambio actualizadas. Asegúrate de reemplazar la clave de API 
en ConsultarMoneda con tu propia clave de API si es necesario.

## Ejemplo de Uso

1. **Seleccionar una opción del menú:**

   ```mathematica
   Selecciona la conversión que deseas realizar:
   
   1) Dólar => Peso Argentino
   2) Peso Argentino => Dólar
   3) Dólar => Real Brasileño
   4) Real Brasileño => Dólar
   5) Dólar => Peso Colombiano
   6) Peso Colombiano => Dólar
   7) Convertir otro tipo de moneda
   8) Salir

   Elija una opción válida:

2. **Ingresar la cantidad a convertir:**

   ```css
   Ingrese la cantidad de USD a convertir:

3. **Resultado de la conversión:**

   ```less
   La tasa de conversión para hoy es:
   1 USD es igual a 98.5 ARS
   La cantidad de 100 USD es igual a 9850 ARS  
  
## Contribuciones

¡Las contribuciones son bienvenidas! Si deseas mejorar este proyecto, por favor realiza un fork y envía un pull request con tus mejoras.
