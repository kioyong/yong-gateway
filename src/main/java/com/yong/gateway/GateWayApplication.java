package com.yong.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;


@SpringBootApplication
@EnableZuulProxy
@EnableOAuth2Client
public class GateWayApplication  {

    public static void main(String[] args) {
        SpringApplication.run(GateWayApplication.class, args);
    }


}

