package br.com.pamcary.paineisgr.DAO.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class OracleDataSourceConfig {

	@Bean
	@Primary
	@ConfigurationProperties(prefix="spring.oracle.datasource")
	public DataSourceProperties oracleDataSourceProperties() {
		return new DataSourceProperties();
	}
	
	@Bean
	@Primary
	@ConfigurationProperties(prefix="spring.oracle.datasource.configuration")
	public HikariDataSource oracleDataSource() {
		return oracleDataSourceProperties().initializeDataSourceBuilder()
				.type(HikariDataSource.class).build();
	}
	
}
