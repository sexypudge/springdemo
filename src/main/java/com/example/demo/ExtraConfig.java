package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:extra-configuration.properties")
@ConfigurationProperties(prefix = "extra")
public class ExtraConfig {

    private String luongnv;

    public String getLuongnv() {
        return luongnv;
    }

    public void setLuongnv(String luongnv) {
        this.luongnv = luongnv;
    }

    @Component
    @PropertySource("classpath:extra-configuration.properties")
    public class Jwt {

        private String secret;

        private long expirationTime;

        private String issuer;

        // ... getter and setters


        public String getSecret() {
            return secret;
        }

        public void setSecret(String secret) {
            this.secret = secret;
        }

        public long getExpirationTime() {
            return expirationTime;
        }

        public void setExpirationTime(long expirationTime) {
            this.expirationTime = expirationTime;
        }

        public String getIssuer() {
            return issuer;
        }

        public void setIssuer(String issuer) {
            this.issuer = issuer;
        }
    }
}
