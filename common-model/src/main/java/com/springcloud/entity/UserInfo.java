package com.springcloud.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@Table(name = "t_user_info")
@JacksonXmlRootElement
public class UserInfo {

    @Id
    private Long id;

    @Column("name")
    private String name;

    @Column("gender")
    private Character gender;

    @Column("age")
    private Integer age;

    @Column("phone")
    private String phone;

    @Column("email")
    private String email;

    @Column("address")
    private String address;

    @Column("create_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createTime;

    @Column("create_by")
    private String createBy;

    @Column("update_time")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updateTime;

    @Column("update_by")
    private String updateBy;

    @Column("version")
    private Integer version;

    @Column("is_deleted")
    private Integer isDeleted;
}
