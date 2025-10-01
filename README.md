# Spring Boot Htmx Example

This example demonstrates **htmx in a Spring Boot app with a Thymeleaf frontend.** It contains CRUD functionality for managing contacts with a name, email and birthday.

![Contact form backed by htmx](https://s3-eu-central-1.amazonaws.com/bootify-prod/ext/img/templates/htmxExample.png)

Htmx is integrated via its WebJar `org.webjars.npm:htmx.org`. Because of the attribute `hx-boost="true"` at the body tag of the `layout.html`, all links and forms of this example are submitted via AJAX and the whole page feels like an SPA. The `HtmxErrorController` allows the client to properly display error pages. Learn more about [htmx with Spring Boot and Thymeleaf](https://bootify.io/frontend/htmx-with-spring-boot-thymeleaf.html) and [htmx error handling in Spring Boot](https://bootify.io/frontend/htmx-error-handling-in-spring-boot.html).

Create **your own application with Thymeleaf or JTE frontend and htmx** - directly in the browser, no registration required. Add webpack, define a custom database schema and much more on [Bootify.io](https://bootify.io).

## Development

Update your local database connection in `application.yml` or create your own `application-local.yml` file to override settings for development.

During development it is recommended to use the profile `local`. In IntelliJ `-Dspring.profiles.active=local` can be added in the VM options of the Run Configuration after enabling this property in "Modify options".

After starting the application it is accessible under `localhost:8080`.

## Build

The application can be built using the following command:

```
gradlew clean build
```

Start your application with the following command - here with the profile `production`:

```
java -Dspring.profiles.active=production -jar ./build/libs/htmx-0.0.1-SNAPSHOT.jar
```

If required, a Docker image can be created with the Spring Boot plugin. Add `SPRING_PROFILES_ACTIVE=production` as environment variable when running the container.

```
gradlew bootBuildImage --imageName=io.bootify/htmx
```

## Further readings

* [Gradle user manual](https://docs.gradle.org/)  
* [Spring Boot reference](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/)  
* [Spring Data JPA reference](https://docs.spring.io/spring-data/jpa/reference/jpa.html)
* [Thymeleaf docs](https://www.thymeleaf.org/documentation.html)  
* [Bootstrap docs](https://getbootstrap.com/docs/5.3/getting-started/introduction/)  
* [Htmx in a nutshell](https://htmx.org/docs/)  
