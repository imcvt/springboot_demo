package com.imc.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author luoly
 * @date 2018/10/23 11:42
 * @description
 */
@Entity
@Table(name = "Supplier")
@Getter
@Setter
public class Supplier implements Serializable{

    public Supplier() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // 主键ID
    private String name; // 姓名
    @Column(name = "createTime")
    private Date createTime;
    private Integer sex;
    private Integer age;

}
