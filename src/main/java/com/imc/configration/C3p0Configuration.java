package com.imc.configration;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import com.mchange.v2.c3p0.ComboPooledDataSource;
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
@PropertySource(value = "classpath:c3p0.properties")
public class C3p0Configuration {

    private static final Log log = LogFactory.getLog(C3p0Configuration.class);

    @Bean(destroyMethod = "close",name = "c3p0DataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource c3p0DataSource() {

        ComboPooledDataSource comboPooledDataSource = new ComboPooledDataSource();
        log.info("c3p0连接池已创建-->" + comboPooledDataSource);
        return comboPooledDataSource;
    }
}
