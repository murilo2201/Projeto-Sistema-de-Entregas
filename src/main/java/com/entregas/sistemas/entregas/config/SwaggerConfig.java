package com.entregas.sistemas.entregas.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("📦 API de Sistema de Entregas")
                        .version("1.0")
                        .description("API para gerenciar clientes, entregadores e pedidos de entrega.")
                        .contact(new Contact()
                                .name("Murilo França")
                                .email("murilofs.franca@gmail.com")
                                .url("https://github.com/murilo2201"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0")));
    }
}

