# TP6-Desarrollo-De-Software
# Proyecto de Aplicación REST con Auditoría y Código Genérico

## Descripción

Este proyecto es una aplicación REST desarrollada utilizando **Spring Boot** y **Hibernate**, que incluye controladores, servicios y repositorios para varias entidades mapeadas. La aplicación implementa un diseño genérico para facilitar la reutilización de código y asegura la trazabilidad de los cambios con auditoría mediante **Hibernate Envers**.

### Características principales:
- **Controladores, Servicios y Repositorios Genéricos**: Se generó una clase base para cada uno (controladores, servicios, repositorios) para manejar las operaciones CRUD de manera uniforme para diferentes entidades.
- **Uso de MappedSuperclass**: Se utilizó la estrategia @MappedSuperclass para definir propiedades comunes entre las entidades y optimizar el diseño del modelo de datos.
- **Auditoría con Hibernate Envers**: Se habilitó la auditoría automática para las entidades, permitiendo registrar los cambios realizados en los datos.
- **Query Methods y Consultas Personalizadas**: La entidad `Persona` incluye métodos de consulta específicos mediante **Query Methods** y **@Query** personalizados.
- **Paginación**: Se implementó paginación en los endpoints relacionados con la entidad `Persona` para manejar grandes volúmenes de datos de manera eficiente.
- **Pruebas con Postman**: Se probaron todos los endpoints de la aplicación utilizando Postman para garantizar su correcto funcionamiento.

## Tecnologías Utilizadas

- **Spring Boot** 2.7.14
- **Spring Data JPA**
- **Hibernate Core** 5.6.10.Final
- **Hibernate Envers**
- **MySQL**
- **Lombok**
- **Postman** (para pruebas)

## Estructura General del Proyecto

### Entidades
- @MappedSuperclass para entidades base, incluyendo propiedades comunes como `id`.
- Clases individuales que extienden la entidad base.

### Controladores
- Controladores genéricos con rutas REST.
- Implementaciones específicas para cada entidad.

### Servicios
- Servicios base con métodos genéricos para CRUD.
- Implementaciones específicas que extienden el servicio base.

### Repositorios
- Repositorios base genéricos utilizando **Spring Data JPA**.
- Repositorios específicos para cada entidad.
  
### Auditoría
- Auditoría automática de las entidades, manteniendo un historial de cambios.
