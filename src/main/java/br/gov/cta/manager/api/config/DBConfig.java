package br.gov.cta.manager.api.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
@MapperScan("br.gov.cta.manager.api.mapper")
public class DBConfig {
    @Bean
    @Primary
    @ConfigurationProperties("spring.app.datasource")
    public DataSource dataSource() {
        return DataSourceBuilder.create().build();
    }
}
