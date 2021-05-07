package za.co.jaliatechologies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class GoogleApiGeocodingApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoogleApiGeocodingApplication.class, args);
	}

}
