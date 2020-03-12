package edu.eci.arep.formapi;

/**
 * ChillParkAPIApplication
 */

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
/*@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class,HibernateJpaAutoConfiguration.class})*/
@ComponentScan(basePackages  = {"edu.eci.arep.form.services","edu.eci.arep.form.controllers"})
@EnableJpaRepositories("edu.eci.arep.form.repository")
@EntityScan("edu.eci.arep.form.model")
public class APIApplication {

    public static void main(String[] args) {
		SpringApplication.run(APIApplication.class, args);
    }
    
}