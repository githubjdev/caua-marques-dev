package caua.dev.springboot.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "caua.dev.springboot.*")
@EntityScan(basePackages = "caua.dev.springboot.model")
@ComponentScan(basePackages = "caua.dev.springboot.*")
@EnableJpaRepositories(basePackages = "caua.dev.springboot.repository")
public class SpringBootAppRun {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppRun.class, args);
	}

}
