package com.t09.jibao.domain;


import lombok.Data;
import javax.persistence.*;
@Entity
@Table(name = "user")
@Data
public class User {

    @Id
    @GeneratedValue
    private Long id;

    //name属性为表的字段名。length为字段的长度
    @Column(length = 30, name = "userId")
    private String userId;

    @Column(name = "userName", length = 20, columnDefinition="varchar(100) COMMENT '用户名'")
    private String userName;

    @Column(name = "phone", length = 20)
    private String phone;

    @Column(name = "password", length = 30)
    private String password;

    @Column(name = "userRealName", length = 20)
    private String userRealName;

    @Column(name = "address", length = 20)
    private String address;
}

