package utez.edu.mx.unidad3.utils;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;

public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info()
                .title("API REST de almacenes")
                .description("Documentacion de los endpoints del servicio de almacenes")
                .version("V1.0")
        );
    }
}
