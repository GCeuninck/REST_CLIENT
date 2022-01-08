package org.imt.nordeurope.j2ee.tps_week2.nickler;

import org.imt.nordeurope.j2ee.tps_week2.nickler.Model.Countries;
import org.imt.nordeurope.j2ee.tps_week2.nickler.Model.Temperature;
import org.imt.nordeurope.j2ee.tps_week2.nickler.Model.TemperatureByCountry;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SpringBootApplication
public class RestClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestClientApplication.class, args);
	}

}
