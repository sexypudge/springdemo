package com.example.demo.controller;

import com.example.demo.ExtraConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/v1/controller")
public class Controller {

    @Autowired
    private ExtraConfig extraConfig;

    @Autowired
    private ExtraConfig.Jwt jwt;

    @GetMapping(value = "/hello")
    public Map<String, String> hello(){
        Map<String, String> map = new HashMap<>();
        map.put("hello", jwt.getSecret());
        map.put("luongnv", extraConfig.getLuongnv());
        return map;
    }
}
