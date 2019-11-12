package com.example.demo.config;


import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.integration.IntegrationProperties.Jdbc;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class AppConfig {

	@ConfigurationProperties(prefix = "spring.datasource")
	@Bean
	public DataSource dataSource() {
		
		return DataSourceBuilder.create().build();
	}
	
	@Bean
	public JdbcTemplate template() {
		
		return new JdbcTemplate(dataSource());
		
	}
}
