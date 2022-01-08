package org.imt.nordeurope.j2ee.tps_week2.nickler.Model;

import java.util.List;

public class TemperatureByCountry {
    private String country;
    private List<Temperature> temperatures;

    public TemperatureByCountry() {
    }

    public TemperatureByCountry(String country, List<Temperature> temperatures) {
        this.country = country;
        this.temperatures = temperatures;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Temperature> getTemperatures() {
        return temperatures;
    }

    public void setTemperatures(List<Temperature> temperatures) {
        this.temperatures = temperatures;
    }
}
