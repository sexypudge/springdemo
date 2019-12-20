package com.example.demo.config;
//
//import com.example.demo.model.domain.SysConfig;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.env.EnvironmentPostProcessor;
//import org.springframework.boot.logging.DeferredLog;
//import org.springframework.context.ApplicationEvent;
//import org.springframework.context.ApplicationListener;
//import org.springframework.core.env.ConfigurableEnvironment;
//import org.springframework.core.env.MapPropertySource;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.jdbc.datasource.lookup.JndiDataSourceLookup;
//import org.springframework.stereotype.Component;
//
//import javax.sql.DataSource;
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.HashMap;
//import java.util.Map;
//
//
//public class AutoLoadEnvironmentPostProcessor implements EnvironmentPostProcessor {
//
//    private static final String PROPERTY_SOURCE_NAME = "databaseProperties";
//
//    private static final DeferredLog log = new DeferredLog();
//
//    private static JdbcTemplate jdbcTemplate;
//
//    static {
//        JndiDataSourceLookup dataSourceLookup = new JndiDataSourceLookup();
//        DataSource dataSource = dataSourceLookup.getDataSource("java:comp/env/jdbc/myDataSource");
//        jdbcTemplate.setDataSource(dataSource);
//    }
//
//    @Override
//    public void postProcessEnvironment(ConfigurableEnvironment environment, SpringApplication application) {
//        try{
//            Map<String, Object> propertySource = jdbcTemplate.queryForMap("SELECT * FROM SYS_CONFIG", new RowMapper<SysConfig>() {
//                @Override
//                public SysConfig mapRow(ResultSet rs, int i) throws SQLException {
//                    return new SysConfig(rs.getString("KEY"), rs.getString("VALUE"));
//                }
//            });
//            environment.getPropertySources().addFirst(new MapPropertySource(PROPERTY_SOURCE_NAME, propertySource));
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }
//
//}
