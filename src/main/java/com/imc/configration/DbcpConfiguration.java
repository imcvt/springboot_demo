package com.imc.configration;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import org.apache.commons.dbcp.BasicDataSource;
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
@PropertySource(value = "classpath:dbcp.properties")
public class DbcpConfiguration {

    private static final Log log = LogFactory.getLog(DbcpConfiguration.class);

    @Bean(destroyMethod = "close",name = "dbcpDataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource dbcpDataSource() {

        BasicDataSource basicDataSource = new BasicDataSource();
        log.info("dbcp连接池已创建-->" + basicDataSource);
        return basicDataSource;
    }
}
