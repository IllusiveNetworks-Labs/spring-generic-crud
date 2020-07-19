package illusive.networks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class SpringGenericCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringGenericCrudApplication.class, args);
	}

}
