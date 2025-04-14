package com.fofoalerts.swagger;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(
                title = "FofoAlerts API",
                version = "1.1",
                description = "Sistema de notificacoes solidaria entre primos e devs estressados",
                contact = @Contact(name = "Rubem & Tiago Devs", email = "apoio@fofoalerts.dev"),
                license = @License(name = "Apache 2.0", url = "http://springdoc.org")
        )
)

@Configuration
public class SwaggerConfig {
}
