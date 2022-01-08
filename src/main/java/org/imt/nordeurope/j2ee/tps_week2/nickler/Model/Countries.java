package org.imt.nordeurope.j2ee.tps_week2.nickler.Model;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class Countries {
    private List<TemperatureByCountry> temperatures;

    public Countries() {
    }

    public Countries(List<TemperatureByCountry> temperatures) {
        this.temperatures = temperatures;
    }

    public List<TemperatureByCountry> getTemperatures() {
        return temperatures;
    }

    public void setTemperatures(List<TemperatureByCountry> temperatures) {
        this.temperatures = temperatures;
    }


}
