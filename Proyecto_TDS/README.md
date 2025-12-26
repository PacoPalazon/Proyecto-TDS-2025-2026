# Gestión de Gastos

Aplicación de escritorio para la gestión y control de gastos personales.

## 👥 Integrantes del Grupo

- **Nombre 1** - email1@um.es - Subgrupo X
- **Nombre 2** - email2@um.es - Subgrupo X
- **Nombre 3** - email3@um.es - Subgrupo X

## 📝 Descripción

Aplicación JavaFX que permite:
- Registrar gastos personales con categorías
- Gestionar cuentas compartidas
- Configurar alertas de presupuesto
- Visualizar gastos con gráficas
- Importar datos desde archivos externos

## 🚀 Cómo ejecutar

### Requisitos
- Java 21 o superior
- Maven 3.6+

### Ejecución
```bash
mvn clean javafx:run
```

## 📚 Documentación

Ver la carpeta [`docs/`](docs/) para la documentación completa:

- [Diagrama de Clases](docs/diagrama-clases.md)
- [Historias de Usuario](docs/historias-usuario.md)
- [Arquitectura](docs/arquitectura.md)
- [Patrones de Diseño](docs/patrones.md)
- [Manual de Usuario](docs/manual-usuario.md)

## 🏗️ Tecnologías

- **JavaFX 21** - Interfaz gráfica
- **Jackson 2.19.4** - Persistencia JSON
- **Maven** - Gestión de dependencias
- **Guava** - Utilidades (Preconditions)

## 📦 Estructura del Proyecto

```
GestionGastos/
├── src/main/
│   ├── java/es/um/tds/
│   │   ├── app/              # Aplicación principal
│   │   ├── dominio/          # Modelo de negocio
│   │   │   ├── gastos/
│   │   │   ├── alertas/
│   │   │   ├── notificaciones/
│   │   │   └── cuentas/
│   │   ├── repositorio/      # Persistencia
│   │   ├── vista/            # Interfaz JavaFX
│   │   └── importacion/      # Importadores
│   └── resources/            # FXML y recursos
└── docs/                     # Documentación
```

## 🎯 Patrones Implementados

- **Singleton** - App y Repositorios
- **Strategy** - Alertas (Semanal/Mensual)
- **Adapter** - Importación de datos
- **Factory Method** - Creación de importadores
- **Repository** - Acceso a datos

## 📅 Fecha de Entrega

7 de enero de 2026
