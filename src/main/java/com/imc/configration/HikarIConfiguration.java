package com.imc.configration;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

/**
 * @author luoly
 * @date 2018/10/22 11:52
 * @description
 */

@Configuration
@PropertySource(value = "classpath:hikari.properties")
public class HikarIConfiguration {

    private static final Log log = LogFactory.getLog(HikarIConfiguration.class);

    @Bean("hikariDataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource hikariDataSource() {
        HikariDataSource hikariDataSource = new HikariDataSource();
        log.info("hikari连接池已创建-->" + hikariDataSource);
        return hikariDataSource;
    }
}
