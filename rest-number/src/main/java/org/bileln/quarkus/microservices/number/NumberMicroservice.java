package org.bileln.quarkus.microservices.number;

import org.eclipse.microprofile.openapi.annotations.ExternalDocumentation;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
@OpenAPIDefinition(
        info = @Info(
                title = "Number API",
                description = "This microservice generates ISBN book numbers",
                version = "1.0",
                contact = @Contact(name = "@Bilel - Linkedin", url = "https://www.linkedin.com/in/bilel-neji")),
        externalDocs = @ExternalDocumentation(url = "https://github.com/Bilel-NEJI", description = "See other project on GitHub"),
        tags = {
                 @Tag(name = "api", description = "Public API that can be used by anybody"),
                 @Tag(name = "numbers", description = "Anybody interested in numbers")
        }
)
public class NumberMicroservice extends Application {
}
