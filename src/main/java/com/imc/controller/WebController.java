package com.imc.controller;

import com.alibaba.druid.support.logging.Log;
import com.alibaba.druid.support.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author luoly
 * @date 2018/10/17 20:08
 * @description
 */

//@Controller
@RestController
@RequestMapping(value = "/springbootdemo")
public class WebController {

    private static Log log = LogFactory.getLog(WebController.class);

    @Autowired @Qualifier("druidJdbcTemplate")
    private JdbcTemplate druidJdbcTemplate;

    @Autowired @Qualifier("tomcatJdbcTemplate")
    private JdbcTemplate tomcatJdbcTemplate;

    @Autowired @Qualifier("dbcpTemplate")
    private JdbcTemplate dbcpTemplate;

    @Autowired @Qualifier("c3p0Template")
    private JdbcTemplate c3p0Template;

    @Autowired @Qualifier("hikariTemplate")
    private JdbcTemplate hikariTemplate;

    /**
     * 若页面上需要展示返回的内容则ResponseBody注解需要加上,或者在当前class上把Controller换成RestController
     * @return
     */
    @RequestMapping(value = "/hello")
//    @ResponseBody
    public Object test() {
        System.out.println("进入controller------>");
        System.out.println(this.getClass().getResource("/").getPath());
        //druid连接池
//        List<Map<String, Object>> list = druidJdbcTemplate.queryForList("SELECT * from tb_shop");

        //tomcat连接池
//        List<Map<String, Object>> list = tomcatJdbcTemplate.queryForList("SELECT * from tb_shop");

        //dbcp连接池
//        List<Map<String, Object>> list = dbcpTemplate.queryForList("SELECT * from tb_shop");

        //c3p0连接池
//        List<Map<String, Object>> list = c3p0Template.queryForList("SELECT * from tb_shop");

        //hikari连接池
        List<Map<String, Object>> list = hikariTemplate.queryForList("SELECT * from supplier");

        log.info("执行结果-->" + list);
        return list;
    }

}
