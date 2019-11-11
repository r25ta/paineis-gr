package br.com.pamcary.paineisgr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"br.com.pamcary.paineisgr"})
public class PaineisGrApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(PaineisGrApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(PaineisGrApplication.class);
	}
}
