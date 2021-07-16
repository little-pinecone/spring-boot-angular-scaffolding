package in.keepgrowing.springbootangularscaffolding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringBootAngularScaffoldingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAngularScaffoldingApplication.class, args);
	}
}
