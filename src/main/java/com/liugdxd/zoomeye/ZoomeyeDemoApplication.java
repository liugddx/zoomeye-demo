package com.liugdxd.zoomeye;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author liugd
 */
@SpringBootApplication
@EnableSwagger2
public class ZoomeyeDemoApplication {

	public static void main(String[] args) {

		System.setProperty("es.set.netty.runtime.available.processors", "false");
		SpringApplication.run(ZoomeyeDemoApplication.class, args);
	}

}
