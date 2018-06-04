package org.sbelei.harvester;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.social.config.annotation.EnableSocial;

@SpringBootApplication
@EnableSocial
@ComponentScan("org.sbelei.harvester")
public class HarvesterApplication {

	public static void main(String[] args) {
		SpringApplication.run(HarvesterApplication.class, args);
	}
}
