# 💱 Conversor de Monedas - Desafío de Programación Java

Este es un proyecto de **conversor de monedas** desarrollado en Java, como parte de un desafío de programación. El programa permite consultar en tiempo real el valor de distintas monedas utilizando una API externa de tasas de cambio.

---

## 🧠 Aprendizajes

Durante el desarrollo de este proyecto se aplicaron los siguientes conceptos:

- Configuración de ambiente Java y estructura de proyecto.
- Consumo de una API REST con `HttpClient`.
- Análisis y manipulación de respuestas JSON usando `Gson`.
- Filtrado y selección de monedas de interés.
- Interacción con el usuario desde consola.
- Diseño orientado a objetos con clases como `Moneda` y `ApiMonedas`.

---

## 🔧 Tecnologías utilizadas

- Java 17+
- API de tipo de cambio: [ExchangeRate-API](https://www.exchangerate-api.com/)
- IntelliJ IDEA (u otro IDE Java)
- Git y GitHub

---
## 📦 Estructura del proyecto

├── src/
│   ├── ApiMonedas.java       # Lógica para consumir la API de tipo de cambio
│   ├── Moneda.java           # Clase que representa una moneda
│   └── Principal.java        # Clase principal con menú interactivo
└── README.md

## 🖥️ Funcionalidades del menú

  1-  Dólar → Peso Argentino

  2-  Peso Argentino → Dólar

  3-  Dólar → Real Brasileño

  4-  Real Brasileño → Dólar

  5-  Dólar → Peso Colombiano

  6-  Peso Colombiano → Dólar

  7-  Salir

Cada opción solicita una cantidad y realiza la conversión en tiempo real usando datos actualizados desde la API.

## 🛑 Notas importantes

  Asegúrate de tener conexión a internet para consumir la API.

  Si la API no responde o excede el límite de uso, el programa mostrará un error de conexión.

## 📸 Capturas de pantalla



 ![imagen](https://github.com/user-attachments/assets/c1ac5f40-f29b-4bcc-befa-ac10d0f7a566)

 ![imagen](https://github.com/user-attachments/assets/90b2a31b-e6d3-4f66-9264-f35170371386)


 ![imagen](https://github.com/user-attachments/assets/b79e4e0b-ae67-4f2c-98c3-4544b18cb485)

 ![imagen](https://github.com/user-attachments/assets/e3ff5db9-3db5-498d-bd7b-5e3f03db42ca)

 ![imagen](https://github.com/user-attachments/assets/0f80b073-aa93-403e-8dee-424d0e795685)









