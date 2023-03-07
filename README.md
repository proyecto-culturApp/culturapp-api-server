# Template MVC Service

Repositorio base para la creación de microservicios escritos en Spring Boot MVC

# Tech Stack
* Java 11
* Spring Boot (web)
* Gradle
* Junit
* Sonar
* Jacoco

# Puesta a punto del template para un nuevo microservicio
- application.yml
  - Cambiar nombre del proyecto ```spring.application.name```
- settings.gradle
  - Cambiar el nombre raíz del proyecto: ```rootProject.name```
- build.gradle
  - Cambiar propiedad ```group```
  - Cambiar propiedad ```bootJar -> mainClass```
- Variables de github

# Modos de Ejecución

El micro se puede levantar de 3 maneras, exponiendo los servicios en el puerto [http://localhost:1989](http://localhost:1989)

### IDE

Desde intellij, ejecutando la clase AppStarter.java que se encuentra en el módulo assembler

### Spring boot gradle task

```
$ ./gradlew clean build
$ ./gradlew bootRun
```

### distribución binaria

```
$ ./gradlew clean build
$ java -jar /build/libs/f1rst-log-service.jar
``
