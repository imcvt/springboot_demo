package com.imc.configration;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author luoly
 * @date 2018/10/22 11:52
 * @description
 */

@Configuration
@PropertySource(value = "classpath:tomcat.properties")
public class TomcatJdbcConfiguration {

    private static final Log log = LogFactory.getLog(TomcatJdbcConfiguration.class);

    @Bean("tomcatJdbcDataSource")
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource tomcatJdbcDataSource() {
        DataSource tomcatJdbcDataSource = new DataSource();
        log.info("tomcat连接池已创建-->" + tomcatJdbcDataSource);
        return tomcatJdbcDataSource;
    }

}
