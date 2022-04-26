package com.example.pricestable.config;

import javax.sql.DataSource;

import org.flywaydb.core.Flyway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

/**
 * The Class FlywayConfiguration.
 */
@Configuration
public class FlywayConfiguration {

    /**
     * Instantiates a new flyway configuration.
     *
     * @param dataSource
     *            the data source
     */
    @Autowired
    public FlywayConfiguration(DataSource dataSource) {
        Flyway.configure().baselineOnMigrate(true).dataSource(dataSource).load().migrate();
    }
}
