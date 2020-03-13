package com.example.demo.model.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "user_spring")
@JsonIgnoreProperties(ignoreUnknown = true)
public class User extends DateAudit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    public void setId(Long id) {
        this.id = id;
    }

//    private List<SysConfig> sysConfigs;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public List<SysConfig> getSysConfigs() {
//        return sysConfigs;
//    }
//
//    public void setSysConfigs(List<SysConfig> sysConfigs) {
//        this.sysConfigs = sysConfigs;
//    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
