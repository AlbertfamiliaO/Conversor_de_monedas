# 💱 Conversor de Monedas en Java

¡Hola! 👋  
Este proyecto forma parte del desafío propuesto por **Alura Latam** dentro de la formación de **Backend con Java**.  
El objetivo es construir una aplicación de consola que permita convertir distintas monedas en tiempo real utilizando una **API de tipo Exchange Rate**. 🚀

---

## 📚 Tecnologías Utilizadas

- **Java** ☕ → Lenguaje de programación principal.  
- **Orientación a Objetos (OOP)** 🧩 → Organización del código en clases y objetos.  
- **APIs REST** 🌐 → Consumo de servicios externos para obtener las tasas de conversión.  
- **JSON (JavaScript Object Notation)** 📑 → Formato en el que la API devuelve los datos.  
- **IntelliJ IDEA** 💻 → Entorno de desarrollo (IDE) recomendado para trabajar el proyecto.  
- **Trello** 📋 → Gestión de tareas y organización del flujo de trabajo con un enfoque ágil.  

---

## ⚙️ Funcionalidades

- Menú interactivo en consola.  
- Conversión entre múltiples monedas (ejemplo: USD, ARS, BRL).  
- Solicitud de valores a convertir directamente desde el input de la persona usuaria.  
- Resultados actualizados gracias al consumo de la **API Exchange Rate**.  
- Ejecución dentro de un **loop (bucle)** para permitir varias conversiones sin reiniciar el programa.  
- Opción de salida segura para finalizar el programa.  

---

## 🛠️ Requisitos Previos

Antes de ejecutar el proyecto, asegúrate de tener instalado en tu computadora:

- [Java 17 o superior](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)  
- [IntelliJ IDEA](https://www.jetbrains.com/idea/) (o cualquier IDE de tu preferencia)  
- Una **API Key gratuita** de [Exchange Rate API](https://www.exchangerate-api.com/)  

---

## 🚀 Cómo Ejecutar el Proyecto

1. **Clona este repositorio**  
   ```bash
   git clone https://github.com/tu-usuario/conversor-monedas-java.git
Importa el proyecto en IntelliJ IDEA (o tu IDE favorito).

Configura tu API Key:

Solicita tu clave en Exchange Rate API.

Reemplaza el valor "YOUR_API_KEY" en el código por tu clave personal.

Ejecuta el programa desde el menú principal del IDE o usando:

bash
Copiar
Editar
java Main
📌 Ejemplo de Uso
mathematica
Copiar
Editar
======================================
 Bienvenido/a al Conversor de Monedas
======================================

Seleccione una opción:
1) Dólar (USD) → Peso Argentino (ARS)
2) Dólar (USD) → Real Brasileño (BRL)
3) Dólar (USD) → Otra moneda
4) Real Brasileño (BRL) → Dólar (USD)
5) Peso Argentino (ARS) → Dólar (USD)
6) Salir

Ingrese una opción: 1
Ingrese el valor que desea convertir: 25

💰 25 USD = 20.293,75 ARS
📋 Gestión de Proyecto con Trello
El desarrollo de este proyecto está acompañado por un tablero en Trello que organiza las tareas en columnas:

📖 Material de apoyo

📝 Backlog (listo para iniciar)

🛠️ En desarrollo

⏸️ Pausado

✅ Concluido

Esta metodología de trabajo ágil fomenta buenas prácticas para proyectos individuales y colaborativos.

⭐ Desafíos Extra
Si quieres llevar el proyecto más allá:

Agrega soporte para más monedas.

Implementa manejo de errores cuando la API no esté disponible.

Crea una interfaz gráfica con Java Swing o JavaFX.

Guarda el historial de conversiones en un archivo .txt o en una base de datos.

👩‍🏫 Créditos
Este desafío forma parte de la formación de Backend con Java en Alura Latam, guiado por la instructora Génesys Rondón.
