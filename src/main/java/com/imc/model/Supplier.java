package com.imc.model;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.util.Date;

/**
 * @author luoly
 * @date 2018/10/23 11:42
 * @description
 */
@Getter
@Setter
public class Supplier implements Serializable{

    public Supplier() {
    }

    private Long id; // 主键ID
    private String name; // 姓名
    private Date createTime;
    private Integer sex;
    private Integer age;

}
