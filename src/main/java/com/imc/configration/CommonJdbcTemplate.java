package com.imc.configration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * @author luoly
 * @date 2018/10/22 11:56
 * @description
 */
@Configuration
public class CommonJdbcTemplate {

    @Bean("druidJdbcTemplate")
    public JdbcTemplate jdbcTemplate(@Qualifier("druidDataSource") DataSource dataSource) {
        JdbcTemplate druidJdbcTemplate = new JdbcTemplate(dataSource);
        return druidJdbcTemplate;
    }

    @Bean("tomcatJdbcTemplate")
    public JdbcTemplate tomcatJdbcTemplate(@Qualifier("tomcatJdbcDataSource") DataSource dataSource) {
        JdbcTemplate tomcatJdbcTemplate = new JdbcTemplate(dataSource);
        return tomcatJdbcTemplate;
    }

    @Bean("dbcpTemplate")
    public JdbcTemplate dbcpTemplate(@Qualifier("dbcpDataSource") DataSource dataSource) {
        JdbcTemplate dbcpTemplate = new JdbcTemplate(dataSource);
        return dbcpTemplate;
    }

    @Bean("c3p0Template")
    public JdbcTemplate c3p0Template(@Qualifier("c3p0DataSource") DataSource dataSource) {
        JdbcTemplate c3p0Template = new JdbcTemplate(dataSource);
        return c3p0Template;
    }

    @Bean("hikariTemplate")
    public JdbcTemplate hikariTemplate(@Qualifier("hikariDataSource") DataSource dataSource) {
        JdbcTemplate hikariTemplate = new JdbcTemplate(dataSource);
        return hikariTemplate;
    }

}
