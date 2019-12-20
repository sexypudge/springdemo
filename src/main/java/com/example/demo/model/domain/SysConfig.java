package com.example.demo.model.domain;

import javax.persistence.*;

@Entity
@Table(name = "user_spring")
public class SysConfig {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public SysConfig(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Column(nullable = false)
    private String key;

    @Column(nullable = false)
    private String value;

    public Long getId() {
        return id;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
