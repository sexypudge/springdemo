package com.example.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

//    @Value("${spring.datasource.jndi-name}")
//    private String primaryJndiName;
//
//    private JndiDataSourceLookup lookup = new JndiDataSourceLookup();
//
//    @Primary
//    @Bean(destroyMethod = "") // destroy method is disabled for Weblogic update app ability
//    public DataSource primaryDs() {
//        return lookup.getDataSource(primaryJndiName);
//    }
//
//    @Bean
//    public DataSource dataSource() {
//        final JndiDataSourceLookup dsLookup = new JndiDataSourceLookup();
//        dsLookup.setResourceRef(true);
//        DataSource dataSource = dsLookup.getDataSource("jdbc/yourJdbcGoesHere");
//        return dataSource;
//    }
}
