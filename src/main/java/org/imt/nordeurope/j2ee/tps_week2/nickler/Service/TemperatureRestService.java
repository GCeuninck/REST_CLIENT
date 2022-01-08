package org.imt.nordeurope.j2ee.tps_week2.nickler.Service;

import org.imt.nordeurope.j2ee.tps_week2.nickler.Model.Countries;
import org.imt.nordeurope.j2ee.tps_week2.nickler.Model.Temperature;
import org.imt.nordeurope.j2ee.tps_week2.nickler.Model.TemperatureByCountry;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TemperatureRestService implements ITemperatureRestService{

    static final String URL_Temperature = "http://localhost:9000/temperature/";

    public Countries getAll(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(URL_Temperature, Countries.class);
    }

    public TemperatureByCountry getTemperatureOfCountry(String country){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(URL_Temperature + country, TemperatureByCountry.class);
    }

}
