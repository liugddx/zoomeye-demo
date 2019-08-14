package com.liugdxd.zoomeye;

import com.liugdxd.zoomeye.configuration.DeleteIndexListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author liugd
 */
@SpringBootApplication
@EnableSwagger2
@EnableScheduling
public class ZoomeyeDemoApplication {

	public static void main(String[] args) {

		System.setProperty("es.set.netty.runtime.available.processors", "false");
		SpringApplication application = new SpringApplication(ZoomeyeDemoApplication.class);
		application.addListeners(new DeleteIndexListener());
		application.run(args);

	}

}
