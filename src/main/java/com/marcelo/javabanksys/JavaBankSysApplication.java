package com.marcelo.javabanksys;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "National Bank Application",
				description = "Back-end Rest APIs for National Bank",
				version = "v1.0",
				contact = @Contact(
						name = "Marcelo Abreu",
						email = "marceloabr.work@gmail.com",
						url = "https://github.com/marceloabreu-projects/bank-app-backend"
				),
				license = @License(
						name = "MarceloAbreu-Projects",
						url = "https://github.com/marceloabreu-projects/bank-app-backend"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "National Bank Official Documentation",
				url = "https://github.com/marceloabreu-projects/bank-app-backend"
		)
)
public class JavaBankSysApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaBankSysApplication.class, args);
	}

}
