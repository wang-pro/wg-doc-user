package com.wg.doc.user.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "t_user_info")
@Data
@ApiModel
@JsonIgnoreProperties(value = { "hibernateLazyInitializer", "handler" })
public class UserInfo {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @ApiModelProperty(value = "标识")
    private long id;

    @Column
    @ApiModelProperty(value = "用户名")
    private String userName;

    @Column
    @ApiModelProperty(value = "密码")
    private String password;

    @Column
    @ApiModelProperty(value = "邮箱")
    private String email;

    @Column
    @ApiModelProperty(value = "电话")
    private String tel;


}
