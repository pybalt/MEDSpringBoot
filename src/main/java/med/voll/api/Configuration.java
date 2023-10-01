package med.voll.api;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * This is an example of a CORS configuration.
 * CORS stands for Cross-Origin Resource Sharing.
 * It is a common error to have when you are trying to access a resource from a different origin.
 * Common issue when developing an API.
 */
@org.springframework.context.annotation.Configuration
public class Configuration implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(org.springframework.web.servlet.config.annotation.CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:8080")
                .allowedMethods("GET","POST","PUT","DELETE","OPTIONS","HEAD","TRACE","CONNECT");
    }
}
