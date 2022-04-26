package com.example.pricestable.config;

import java.time.format.DateTimeFormatter;

import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.pricestable.utils.Constants;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;

/**
 * The Class RbRAppConfig.
 */
@Configuration
public class PricesAppConfig {

    /**
     * Json customizer.
     *
     * @return the jackson 2 object mapper builder customizer
     */
    @Bean
    public Jackson2ObjectMapperBuilderCustomizer jsonCustomizer() {
        return builder -> {
            builder.indentOutput(true);
            // Local date
            builder.simpleDateFormat(Constants.DATE_FORMAT);
            builder.serializers(new LocalDateSerializer(DateTimeFormatter.ofPattern(Constants.DATE_FORMAT)));
            builder.deserializers(new LocalDateDeserializer(DateTimeFormatter.ofPattern(Constants.DATE_FORMAT)));

            // Local date time
            builder.serializers(new LocalDateTimeSerializer(DateTimeFormatter.ofPattern(Constants.DATE_TIME_FORMAT)));
            builder.deserializers(
                    new LocalDateTimeDeserializer(DateTimeFormatter.ofPattern(Constants.DATE_TIME_FORMAT)));
        };
    }

}
