package com.example.pricestable.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * The Class CorsGlobal.
 */
@Configuration
public class CorsGlobal {

    /**
     * Cors filter.
     *
     * @return the cors filter
     */
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();

        // Set AllowCredentials
        config.setAllowCredentials(true);
        // Set AllowedOrigin
        config.addAllowedOrigin("*");
        // Set AllowedHeader
        config.addAllowedHeader("*");
        // Set method
        config.addAllowedMethod("OPTIONS");
        config.addAllowedMethod("GET");
        config.addAllowedMethod("POST");
        config.addAllowedMethod("PUT");
        config.addAllowedMethod("DELETE");
        // Set registerCorsConfiguration
        source.registerCorsConfiguration("/**", config);

        return new CorsFilter(source);
    }
}
