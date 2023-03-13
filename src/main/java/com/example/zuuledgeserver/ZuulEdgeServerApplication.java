package com.example.zuuledgeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
import org.springframework.web.bind.annotation.CrossOrigin;

@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
@EnableZuulProxy
@CrossOrigin(origins = "*", maxAge = 3600) //Farklı serverlardan gelen talepleri kabul etmeye yarar. * değeri herhangi bir
                                           // origin değerine izin verildiğini gösterir.
public class ZuulEdgeServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulEdgeServerApplication.class, args);
	}

}
