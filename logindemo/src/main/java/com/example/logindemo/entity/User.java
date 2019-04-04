package com.example.logindemo.entity;

import javax.persistence.*;

/**
 * @author:guoxin
 * @date:2019/3/20 15:34
 * @description:
 */
@Entity
@Table(name="tb_user")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator="ID_SEQ")
    @SequenceGenerator(name = "ID_SEQ",sequenceName="user_idauto",initialValue=170005,allocationSize=1)
    @Column(name="userid")
    private Integer userid;
    @Column(name="loginname")
    private String loginname;
    @Column(name="password")
    private String password;
    @Column(name = "email")
    private String email;
    @Column(name = "status")
    private Integer status;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
